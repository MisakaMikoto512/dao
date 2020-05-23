package com.mzy.vo;

import com.mzy.entity.Passenger;


public class UserVO {
    String user_id;//账户名
    String password;//密码
    String authority;//权限，1为普通，2为管理员
    Passenger passenger;//可以为null，表示未实名
    public UserVO(int l){
        this.user_id="admin";
        this.password="abc456";
        this.authority="管理员";
        passenger=new Passenger("欧阳锋","513436200005219421","13345678901","学生");
    }
    public UserVO(){

    }

}
