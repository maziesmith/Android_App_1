package com.example.prati.mp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by prati on 10/2/2016.
 */

public class MyCustomBaseAdapter extends BaseAdapter {
    
  private static ArrayList<CarDealerInfo> searchArrayList;
    int position;
    private LayoutInflater mInflater;

   
   public MyCustomBaseAdapter(Context context, ArrayList<CarDealerInfo> results) {
       searchArrayList = results;

        mInflater = LayoutInflater.from(context);
        

    }

    public int getCount() {
      
        return searchArrayList.size();
    }

    public Object getItem(int position) {
        return searchArrayList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.textforlist, null);
            holder = new ViewHolder();
            holder.DealerName = (TextView) convertView.findViewById(R.id.info1);
            holder.DealerAddress = (TextView) convertView
                    .findViewById(R.id.info2);
            holder.DealerNumber = (TextView) convertView.findViewById(R.id.info3);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.DealerName.setText(searchArrayList.get(position).getDealerName());
        holder.DealerAddress.setText(searchArrayList.get(position).getDealerAddress());
        holder.DealerNumber.setText(searchArrayList.get(position).getDealerNumber());

        return convertView;
    }

    static class ViewHolder {
        TextView DealerName;
        TextView DealerAddress;
        TextView DealerNumber;
    }
}

