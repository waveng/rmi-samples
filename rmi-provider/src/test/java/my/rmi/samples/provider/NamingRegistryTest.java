/*
 * Copyright 2018 Sumpay.com All right reserved. This software is the confidential and proprietary information of
 * Sumpay.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Sumpay.com .
 */
package my.rmi.samples.provider;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 类NamingRegistryTest.java的实现描述：TODO 类实现描述
 *
 * @author wangbo 2018年1月2日 下午7:19:48
 * @date 2018年1月2日 下午7:19:48
 * @version V1.0
 */
public class NamingRegistryTest {
    /**
     * TODO 描述
     *
     * @author wangbo 2018年1月2日 下午7:20:36
     */
    @Test
    public void registry() {
        NamingRegistry registry = new NamingRegistry();
        Map<String, Class> cs = new HashMap<String, Class>();
        cs.put("calc", CalcImpl.class);
        cs.put("hello", HelloImpl.class);
        try {
            registry.registry(cs);
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
