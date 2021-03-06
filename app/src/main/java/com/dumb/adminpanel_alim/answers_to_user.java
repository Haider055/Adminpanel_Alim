package com.dumb.adminpanel_alim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.dumb.adminpanel_alim.adapters.adapter_answer_To_user;
import com.dumb.adminpanel_alim.models.model_answers_to_user;

import java.util.ArrayList;
import java.util.List;

public class answers_to_user extends AppCompatActivity {

    RecyclerView recyclerView;
    adapter_answer_To_user adapter;
    List<model_answers_to_user> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers_to_user);

        list=new ArrayList<>();

        recyclerView=findViewById(R.id.rec);

        list.add(new model_answers_to_user("hhh","who are u","answer"));
        list.add(new model_answers_to_user("hhh","who are you","answer"));

        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new adapter_answer_To_user(list,this);

        recyclerView.setAdapter(adapter);

    }
}