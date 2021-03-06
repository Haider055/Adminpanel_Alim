package com.dumb.adminpanel_alim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.dumb.adminpanel_alim.adapters.adapter_wazaif_of_alim;
import com.dumb.adminpanel_alim.models.model_wazaif_of_alim;

import java.util.ArrayList;
import java.util.List;

public class wazaif_of_alim extends AppCompatActivity {

    RecyclerView rec;
    adapter_wazaif_of_alim adapter;
    List<model_wazaif_of_alim> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wazaif_of_alim);

        Window window = getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.nav_color));



        list=new ArrayList<>();

        rec=findViewById(R.id.rec);

        list.add(new model_wazaif_of_alim("wazaif","wazaifwazaif"));
        list.add(new model_wazaif_of_alim("wazaif","wazaifwazaif"));
        list.add(new model_wazaif_of_alim("wazaif","wazaifwazaif"));

        rec.hasFixedSize();
        rec.setLayoutManager(new LinearLayoutManager(this));
        adapter=new adapter_wazaif_of_alim(list,this);

        rec.setAdapter(adapter);



    }
}