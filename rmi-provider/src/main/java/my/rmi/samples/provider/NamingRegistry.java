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
 * 类NamingRegistry.java的实现描述：TODO 类实现描述
 *
 * @author wangbo 2018年1月2日 下午7:07:52
 * @date 2018年1月2日 下午7:07:52
 * @version V1.0
 */
public class NamingRegistry {
    private int prot = 2020;

    public NamingRegistry() {
        super();
    }

    public NamingRegistry(int prot) {
        super();
        this.prot = prot;
    }

    private void init() throws RemoteException {
        LocateRegistry.createRegistry(prot);
    }

    public void registry(Map<String, Class> cs)
        throws RemoteException, MalformedURLException, InstantiationException, IllegalAccessException {
        init();
        for (Entry<String, Class> remote : cs.entrySet()) {
            registry((Remote)remote.getValue().newInstance(), remote.getKey());
        }
    }

    private void registry(Remote r, String name) throws RemoteException, MalformedURLException {
        Naming.rebind("rmi://192.168.108.74:2020/rmi/" + name, r);
    }

}
