package com.kcumendigital.redempresarial.fragments;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kcumendigital.redempresarial.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactoFragment extends Fragment {

    Integer position;

    public void init (Integer position){this.position = position;}

    public ContactoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v;
        v = inflater.inflate(R.layout.fragment_contacto, container, false);

        return v;
    }


}
