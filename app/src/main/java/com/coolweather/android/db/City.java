package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @author: dwg
 * @date: 2020/8/31
 */
public class City extends DataSupport {
    private int _id;
    private String cityName;
    private int cityCode;

    public City() {
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public City(int _id, String cityName, int cityCode) {
        this._id = _id;
        this.cityName = cityName;
        this.cityCode = cityCode;
    }
}
