package com.dumb.adminpanel_alim.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.dumb.adminpanel_alim.R;
import com.dumb.adminpanel_alim.adapters.new_alims_adapter;
import com.dumb.adminpanel_alim.models.model_new_alims;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link new_alims#newInstance} factory method to
 * create an instance of this fragment.
 */
public class new_alims extends Fragment {


    RecyclerView rec;
    List<model_new_alims> list;
    new_alims_adapter adapter;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public new_alims() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment new_alims.
     */
    // TODO: Rename and change types and number of parameters
    public static new_alims newInstance(String param1, String param2) {
        new_alims fragment = new new_alims();
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
        View view= inflater.inflate(R.layout.fragment_new_alims, container, false);


        rec=view.findViewById(R.id.rec);

        list=new ArrayList<>();
        list.add(new model_new_alims("Haider"));
        list.add(new model_new_alims("Haider"));
        list.add(new model_new_alims("Haider"));
        list.add(new model_new_alims("Haider"));

        rec.hasFixedSize();
        rec.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new new_alims_adapter(list,getContext());
        rec.setAdapter(adapter);



        return view;
    }
}