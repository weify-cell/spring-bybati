package com.example.springmybatis.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.springmybatis.service.IHelloService;
import com.example.springmybatis.service.Impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private IHelloService helloService;

    @PostMapping("selectAllUser")
    public String selectAllUser(){
        return JSONObject.toJSONString(helloService.selectAllUser());
    }

    @PostMapping("addUser")
    public String addUser(String name,String age,String id){
        helloService.addUser(name, age,id);
        return String.valueOf(true);
    }

    @PostMapping("updateUser")
    public String updateUser(){
        helloService.updateUsers();
        return String.valueOf(true);
    }
}
