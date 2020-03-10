package com.cdy.chat.controllers;


import com.cdy.api.sevice.chat.ChatSevice;
import com.cdy.base.util.bean.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private ChatSevice chatSevice;

    @RequestMapping("/demo")
    public RespBean hello(){
        return RespBean.success(chatSevice.sayHello());
    }
}
