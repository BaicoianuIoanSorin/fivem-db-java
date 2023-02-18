package com.database.fivem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FivemApplication {

    public static void main(String[] args) {
        SpringApplication.run(FivemApplication.class, args);
    }

}
