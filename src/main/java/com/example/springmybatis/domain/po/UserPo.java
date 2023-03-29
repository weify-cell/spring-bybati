package com.example.springmybatis.domain.po;

public class UserPo {
    private String name;
    private String age;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public UserPo() {
    }

    public UserPo(String name, String age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
