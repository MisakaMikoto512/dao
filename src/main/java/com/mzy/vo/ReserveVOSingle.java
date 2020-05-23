package com.mzy.vo;

public class ReserveVOSingle {
    int travel_id;//行程在数据库的id，在查询那一步可以得到
    String date;//新增一个日期的参数
    String name;//姓名
    String id_card_num;//身份证号
    String phone_number;//手机号
    String identity;//特殊身份，一般为成人
    String SeatType;//座位类型

    public ReserveVOSingle(int travel_id, String date, String name, String id_card_num, String phone_number, String identity, String seatType) {
        this.travel_id = travel_id;
        this.date = date;
        this.name = name;
        this.id_card_num = id_card_num;
        this.phone_number = phone_number;
        this.identity = identity;
        SeatType = seatType;
    }
}
