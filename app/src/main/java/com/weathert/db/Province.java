package com.weathert.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Thinking on 2017/5/21.
 */

public class Province extends DataSupport {

    private int id;


    private int provinceCode;


    private String provinceName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
