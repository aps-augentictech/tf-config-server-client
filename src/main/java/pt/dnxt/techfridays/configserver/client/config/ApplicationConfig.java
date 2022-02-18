package pt.dnxt.techfridays.configserver.client.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Copyright DNXT, Lda. 2022
 * 
 * @category Tech Fridays
 * @version 1.0
 * @since 2022/02/18
 * @author António Pedro Santos <mailto:aps@digitalnext.pt>
 */
@Configuration
@EnableScheduling
@ComponentScan({ "pt.dnxt.configdemo" })
public class ApplicationConfig {
}
