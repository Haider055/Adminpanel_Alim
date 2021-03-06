package com.dumb.adminpanel_alim;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toolbar;

import com.dumb.adminpanel_alim.adapters.adapter_answers_by_alim;
import com.dumb.adminpanel_alim.models.model_answers_by_alim;

import java.util.ArrayList;
import java.util.List;

public class answer_by_alim extends AppCompatActivity {

    androidx.appcompat.widget.Toolbar toolbar;
    List<model_answers_by_alim> list;
    adapter_answers_by_alim adapter;
    RecyclerView recyclerView;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_by_alim);

        toolbar=findViewById(R.id.tool);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Window window = getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.nav_color));


        recyclerView=findViewById(R.id.rec);

        list=new ArrayList<>();

        list.add(new model_answers_by_alim("haider ali","who are u","human","1-02-1009 2:2:99","1-02-1009 2:2:99"));
        list.add(new model_answers_by_alim("ali","who are u","human","1-02-1009 2:2:99","1-02-1009 2:2:99"));

        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(answer_by_alim.this));
        adapter=new adapter_answers_by_alim(list,this);
        recyclerView.setAdapter(adapter);




    }
}