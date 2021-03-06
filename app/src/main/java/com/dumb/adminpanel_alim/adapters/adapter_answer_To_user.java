package com.dumb.adminpanel_alim.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

import com.dumb.adminpanel_alim.R;
import com.dumb.adminpanel_alim.models.model_answers_to_user;

import java.util.List;

public class adapter_answer_To_user extends RecyclerView.Adapter<adapter_answer_To_user.holder> {

    List<model_answers_to_user> list;
    Context context;

    public adapter_answer_To_user(List<model_answers_to_user> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_answer_To_user.holder(LayoutInflater.from(context).inflate(R.layout.layout_answer_to_user,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        holder.name.setText("Answer by :"+list.get(position).getAnswerby());
        holder.answer.setText("Ans- "+list.get(position).getAnswerby());
        holder.question.setText("Q- "+list.get(position).getQuestion());

        holder.question_date.setText("Ask time  "+list.get(position).getQuestion_date());
        holder.answer_date.setText("Ans time  "+list.get(position).getAnswer_date());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{

        TextView name,question,answer,question_date,answer_date;

        public holder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name);
            question=itemView.findViewById(R.id.question);
            question_date=itemView.findViewById(R.id.question_date);
            answer_date=itemView.findViewById(R.id.answer_date);
            answer=itemView.findViewById(R.id.answer);
        }
    }
}
