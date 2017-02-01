package com.example.prati.mp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



/**
 * Created by prati on 9/29/2016.
 */

public class AdapterActivity extends BaseAdapter {

    Context c;
    ArrayList<Car> Cars;



    public AdapterActivity(Context c,ArrayList<Car> car){
        this.c=c;
        this.Cars=car;
    }

    @Override
    public int getCount() {
        return Cars.size();
    }

    @Override
    public Object getItem(int position) {
        return Cars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null){
            convertView=inflater.inflate(R.layout.gridlayout,parent,false);

        }

        ImageView img=(ImageView)convertView.findViewById(R.id.imageView);
        TextView txt=(TextView)convertView.findViewById(R.id.textView2);

        img.setImageResource(Cars.get(position).getImg());
        txt.setText(Cars.get(position).getCarname());

        return convertView;
    }
}
