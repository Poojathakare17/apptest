package com.example.poojapatel.newnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ThirdFragment extends Fragment {
    View myView;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.third_layout,container,false);
        String items[] = new String[] {"bukhatir group","season 5","get real estate", "jubba group of companies", "alliance facilities management","al mubasheri","bukhatir properties","crystal bright"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1,items);
        ListView lvdata = (ListView) myView.findViewById(R.id.list_item);
        lvdata.setAdapter(adapter);
        return myView;
    }

}
