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
import com.dumb.adminpanel_alim.adapters.user_adapter;
import com.dumb.adminpanel_alim.models.model_user;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link user_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class user_fragment extends Fragment {


    RecyclerView recyclerView;
    List<model_user> list;
    user_adapter adapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public user_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment userfragment.
     */
    // TODO: Rename and change types and number of parameters
    public static user_fragment newInstance(String param1, String param2) {
        user_fragment fragment = new user_fragment();
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
        View view= inflater.inflate(R.layout.fragment_userfragment, container, false);
        list=new ArrayList<>();

        list.add(new model_user("ali","haiderzafar055@gmail.com"));
        list.add(new model_user("ali","haiderzafar055@gmail.com"));
        list.add(new model_user("ali","haiderzafar055@gmail.com"));
        list.add(new model_user("ali","haiderzafar055@gmail.com"));
        list.add(new model_user("ali","haiderzafar055@gmail.com"));

        recyclerView=view.findViewById(R.id.rec);
        recyclerView.hasFixedSize();
        adapter=new user_adapter(list,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}