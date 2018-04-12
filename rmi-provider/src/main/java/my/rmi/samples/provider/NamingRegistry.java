/*
 * Copyright 2018 Sumpay.com All right reserved. This software is the confidential and proprietary information of
 * Sumpay.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Sumpay.com .
 */
package my.rmi.samples.provider;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * 类NamingRegistry.java的实现描述：发布 服务前需要启动 注册中心,
 * 可通过LocateRegistry.createRegistry(port) 启动, 通过 Naming.rebind 发布服务
 * 
 * @author wangbo 2018年1月2日 下午7:07:52
 * @date 2018年1月2日 下午7:07:52
 * @version V1.0
 */
public class NamingRegistry {
    private int    port = 2020;
    private String ip   = "127.0.0.1";

    public NamingRegistry(int port) throws RemoteException {
        super();
        this.port = port;
    }

    public NamingRegistry(String ip, int port) throws RemoteException {
        super();
        this.ip = ip;
        this.port = port;
    }

    public void registry(List<Class<?>> cs)
            throws RemoteException, MalformedURLException, InstantiationException, IllegalAccessException {
        for (Class<?> remote : cs) {
            Class<?>[] serviceName = remote.getInterfaces();
            registry((Remote) remote.newInstance(), serviceName[0].getName());
        }
    }

    /**
     * 注册服务
     * 
     * @author wangbo 2018年1月18日 上午10:28:14
     * @param remote
     * @param name
     * @throws RemoteException
     * @throws MalformedURLException
     */
    private void registry(Remote remote, String name) throws RemoteException, MalformedURLException {

        Naming.rebind(String.format("rmi://%s:%d/%s", ip, port, name), remote);
    }

}
