package com.mzy.entity;

import java.time.LocalTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
@TableName(value = "train1")
public class Train1 implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("ID")
    private String train_id;

    @TableField("Type")
    private String Type;

    @TableField("Station")
    private String station;

    @TableField("S_No")
    private Integer station_order;

    @TableField("Day")
    private Integer day;

    @TableField("A_Time")
    private String arrive_time;

    @TableField("D_Time")
    private String depart_Time;

    @TableField("R_Date")
    private String duration;

    @TableField("Distance")
    private Integer Distance;

    @TableField("P1")
    private String P1;

    @TableField("P2")
    private String P2;

    @TableField("P3")
    private String P3;

    @TableField("P4")
    private String P4;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTrain_id() {
        return train_id;
    }

    public void setTrain_id(String train_id) {
        this.train_id = train_id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Integer getStation_order() {
        return station_order;
    }

    public void setStation_order(Integer station_order) {
        this.station_order = station_order;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getArrive_time() {
        return arrive_time;
    }

    public void setArrive_time(String arrive_time) {
        this.arrive_time = arrive_time;
    }

    public String getDepart_Time() {
        return depart_Time;
    }

    public void setDepart_Time(String depart_Time) {
        this.depart_Time = depart_Time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getDistance() {
        return Distance;
    }

    public void setDistance(Integer distance) {
        Distance = distance;
    }

    public String getP1() {
        return P1;
    }

    public void setP1(String p1) {
        P1 = p1;
    }

    public String getP2() {
        return P2;
    }

    public void setP2(String p2) {
        P2 = p2;
    }

    public String getP3() {
        return P3;
    }

    public void setP3(String p3) {
        P3 = p3;
    }

    public String getP4() {
        return P4;
    }

    public void setP4(String p4) {
        P4 = p4;
    }
}
