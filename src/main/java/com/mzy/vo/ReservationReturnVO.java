package com.mzy.vo;

public class ReservationReturnVO {
    int state;
    Long order_id;
    String message;

    public ReservationReturnVO(int state, String message,Long order_id) {
        this.state=state;
        this.message=message;
        this.order_id=order_id;
    }
}
