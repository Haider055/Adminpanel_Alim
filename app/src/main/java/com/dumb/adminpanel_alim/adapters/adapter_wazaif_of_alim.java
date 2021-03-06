package com.dumb.adminpanel_alim.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dumb.adminpanel_alim.R;
import com.dumb.adminpanel_alim.models.model_wazaif_of_alim;

import java.util.List;

public class adapter_wazaif_of_alim extends RecyclerView.Adapter<adapter_wazaif_of_alim.holder> {


    List<model_wazaif_of_alim> list;
    Context context;

    public adapter_wazaif_of_alim(List<model_wazaif_of_alim> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_wazaif_of_alim.holder(LayoutInflater.from(context).inflate(R.layout.layout_wazaif_of_alim,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        holder.heading.setText(list.get(position).getHeading());
        holder.description.setText(list.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{

        TextView heading,description;
        public holder(@NonNull View itemView) {
            super(itemView);

            heading=itemView.findViewById(R.id.head);
            description=itemView.findViewById(R.id.desc);
        }
    }
}
