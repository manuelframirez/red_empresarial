package com.kcumendigital.redempresarial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.kcumendigital.redempresarial.adapters.EmpresasAdapter;
import com.kcumendigital.redempresarial.models.Empresas;

import java.util.List;

public class EmpresasActivity extends AppCompatActivity implements  AdapterView.OnItemClickListener {

    GridView list;
    EmpresasAdapter adapter;
    List<Empresas> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Nuestra Red");
        toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Empresas.init(this);

        list = (GridView) findViewById(R.id.gridview);
        data = Empresas.getAllEmpresas(this);
        adapter = new EmpresasAdapter(this,data);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);

    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
         Long id_item_click = data.get(position).getId();
         Intent intent = new Intent(this,TabsActivity.class).putExtra("id_item_click",id_item_click);
         startActivity(intent);

    }
}
