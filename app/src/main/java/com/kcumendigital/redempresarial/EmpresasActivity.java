package com.kcumendigital.redempresarial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import com.kcumendigital.redempresarial.adapters.EmpresasAdapter;
import com.kcumendigital.redempresarial.models.Empresas;

import java.util.List;

public class EmpresasActivity extends AppCompatActivity {

    GridView list;
    EmpresasAdapter adapter;
    List<Empresas> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresas);

        Empresas.init(this);

        list = (GridView) findViewById(R.id.gridview);
        data = Empresas.getAllEmpresas(this);
        adapter = new EmpresasAdapter(this,data);
        list.setAdapter(adapter);

    }
}
