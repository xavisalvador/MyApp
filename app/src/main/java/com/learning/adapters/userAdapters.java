package com.learning.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.learning.model.User;
import com.learning.myapp.R;

import java.util.ArrayList;

/**
 * Created by BTIS on 18/12/2017.
 */

public class userAdapters extends ArrayAdapter<User> {
    public userAdapters(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        User user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvAge = (TextView) convertView.findViewById(R.id.tvAge);
        // Populate the data into the template view using the data object
        tvName.setText(user.name);
        tvAge.setText(user.age);
        // Return the completed view to render on screen
        return convertView;
    }
}