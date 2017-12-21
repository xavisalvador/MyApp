package com.learning.fragments.buscador;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.learning.adapters.userAdapters;
import com.learning.model.User;
import com.learning.myapp.MainActivity;
import com.learning.myapp.R;

import java.util.ArrayList;

/**
 * Created by BTIS on 15/12/2017.
 */

public class SearchFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.search_view, container, false);

        // Construct the data source
        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        // Create the adapter to convert the array to views
        userAdapters adapter = new userAdapters(this, arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) listView.findViewById();
        listView.setAdapter(adapter);

        return view;
    }
}