package com.rztong.mo.rongzitong.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.TextView;

import com.rztong.mo.rongzitong.BR;


/**
 * Created by royal on 04/05/2017.
 */

public class SplashBean extends BaseObservable{
    private String id;
    private String name;
    private String phone;

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        notifyPropertyChanged(BR.phone);
    }

}
