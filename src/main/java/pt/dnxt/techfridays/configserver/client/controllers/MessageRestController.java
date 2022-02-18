package pt.dnxt.techfridays.configserver.client.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@RestController
@Setter
@Slf4j
@RefreshScope
@EnableConfigurationProperties
@ConfigurationProperties
public class MessageRestController {

    @Value("${message:Hello default}")
    private String message;

    // @Value("#{${imt_messages}}")
    private Map<String, String> imtMessages;

    @GetMapping("/message")
    public String getMessage() {
        return this.message;
    }

    @GetMapping("/errorMessage")
    public ResponseEntity<String> getErrorMessage(@RequestParam(name = "msg") String msg) {
        log.debug("Message: " + msg);
        log.debug(imtMessages != null ? imtMessages.toString() : "<<<>>>");

        return this.imtMessages != null ? ResponseEntity.ok(this.imtMessages.get(msg))
                : ResponseEntity.notFound().build();
    }

    @ConfigurationProperties("imt_messages")
    public Map<String, String> getImtMessages() {
        return this.imtMessages;
    }
}
