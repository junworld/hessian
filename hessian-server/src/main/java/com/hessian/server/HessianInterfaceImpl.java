package com.hessian.server;

import com.caucho.hessian.server.HessianServlet;
import com.hessian.api.HessianInterface;

/**
 * Created by zhaojun5 on 2017/6/27.
 */
public class HessianInterfaceImpl extends HessianServlet implements HessianInterface {

    public String say(String message) {
        return message;
    }

    public int sum(int a, int b) {
        return 0;
    }

    public String hello()
    {
        System.out.println("=================HessianInterface say Hello=============");
        return "Hello Hessian！！！";
    }
}
