package com.mzy.vo;

import lombok.Data;

@Data
public class CreateStation {
    String name;
    String city;
    String province;

    public CreateStation() {
        this.name="广州南";
        this.city="广州";
        this.province="广东";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
