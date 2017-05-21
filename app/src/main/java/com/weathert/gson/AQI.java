package com.weathert.gson;

/**
 * Created by Thinking on 2017/5/21.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
