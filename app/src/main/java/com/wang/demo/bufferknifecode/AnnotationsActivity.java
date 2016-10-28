package com.wang.demo.bufferknifecode;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnnotationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initLayoutYes(R.id.knife_lin_tv);
        initLayoutNo(R.id.knife_lin_tv);
        /**
         * 原生的annotations   可以提示出错误，和android本身的错误提示相同----------initLayoutYes
         * 而不加 这种资源型注解  。。。不报错。。编译时才会报错-----initLayoutNo
         *
         */

    }
    void initLayoutYes(@LayoutRes int layoutid){

        setContentView(layoutid);
    }
    void initLayoutNo(int layoutid){

        setContentView(layoutid);
    }
}
