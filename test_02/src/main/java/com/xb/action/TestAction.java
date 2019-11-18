package com.xb.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

    public TestAction(){
        System.out.println("ok");
    }


    public String test(){
        System.out.println("ok");

        return "ok";

    }


}
