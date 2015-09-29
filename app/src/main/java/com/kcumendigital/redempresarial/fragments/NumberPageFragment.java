package com.kcumendigital.redempresarial.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kcumendigital.redempresarial.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class NumberPageFragment extends Fragment {
    Integer position;

    public void init (Integer position){
        this.position = position;
    }


    public NumberPageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_number_page, container, false);
        TextView txt = (TextView) v.findViewById(R.id.position);
        txt.setText(position.toString());

        return v;
    }


}
