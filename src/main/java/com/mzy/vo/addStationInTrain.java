package com.mzy.vo;

import lombok.Data;

@Data
public class addStationInTrain {
    String date;
    String train_id;
    String station;
    int station_order;
    int day;
    String depart_time;
    String arrive_time;
    String duration;
    int distance;

    public addStationInTrain(String train_id, String station, int station_order, int day, String depart_time, String arrive_time, String duration, int distance) {
        this.train_id = train_id;
        this.station = station;
        this.station_order = station_order;
        this.day = day;
        this.depart_time = depart_time;
        this.arrive_time = arrive_time;
        this.duration = duration;
        this.distance = distance;
    }

    public addStationInTrain() {
        this.train_id = "G133";
        this.station = "新增的车站名";
        this.station_order = 3;
        this.day = 1;
        this.depart_time = "07:00";
        this.arrive_time = "08:01";
        this.duration = "1小时1分";
        this.distance = 1000;
    }
}
