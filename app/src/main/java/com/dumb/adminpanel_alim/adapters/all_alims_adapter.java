package com.dumb.adminpanel_alim.adapters;

import android.content.Context;
import android.renderscript.RenderScript;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dumb.adminpanel_alim.R;
import com.dumb.adminpanel_alim.models.model_all_alims;

import java.util.List;
import java.util.stream.LongStream;

public class all_alims_adapter extends RecyclerView.Adapter<all_alims_adapter.holder> {

    List<model_all_alims> list;
    Context context;

    answers m_answer;
    wazaif m_wazaif;

    public all_alims_adapter(List<model_all_alims> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public interface answers{
        public void onclick(String id);
    }

    public void onclickanswer(answers listener){
        m_answer=listener;
    }


    public interface wazaif{
        public void onclickwazaif(String id);
    }

    public void onclickwazaif(wazaif listener){
        m_wazaif=listener;
    }



    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout_all_alims,parent,false);

        return new  all_alims_adapter.holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        holder.desc.setVisibility(View.GONE);
        holder.linear.setVisibility(View.GONE);

        holder.name.setText(list.get(position).getName());
        holder.desc.setText(list.get(position).getDescription());

        final boolean[] a = {true};

        holder.drop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a[0]){
                    holder.linear.setVisibility(View.VISIBLE);
                    holder.desc.setVisibility(View.VISIBLE);
                    holder.drop.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_arrow_drop_up_24));
                    a[0] =false;

                }
                else {
                    holder.linear.setVisibility(View.GONE);
                    holder.desc.setVisibility(View.GONE);
                    holder.drop.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    a[0]=true;
                }

            }
        });


        holder.answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_answer.onclick("1");
            }
        });

        holder.wazaif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_wazaif.onclickwazaif("1");
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder {

        TextView name,desc;
        ImageView drop;
        LinearLayout linear;
        Button answer,wazaif;
        public holder(@NonNull View itemView) {
            super(itemView);

            drop=itemView.findViewById(R.id.drop);
            linear=itemView.findViewById(R.id.linear);

            answer=itemView.findViewById(R.id.answer);
            wazaif=itemView.findViewById(R.id.wazaif);

            name=itemView.findViewById(R.id.name);
            desc=itemView.findViewById(R.id.description);


        }
    }
}
