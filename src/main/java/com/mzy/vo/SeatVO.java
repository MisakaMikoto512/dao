package com.mzy.vo;

public class SeatVO {
    String seat_type;
    int restTicket;
    int pirce;

    public SeatVO(String seat_type, int restTicket, int pirce) {
        this.seat_type = seat_type;
        this.restTicket = restTicket;
        this.pirce = pirce;
    }
    public SeatVO() {
        this.seat_type = "硬座";
        this.restTicket = 5;
        this.pirce = 20;
    }

    public String getSeat_type() {
        return seat_type;
    }

    public int getRestTicket() {
        return restTicket;
    }

    public int getPirce() {
        return pirce;
    }

    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }

    public void setRestTicket(int restTicket) {
        this.restTicket = restTicket;
    }

    public void setPirce(int pirce) {
        this.pirce = pirce;
    }
}
