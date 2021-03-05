package com.dumb.adminpanel_alim.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dumb.adminpanel_alim.R;
import com.dumb.adminpanel_alim.models.model_answers_by_alim;

import java.util.List;

public class adapter_answers_by_alim extends RecyclerView.Adapter<adapter_answers_by_alim.holder> {

    List<model_answers_by_alim> list;
    Context context;

    public adapter_answers_by_alim(List<model_answers_by_alim> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout_answer_by_alim,parent,false);
        return new adapter_answers_by_alim.holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        holder.username.setText(list.get(position).getUsername());
        holder.question.setText(list.get(position).getQuestion());
        holder.answer.setText(list.get(position).getAnswer());
        holder.q_date.setText(list.get(position).getQ_time());
        holder.a_date.setText(list.get(position).getA_time());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{


        TextView username,question,answer,q_date,a_date;

        public holder(@NonNull View itemView) {
            super(itemView);

            username=itemView.findViewById(R.id.username);
            question=itemView.findViewById(R.id.question);
            answer=itemView.findViewById(R.id.answer);
            q_date=itemView.findViewById(R.id.q_date);
            a_date=itemView.findViewById(R.id.a_date);

        }
    }
}
