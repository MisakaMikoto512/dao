package com.mzy.enumpackege;

public enum orderMessage {
    RESERVE_SUCCESS(0,"订票成功"),
    RESERVE_ERROR(1,"输入信息有误或余票不足"),
    REFUND_SUCCESS(2,"退票成功")
    ;

    int code;
    String message;

    orderMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
