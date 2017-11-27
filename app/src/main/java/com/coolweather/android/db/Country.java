package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Cherry0 0 on 2017/11/27.
 */

public class Country extends DataSupport {
    private int id;
    private String CountryName;
    private int WeatherId;
    private int CityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public int getWeatherId() {
        return WeatherId;
    }

    public void setWeatherId(int weatherId) {
        WeatherId = weatherId;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }

}
