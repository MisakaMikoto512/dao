package com.mzy.vo;

import java.util.ArrayList;
import java.util.List;

public class stationSearchVO {
    List<SearchForTravel> result;
    stationSearchVO(){
        result =new ArrayList<>();
        result.add(new SearchForTravel());
        SearchForTravel searchForTravel=new SearchForTravel();
        searchForTravel.train_id="G123";
        result.add(searchForTravel);
    }
}
