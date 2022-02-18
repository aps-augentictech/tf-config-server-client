package pt.dnxt.techfridays.configserver.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright DNXT, Lda. 2022
 * 
 * @category Tech Fridays
 * @version 1.0
 * @since 2022/02/18
 * @author António Pedro Santos <mailto:aps@digitalnext.pt>
 */
@SpringBootApplication(scanBasePackages = "pt.dnxt.techfridays.configserver.client")
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
