package com.alyndroid.architecturepatternstutorialshomework.ui;

import android.view.View;

import com.alyndroid.architecturepatternstutorialshomework.pojo.DataBase;

public class PresenterOfDiv {
    InterfaceOfDiv interfaceOfDiv;
    DataBase dataBase = new DataBase();
    public PresenterOfDiv(InterfaceOfDiv interfaceOfDiv) {
        this.interfaceOfDiv = interfaceOfDiv;
    }
    float getDiv(){
        return dataBase.getNumbers().getFirstNum()/dataBase.getNumbers().getSecondNum();
    }
    public void returnTheDiv(){
        interfaceOfDiv.getTheNumbers(getDiv());
    }
}
