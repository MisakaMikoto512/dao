package com.mzy.vo;

import lombok.Data;

@Data
public class CreateTrain {
    String train_id;
    String depart_station;
    String arrive_station;
    String duration;
   int distance;

    public CreateTrain(String train_id, String depart_station, String arrive_station, String duration, int distance) {
        this.train_id = train_id;
        this.depart_station = depart_station;
        this.arrive_station = arrive_station;
        this.duration = duration;
        this.distance = distance;
    }

    public CreateTrain() {
        this.train_id = "G133";
        this.depart_station="新增车的起始站";
        this.arrive_station="新增车的终点站";
        this.distance=100;
        duration="x时x分";
    }

    public String getTrain_id() {
        return train_id;
    }

    public void setTrain_id(String train_id) {
        this.train_id = train_id;
    }

    public String getDepart_station() {
        return depart_station;
    }

    public void setDepart_station(String depart_station) {
        this.depart_station = depart_station;
    }

    public String getArrive_station() {
        return arrive_station;
    }

    public void setArrive_station(String arrive_station) {
        this.arrive_station = arrive_station;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
