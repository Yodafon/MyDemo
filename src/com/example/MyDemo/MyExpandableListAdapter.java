package com.example.MyDemo;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Laci on 2016.03.29..
 */
public class MyExpandableListAdapter extends ArrayAdapter<Contact> {
    private final Context context;

    public MyExpandableListAdapter(Context context, int resource, List<Contact> objects) {
        super(context, resource, objects);
        this.context=context;

    }

}