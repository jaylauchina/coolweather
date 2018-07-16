package com.example.coolweather.gson;

/**
 * Created by liujie on 2018-07-14.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
