package com.iwanvi.bookstore.appinterv2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages={"com.iwanvi.bookstore.appinterv2"})
@EnableSwagger2
@EnableEurekaClient
@EnableTransactionManagement
@EnableHystrix
@EnableHystrixDashboard
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("----------------system beg----------------");
        SpringApplication.run(Application.class, args);
        logger.info("----------------system end----------------");
    }
}
