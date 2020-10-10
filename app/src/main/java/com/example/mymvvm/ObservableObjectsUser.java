package com.example.mymvvm;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/**
 * Created by Administrator on 2020/9/29.
 */

public class ObservableObjectsUser extends BaseObservable {
    private String firstName;
    private String lastName;

    public ObservableObjectsUser() {
    }

    public ObservableObjectsUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

}
