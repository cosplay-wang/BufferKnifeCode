package com.wang.demo.bufferknifecode.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wang.demo.bufferknifecode.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by zhiwei.wang on 2016/8/16.
 * 先生_不靠谱
 */
public class ListviewAdapter extends BaseAdapter {

    Context context;
    List<String> datalist;

    public ListviewAdapter(Context context, List<String> datalist) {
        this.context = context;
        this.datalist = datalist;
    }

    @Override
    public int getCount() {
        return datalist == null?0:datalist.size();
    }

    @Override
    public Object getItem(int i) {
        return datalist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null){
            view  = LayoutInflater.from(context).inflate(R.layout.item_layout,null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);

        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tv.setText(datalist.get(i));
        return view;
    }
    class ViewHolder{
            @Bind(R.id.item_tv) TextView tv;

        public ViewHolder(View view) {
            ButterKnife.bind(this,view);
        }
    }
}
