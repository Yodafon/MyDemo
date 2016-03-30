package com.example.MyDemo;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Laci on 2016.03.29..
 */
public class MyExpandableListAdapter extends ArrayAdapter<Contact> {
    private final Context context;

    public MyExpandableListAdapter(Context context, int resource, int resource2, List<Contact> objects) {
        super(context, resource, resource2, objects);
        this.context=context;
    }

}