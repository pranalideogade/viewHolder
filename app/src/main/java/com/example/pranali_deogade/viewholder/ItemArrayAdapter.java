package com.example.pranali_deogade.viewholder;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by pranali_deogade on 06-12-2017.
 */

public class ItemArrayAdapter extends ArrayAdapter<Item> {
    private int listItemlayout;

    public ItemArrayAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);
    }


    private static class ViewHolder {
        TextView itemname;
        TextView itemcollege;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Item item=getItem(position);
        ViewHolder holder;
        if (convertView==null)
        {
            holder=new ViewHolder();
            LayoutInflater inflater= (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.list_item,null);
            holder.itemname=(TextView) convertView.findViewById(R.id.name);
            holder.itemcollege=(TextView) convertView.findViewById(R.id.college);
            convertView.setTag(holder);        }
        else
        {
            holder= (ViewHolder) convertView.getTag();

        }
        holder.itemname.setText(item.getName());
        holder.itemcollege.setText(item.getCollege());
        return  convertView;
    }
}
