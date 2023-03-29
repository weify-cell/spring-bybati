package com.example.springmybatis.service.Impl;

import com.example.springmybatis.dao.HelloDao;
import com.example.springmybatis.domain.po.UserPo;
import com.example.springmybatis.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class HelloServiceImpl implements IHelloService {


    @Autowired
    private HelloDao helloDao;


    @Override
    public List<UserPo> selectAllUser() {
        return helloDao.selectAllUser();
    }

    @Override
    public void addUser(String username, String age,String id) {
        helloDao.addUser(username, age,id);
    }

    @Override
    public int updateUsers() {
        UserPo userPo = new UserPo("", "20", "1");
        UserPo userPo1 = new UserPo("", "20", "2");
        List<UserPo> userPos = new ArrayList<>();
        userPos.add(userPo);
        userPos.add(userPo1);
        helloDao.updateUsers(userPos);
        return 0;
    }
}
