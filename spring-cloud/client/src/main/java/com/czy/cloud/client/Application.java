package com.czy.cloud.client;

import com.czy.cloud.ribbon.config.MyRibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName Application
 * @Description: TODO
 * @Author chenzeyao
 * @Date 2021/1/19
 **/
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "provider",configuration = MyRibbonConfig.class) //name:应用ID
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
