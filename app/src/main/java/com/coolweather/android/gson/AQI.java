package com.coolweather.android.gson;

/**
 * Created by zhuang on 2018/2/5.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
