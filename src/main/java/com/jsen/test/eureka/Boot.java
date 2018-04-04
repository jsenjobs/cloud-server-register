package com.jsen.test.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 * </p>
 *
 * @author ${User}
 * @since 2018/4/3
 */
@SpringBootApplication
@EnableEurekaServer
public class Boot {
    public static void main(String[] args) {
        SpringApplication.run(Boot.class, args);
    }
}
