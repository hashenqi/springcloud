package com.czy.cloud.ribbon.config;


import com.czy.cloud.ribbon.config.rule.MyRule;
import com.czy.cloud.ribbon.config.rule.balance.MyBalance;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class MyRibbonConfig {

//    @Bean
//    public IRule getMyRule(){
//        System.out.println("aaa");
//        //自定义规则
//        MyRule myRule = new MyRule();
//        return myRule;
//    }
    @Bean
    public IRule getMyRule(){
        return new RoundRobinRule();
    }


}
