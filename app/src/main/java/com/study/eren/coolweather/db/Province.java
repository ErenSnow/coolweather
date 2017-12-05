package com.study.eren.coolweather.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by smartOrange_5 on 2017/12/4.
 */

@Entity
public class Province {

    @Id(autoincrement = true)
    private long id;

    @Unique
    @NotNull
    private String provinceName;

    @Unique
    @NotNull
    private int provinceCode;

    @Generated(hash = 168672810)
    public Province(long id, @NotNull String provinceName, int provinceCode) {
        this.id = id;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }

    @Generated(hash = 1309009906)
    public Province() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return this.provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }


}
