package com.example.gema.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.gema.Profil.Grid.MostPopular;
import com.example.gema.Profil.Grid.MostRead;
import com.example.gema.R;

public class PopularFragment extends Fragment {

    TextView lainnya1,lainnya2;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PopularFragment() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static PopularFragment newInstance(String param1, String param2) {
        PopularFragment fragment = new PopularFragment();
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
        View v=inflater.inflate(R.layout.fragment_populer, container, false);
        /*return inflater.inflate(R.layout.fragment_populer, container, false);*/

        lainnya1 = v.findViewById(R.id.lainnya1);
        lainnya2 = v.findViewById(R.id.lainnya2);

        lainnya1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MostPopular.class);
                startActivity(intent);
            }

        });

        lainnya2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MostRead.class);
                startActivity(intent);
            }

        });
       /* lainnya1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getActivity(),MostPopular.class);
                startActivity(intent);
            }
        });*/
        return v;
    }

    /*public void goToMostPopular(View view ){
        Intent intent = new Intent (getActivity(),MostPopular.class);
        startActivity(intent);
}
    public void goToMostRead(View view ){
        Intent intent = new Intent (getActivity(),MostRead.class);
        startActivity(intent);
    }*/
}