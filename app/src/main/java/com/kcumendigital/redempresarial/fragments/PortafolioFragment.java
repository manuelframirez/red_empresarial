package com.kcumendigital.redempresarial.fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kcumendigital.redempresarial.R;
import com.kcumendigital.redempresarial.models.Empresas;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.net.URI;

/**
 * A simple {@link Fragment} subclass.
 */
public class PortafolioFragment extends android.support.v4.app.Fragment implements View.OnClickListener {
    Empresas e;
    public void init (Empresas e) {
    this.e = e;
    }

    public PortafolioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_portafolio, container, false);
        if (e.getNombre().equals("Kcumen")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.kcumendigitallogo).into(img);
        }

        if (e.getNombre().equals("Ecotecma")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.ecotecma).into(img);
        }

        if (e.getNombre().equals("SmartSoft Play")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.smartsoft).into(img);
        }

        if (e.getNombre().equals("Inteligente Mente")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.inteligentemente).into(img);
        }

        if (e.getNombre().equals("Super Natural")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.logo).into(img);
        }

        if (e.getNombre().equals("Ideti")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.ideti).into(img);
        }

        if (e.getNombre().equals("The Big Bang Company")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.bigbang).into(img);
        }

        if (e.getNombre().equals("Buxtar")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.buxtar).into(img);
        }

        if (e.getNombre().equals("Celeste")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.celeste).into(img);
        }

        if (e.getNombre().equals("Creazion")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.creazion).into(img);
        }

        if (e.getNombre().equals("EGOB")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.egob).into(img);
        }

        if (e.getNombre().equals("Eteknik")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.eteknik).into(img);
        }

        if (e.getNombre().equals("Health")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.logo).into(img);
        }

        if (e.getNombre().equals("Human")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.human).into(img);
        }

        if (e.getNombre().equals("Inet")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.inet).into(img);
        }

        if (e.getNombre().equals("Jump")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.jump).into(img);
        }

        if (e.getNombre().equals("Sadmin")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.sadmin).into(img);
        }

        if (e.getNombre().equals("Somos")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.somos).into(img);
        }

        if (e.getNombre().equals("Sunset")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.sunset).into(img);
        }

        if (e.getNombre().equals("Tics")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.tics).into(img);
        }

        if (e.getNombre().equals("Taio")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.tics).into(img);
        }

        if (e.getNombre().equals("Totems Consulting")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.totems).into(img);
        }

        if (e.getNombre().equals("Vigilax")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.vigilax).into(img);
        }

        if (e.getNombre().equals("Winet")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(getActivity()).load(R.drawable.winet).into(img);
        }

        TextView txt = (TextView) v.findViewById(R.id.url);
        txt.setClickable(true);
        txt.setMovementMethod(LinkMovementMethod.getInstance());
        txt.setText(Html.fromHtml("<a href='" + e.getUrl() + "'>" + e.getUrl() + "</a>"));
        txt.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        Uri url = Uri.parse(e.getUrl());
        Intent launchBroswer = new Intent(Intent.ACTION_VIEW,url);
        startActivity(launchBroswer);
    }
}
