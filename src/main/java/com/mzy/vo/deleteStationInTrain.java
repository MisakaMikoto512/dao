package com.mzy.vo;

import lombok.Data;

@Data
public class deleteStationInTrain {
    String train_id;
    String station;


    public deleteStationInTrain(String station, String train_id) {
        this.station = station;
        this.train_id = train_id;
    }

    public deleteStationInTrain() {
        this.train_id="G133";
        this.station="要删除的在线路内的车站";

    }

}
