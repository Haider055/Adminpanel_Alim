package com.dumb.adminpanel_alim.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dumb.adminpanel_alim.R;
import com.dumb.adminpanel_alim.models.model_new_alims;

import java.util.List;

public class new_alims_adapter extends RecyclerView.Adapter<new_alims_adapter.holder> {

    List<model_new_alims> list;
    Context context;

    public new_alims_adapter(List<model_new_alims> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view= LayoutInflater.from(context).inflate(R.layout.layout_newalim,parent,false);
        return new new_alims_adapter.holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        holder.name.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{
        TextView name;
        public holder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name);
        }
    }
}
