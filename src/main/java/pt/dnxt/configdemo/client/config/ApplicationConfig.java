package pt.dnxt.configdemo.client.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ComponentScan({ "pt.dnxt.configdemo" })
public class ApplicationConfig {
}
