package com.dumb.adminpanel_alim.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dumb.adminpanel_alim.R;
import com.dumb.adminpanel_alim.models.model_user;

import java.util.List;

public class user_adapter extends RecyclerView.Adapter<user_adapter.holder> {


    List<model_user> list;
    Context context;

    public user_adapter(List<model_user> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout_user,parent,false);
        return new user_adapter.holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        holder.linearLayout.setVisibility(View.GONE);
        holder.name.setText(list.get(position).getName());
        holder.email.setText(list.get(position).getEmail());

        final boolean[] a = {true};

        holder.drop.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {

                if (a[0]){
                holder.drop.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_arrow_drop_up_24));
                holder.linearLayout.setVisibility(View.VISIBLE);
                a[0] =false;
                }
                else {
                    a[0] =true;
                    holder.drop.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    holder.linearLayout.setVisibility(View.GONE);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{
        TextView name,email;
        ImageView drop;
        LinearLayout linearLayout;
        public holder(@NonNull View itemView) {
            super(itemView);

            linearLayout=itemView.findViewById(R.id.linear);
            drop=itemView.findViewById(R.id.drop);
            name=itemView.findViewById(R.id.name);
            email=itemView.findViewById(R.id.email);
        }
    }
}
