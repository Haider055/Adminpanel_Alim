package com.dumb.adminpanel_alim.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.dumb.adminpanel_alim.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link alim_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class alim_fragment extends Fragment {


    BottomNavigationView bottomNavigationView;

    String all_alim_FragmentTag="all";
    String new_alim_FragmentTag="new";


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public alim_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment alim_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static alim_fragment newInstance(String param1, String param2) {
        alim_fragment fragment = new alim_fragment();
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
        View view= inflater.inflate(R.layout.fragment_alim_fragment, container, false);

        bottomNavigationView=view.findViewById(R.id.nav);

        Fragment selectedFragment = new All_alims();
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.alim_container,
                selectedFragment,all_alim_FragmentTag).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()==R.id.all_alim){

                    Fragment selectedFragment = new All_alims();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.alim_container,
                    selectedFragment,all_alim_FragmentTag).commit();
                }
                if(item.getItemId()==R.id.new_alim) {
                    Fragment selectedFragment = new new_alims();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.alim_container,
                            selectedFragment,new_alim_FragmentTag).commit();
                }
                return true;
            }
        });
        return view;
    }
}