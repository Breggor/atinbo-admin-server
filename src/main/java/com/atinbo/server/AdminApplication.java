package com.atinbo.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.IOException;

/**
 * spring-boot-admin监控
 *
 * @author breggor
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}