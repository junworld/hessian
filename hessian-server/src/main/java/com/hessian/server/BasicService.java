package com.hessian.server;

import com.caucho.hessian.server.HessianServlet;
import com.hessian.api.BasicAPI;

/**
 * Created by zhaojun5 on 2017/6/28.
 */
public class BasicService extends HessianServlet implements BasicAPI {
    private String _greeting = "Hello, world";

    public void setGreeting(String greeting)
    {
        _greeting = greeting;
    }

    public String hello()
    {
        System.out.println("=================BasicService say Hello=================");
        return _greeting;
    }
}