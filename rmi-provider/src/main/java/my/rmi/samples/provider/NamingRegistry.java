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
import java.rmi.registry.LocateRegistry;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 类NamingRegistry.java的实现描述：发布 服务前需要启动 注册中心, 可通过LocateRegistry.createRegistry(port) 启动,
 * 通过  Naming.rebind 发布服务
 * @author wangbo 2018年1月2日 下午7:07:52
 * @date 2018年1月2日 下午7:07:52
 * @version V1.0
 */
public class NamingRegistry {
    private int port = 2020;

    public NamingRegistry() throws RemoteException {
        super();
        init();
    }

    public NamingRegistry(int port) throws RemoteException {
        super();
        this.port = port;
        init();
    }

    /**
     *
     * 启动注册中心
     * @author wangbo 2018年1月18日 上午9:43:15
     * @throws RemoteException
     */
    private void init() throws RemoteException {
        LocateRegistry.createRegistry(port);

    }

    public void registry(Map<String, Class> cs)
        throws RemoteException, MalformedURLException, InstantiationException, IllegalAccessException {
        for (Entry<String, Class> remote : cs.entrySet()) {
            registry((Remote)remote.getValue().newInstance(), remote.getKey());
        }
    }

    /**
     *
     * 注册服务
     * @author wangbo 2018年1月18日 上午10:28:14
     * @param r
     * @param name
     * @throws RemoteException
     * @throws MalformedURLException
     */
    private void registry(Remote r, String name) throws RemoteException, MalformedURLException {
        Naming.rebind("rmi://192.168.108.74:"+port+"/rmi/" + name, r);
    }

}
