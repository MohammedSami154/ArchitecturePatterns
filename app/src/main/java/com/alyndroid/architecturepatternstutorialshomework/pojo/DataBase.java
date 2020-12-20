package com.alyndroid.architecturepatternstutorialshomework.pojo;

import com.alyndroid.architecturepatternstutorialshomework.ui.NumberModel;

public class DataBase {
    public NumberModel getNumbers(){
        return new NumberModel(4, 2);
    }
}
