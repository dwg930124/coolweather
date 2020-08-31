package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @author: dwg
 * @date: 2020/8/31
 */
public class Province extends DataSupport {
    private int _id;
    private String provinceName;
    private int provinceCode;

    public Province() {
    }

    public Province(int _id, String provinceName, int provinceCode) {
        this._id = _id;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
