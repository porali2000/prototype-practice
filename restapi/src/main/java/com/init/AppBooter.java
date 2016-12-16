package com.init;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Porali_S on 12/14/2016.
 */
@EnableAutoConfiguration
@ComponentScan(basePackages ={ "com.*"})
public class AppBooter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppBooter.class, args);
    }
}
