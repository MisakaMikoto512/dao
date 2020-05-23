package com.mzy.vo;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
@Data
public class ReserveVO {
    String user_id;
    int travel_id;
    String date;
    List<PassengerVO> passengers;

    public ReserveVO(String user_id, int travel_id, String date, List<PassengerVO> passengers) {
        this.user_id = user_id;
        this.travel_id = travel_id;
        this.date = date;
        this.passengers = passengers;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public ReserveVO(int travel_id, String date, List<PassengerVO> passengers) {
        this.travel_id = travel_id;
        this.date = date;
        this.passengers = passengers;
    }
    public ReserveVO(){
        this.travel_id=123;
        this.date=LocalDateTime.now().toString();
        this.passengers=new ArrayList<>();
        passengers.add(new PassengerVO("张三","150621198303287859","15812345678","学生","硬座"));
        passengers.add(new PassengerVO("李四","230882197606106436","15812345679","成人","软卧"));
        user_id="admin";
    }

    public int getTravel_id() {
        return travel_id;
    }

    public void setTravel_id(int travel_id) {
        this.travel_id = travel_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<PassengerVO> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PassengerVO> passengers) {
        this.passengers = passengers;
    }
}
