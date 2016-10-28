package com.wang.demo.bufferknifecode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.wang.demo.bufferknifecode.adapter.ListviewAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.knife_tv) TextView tvTitle;
    @Bind(R.id.knife_lin_tv) TextView tvTitleLin;
    @Bind(R.id.knife_listview)ListView listview;
    @OnClick(R.id.knife_tv)
    void sethh(View view){
        Toast.makeText(this, "You click the Button!"+view.getTag(), Toast.LENGTH_SHORT).show();
    }
    @OnItemClick(R.id.knife_listview)
            void setItem(int position){
        startActivity(new Intent(this, AnnotationsActivity.class));
        Toast.makeText(this, "点击了："+dataList.get(position), Toast.LENGTH_SHORT).show();
    }
    List<String>  dataList = new ArrayList<String>();
    ListviewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DataList();
        tvTitle.setText("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        tvTitle.setTag("hahahah");
        adapter = new ListviewAdapter(this,dataList);
        listview.setAdapter(adapter);



    }
    void DataList(){
        for(int i=0;i<20;i++){
            dataList.add("数据条数："+(i+1));
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
