package com.czy.cloud.ribbon.config.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.apache.commons.lang.math.RandomUtils;

import java.util.List;

public class MyRule extends AbstractLoadBalancerRule {


    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object key) {
        ILoadBalancer loadBalancer = this.getLoadBalancer(); //
        List<Server> allServers = loadBalancer.getAllServers();//获取服务列表
        int i = RandomUtils.nextInt(allServers.size());
        return allServers.get(i);
    }
}
