package com.example.poojapatel.newnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Objects;

public class FirstFragment extends Fragment {
    View myView1;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView1 = inflater.inflate(R.layout.first_layout,container,false);
        String items1[] = new String[] {"development solutions","design solutions","branding solutions", "seo solutions", "digital advisory solutions"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(Objects.requireNonNull(getActivity()),android.R.layout.simple_list_item_1,items1);
        ListView lvdata1 = (ListView) myView1.findViewById(R.id.list_item1);
        lvdata1.setAdapter(adapter1);
        lvdata1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fragment2 nextFrag= new Fragment2();
                FragmentManager manager = getFragmentManager();
                assert manager != null;
                manager.beginTransaction()
                        .replace(R.id.content_frame,nextFrag,nextFrag.getTag()).commit();
            }
        });
        return myView1;
    }

}
