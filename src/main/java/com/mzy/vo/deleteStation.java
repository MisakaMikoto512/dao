package com.mzy.vo;

import lombok.Data;

@Data
public class deleteStation {
    String station_name;

    public deleteStation(String station_name) {
        this.station_name = station_name;
    }
    public deleteStation() {
        this.station_name = "要删除的车站名";
    }
}
