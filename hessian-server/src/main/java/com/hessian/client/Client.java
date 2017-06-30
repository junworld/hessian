package com.hessian.client;

import com.caucho.hessian.client.HessianProxyFactory;
import com.hessian.api.HessianInterface;

import java.net.MalformedURLException;

/**
 * Created by zhaojun5 on 2017/6/27.
 */
public class Client {

    public static void main(String[] args) throws MalformedURLException {
//        String url = "http://hessian.caucho.com/test/test";
        String url = "http://localhost:8080/hello";

        HessianProxyFactory factory = new HessianProxyFactory();
        HessianInterface basic = (HessianInterface) factory.create(HessianInterface.class, url);

        System.out.println("hello(): " + basic.hello());
    }

}
