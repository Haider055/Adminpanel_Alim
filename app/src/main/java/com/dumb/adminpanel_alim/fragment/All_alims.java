package com.dumb.adminpanel_alim.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.dumb.adminpanel_alim.R;
import com.dumb.adminpanel_alim.adapters.all_alims_adapter;
import com.dumb.adminpanel_alim.answer_by_alim;
import com.dumb.adminpanel_alim.models.model_all_alims;
import com.dumb.adminpanel_alim.wazaif_of_alim;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link All_alims#newInstance} factory method to
 * create an instance of this fragment.
 */
public class All_alims extends Fragment implements all_alims_adapter.answers,all_alims_adapter.wazaif{

    RecyclerView rec;
    all_alims_adapter adapter;
    model_all_alims model;

    List<model_all_alims> list;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public All_alims() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment All_alims.
     */
    // TODO: Rename and change types and number of parameters
    public static All_alims newInstance(String param1, String param2) {
        All_alims fragment = new All_alims();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_all_alims, container, false);

        rec=view.findViewById(R.id.rec);

        list=new ArrayList<>();

        list.add(new model_all_alims("haider","lorem ipsumNam ebsskj skns kjsnjkskjn cskjc ndskcnsd cklsdNamebs skjskn skjsnjk skjncskjcnd skcns dcklsd","haiderzafar088@gmail.com"));
        list.add(new model_all_alims("haider","lorem ipsumNa mebsskjs knsk jsnjksk jncsk jcndsk cnsdc klsdNa mebssk jskn skjsnjks kjncsk jcndskcnsd cklsd","haiderzafar088@gmail.com"));
        list.add(new model_all_alims("haider","lorem ipsumName bsskj sknskjsn jkskjncsk jcndskc nsdcklsdN amebssk jsknsk jsnjk skjncs kjcndskcnsdcklsd","haiderzafar088@gmail.com"));
        list.add(new model_all_alims("haider","lorem ipsumNam eb sskjs knskj snjksk jncskjcn dskcnsdck lsdNam ebsskjsk nskjsnj kskjn cskjcndskcns dcklsd","haiderzafar088@gmail.com"));
        list.add(new model_all_alims("haider","lorem ipsum","haiderzafar088@gmail.com"));
        list.add(new model_all_alims("haider","lorem ipsum","haiderzafar088@gmail.com"));

        rec.hasFixedSize();
        rec.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new all_alims_adapter(list,getContext());
        rec.setAdapter(adapter);
        adapter.onclickanswer(this);
        adapter.onclickwazaif(this);

        return  view;
    }

    @Override
    public void onclick(String id) {
        startActivity(new Intent(getContext(), answer_by_alim.class));

    }

    @Override
    public void onclickwazaif(String id) {
        startActivity(new Intent(getContext(), wazaif_of_alim.class));

    }
}