package com.example.springmybatis.dao;


import com.example.springmybatis.domain.po.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HelloDao {
    List<UserPo> selectAllUser();
    void addUser(String username,String age,String id);
    int updateUsers(List<UserPo> users);
}
