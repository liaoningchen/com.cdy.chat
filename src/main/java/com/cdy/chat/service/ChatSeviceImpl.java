package com.cdy.chat.service;

import com.cdy.api.sevice.chat.ChatSevice;
import com.cdy.api.sevice.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatSeviceImpl implements ChatSevice {

    @Autowired
    private UserService userService;

    @Override
    public String sayHello() {
        return userService.hello();
    }
}
