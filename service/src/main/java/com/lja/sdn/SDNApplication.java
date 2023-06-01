package com.lja.sdn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lja
 * @since 2023-06-1
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.lja"})
@MapperScan("com.lja.service")
public class SDNApplication {
    public static void main(String[] args) {
        SpringApplication.run(SDNApplication.class,args);
    }
}
