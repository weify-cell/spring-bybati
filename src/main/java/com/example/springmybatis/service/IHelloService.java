package com.example.springmybatis.service;

import com.example.springmybatis.domain.po.UserPo;

import java.util.List;

public interface IHelloService {
    List<UserPo> selectAllUser();
    void addUser(String username,String age,String id);

    int updateUsers();
}
