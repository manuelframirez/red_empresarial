package com.kcumendigital.redempresarial.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kcumendigital.redempresarial.R;
import com.kcumendigital.redempresarial.models.Empresas;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by manuelfernando on 28/09/2015.
 */
public class EmpresasAdapter extends BaseAdapter {

    Context context;
    List<Empresas> dataempresas;

    public EmpresasAdapter(Context context, List<Empresas> dataempresas) {
        this.context = context;
        this.dataempresas = dataempresas;
    }

    @Override
    public int getCount() { return dataempresas.size();}

    @Override
    public Object getItem(int position) {return dataempresas.get(position); }

    @Override
    public long getItemId(int position) { return position;}

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View v;

        if (view != null){
            v = view;
        }

        v = View.inflate(context, R.layout.template_list_empresas, null);
        Empresas e = (Empresas) getItem(position);
        TextView txt = (TextView) v.findViewById(R.id.titulo_empresa);
        txt.setText(e.getNombre());

        if (e.getNombre().equals("Kcumen")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.kcumendigitallogo).into(img);
        }

        if (e.getNombre().equals("Ecotecma")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.ecotecma).into(img);
        }

        if (e.getNombre().equals("SmartSoft Play")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.smartsoft).into(img);
        }

        if (e.getNombre().equals("Inteligente Mente")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.inteligentemente).into(img);
        }

        if (e.getNombre().equals("Super Natural")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.logo).into(img);
        }

        if (e.getNombre().equals("Ideti")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.ideti).into(img);
        }

        if (e.getNombre().equals("The Big Bang Company")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.bigbang).into(img);
        }

        if (e.getNombre().equals("Buxtar")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.buxtar).into(img);
        }

        if (e.getNombre().equals("Celeste")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.celeste).into(img);
        }

        if (e.getNombre().equals("Creazion")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.creazion).into(img);
        }

        if (e.getNombre().equals("EGOB")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.egob).into(img);
        }

        if (e.getNombre().equals("Eteknik")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.eteknik).into(img);
        }

        if (e.getNombre().equals("Health")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.logo).into(img);
        }

        if (e.getNombre().equals("Human")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.human).into(img);
        }

        if (e.getNombre().equals("Inet")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.inet).into(img);
        }

        if (e.getNombre().equals("Jump")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.jump).into(img);
        }

        if (e.getNombre().equals("Sadmin")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.sadmin).into(img);
        }

        if (e.getNombre().equals("Somos")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.somos).into(img);
        }

        if (e.getNombre().equals("Sunset")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.sunset).into(img);
        }

        if (e.getNombre().equals("Tics")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.tics).into(img);
        }

        if (e.getNombre().equals("Taio")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.tics).into(img);
        }

        if (e.getNombre().equals("Totems Consulting")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.totems).into(img);
        }

        if (e.getNombre().equals("Vigilax")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.vigilax).into(img);
        }

        if (e.getNombre().equals("Winet")){
            ImageView img = (ImageView) v.findViewById(R.id.imagenempresa);
            Picasso.with(context).load(R.drawable.winet).into(img);
        }


        return v;
    }
}
