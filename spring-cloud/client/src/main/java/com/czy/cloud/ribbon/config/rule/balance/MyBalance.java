package com.czy.cloud.ribbon.config.rule.balance;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Configuration;

import java.util.List;

public class MyBalance implements ILoadBalancer {
    protected List<Server> servers;
    @Override
    public void addServers(List<Server> list) {
        servers = list;
        System.out.println("addServers");
    }

    @Override
    public Server chooseServer(Object o) {
        System.out.println("chooseServer");
        Server server = new Server("192.168.1.106",8062);
        return server;
    }

    @Override
    public void markServerDown(Server server) {
        System.out.println("markServerDown");
    }

    @Override
    public List<Server> getServerList(boolean b) {
        System.out.println("getServerList");
        return servers;
    }

    @Override
    public List<Server> getReachableServers() {
        System.out.println("getReachableServers");
        return servers;
    }

    @Override
    public List<Server> getAllServers() {
        System.out.println("getAllServers");
        return servers;
    }
}
