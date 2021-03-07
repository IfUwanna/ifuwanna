package com.ifuwanna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class IfuwannaApplication {



    public static void main(String[] args) {
        SpringApplication.run(IfuwannaApplication.class, args);
        Logger logger = LoggerFactory.getLogger(IfuwannaApplication.class);
        logger.info("jihun");
    }
}