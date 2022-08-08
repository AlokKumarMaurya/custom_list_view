package com.example.custom_list_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class alok_adapter extends ArrayAdapter {

    private  String arr[];

    public alok_adapter(@NonNull Context context, int resource, @NonNull String arr[]) {
        super(context, resource, arr);
        this.arr=arr;
    }


    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.custom_layput,parent,false);
        TextView textView=convertView.findViewById(R.id.textView);
        textView.setText(getItem(position));
        return convertView;
    }
}
