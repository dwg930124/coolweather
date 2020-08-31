package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @author: dwg
 * @date: 2020/8/31
 */
public class County extends DataSupport {
    private int _id;
    private String countyName;
    private int countyCode;

    public County() {
    }

    public County(int _id, String countyName, int countyCode) {
        this._id = _id;
        this.countyName = countyName;
        this.countyCode = countyCode;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }
}
