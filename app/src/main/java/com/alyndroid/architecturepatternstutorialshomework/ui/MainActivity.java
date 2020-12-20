package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alyndroid.architecturepatternstutorialshomework.R;
import com.alyndroid.architecturepatternstutorialshomework.pojo.DataBase;

public class MainActivity extends AppCompatActivity implements InterfaceOfDiv{
    TextView plusTxV;
    TextView DivTxV;
    TextView MulTxV;
     DataBase dataBase;
     PresenterOfDiv presenterOfDiv;
     MulViewModel mulViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plusTxV = (TextView) findViewById(R.id.plus_result_textView);
        DivTxV = (TextView) findViewById(R.id.div_result_textView);
        MulTxV = (TextView) findViewById(R.id.mul_result_textView);
        dataBase = new DataBase();

        //MVP
        presenterOfDiv = new PresenterOfDiv(this );

        //MVVM
        mulViewModel = new ViewModelProvider(this).get(MulViewModel.class);
        mulViewModel.mulMutableLiveData.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                MulTxV.setText(String.valueOf(integer));
            }
        });
    }

    //MVC
    public void addTheNumbers(View view) {
        plusTxV.setText(String.valueOf(dataBase.getNumbers().getFirstNum() + dataBase.getNumbers().getSecondNum()));
    }


    //MVP
    public void getDiv(View view) {
        presenterOfDiv.returnTheDiv();
    }

    //MVP
    @Override
    public void getTheNumbers(float div) {
        DivTxV.setText(String.valueOf(div));
    }


    //MVVM
    public void MulBtn(View view) {
        mulViewModel.notifyAboutTheData();
    }

}
