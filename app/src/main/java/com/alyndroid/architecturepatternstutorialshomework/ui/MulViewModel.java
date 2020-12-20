package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.alyndroid.architecturepatternstutorialshomework.pojo.DataBase;

public class MulViewModel extends ViewModel {
    public MutableLiveData<Integer> mulMutableLiveData = new MutableLiveData<>();

    DataBase dataBase = new DataBase();
    int getNumbers(){
       return dataBase.getNumbers().getFirstNum()*dataBase.getNumbers().getSecondNum();
    }
    public void notifyAboutTheData(){
        mulMutableLiveData.setValue(getNumbers());
    }
}
