package com.mzy.vo;

public class PassengerVO {
    String name;//姓名
    String id_card_number;//身份证
    String phone_number;//手机号
    String identity;//学生，成人，军人
    String seat_type;//返回这个人要买的座位类型
    public PassengerVO(String name, String id_card_number, String phone_number, String identity,String seat_type) {
        this.name = name;
        this.id_card_number = id_card_number;
        this.phone_number = phone_number;
        this.identity = identity;
        this.seat_type=seat_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_card_number() {
        return id_card_number;
    }

    public void setId_card_number(String id_card_number) {
        this.id_card_number = id_card_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getSeat_type() {
        return seat_type;
    }

    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }
}
