package com.example.simpledoublefragment;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 8/4/2016.
 */
public class NameArrayAdapter extends ArrayAdapter<Student> {

    private static final String TAG = "NamesAdapterTAG_";

    public NameArrayAdapter(Context context, List<Student> list) {
        super(context, R.layout.list_item, list);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

/*            Log.d(TAG, "getView: " + getContext().getClass().getSimpleName()
                                +" "+ convertView.getClass().getSimpleName());*/
        }

        Student aStudent = getItem(position);

        TextView aLine = (TextView) convertView.findViewById(R.id.l_item_txt);
        aLine.setText( aStudent.toString());

        return convertView;
    }
}