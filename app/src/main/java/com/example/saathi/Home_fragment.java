package com.example.saathi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


public class Home_fragment extends Fragment {
    CircleImageView setting;
    RecyclerView news_recycler;
    ArrayList<news_str> model_news=new ArrayList<>();

    //--------------------------------------------------
    RecyclerView emergency_recycler;
    ArrayList<emergency_str> model_emergency=new ArrayList<>();

 /*
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;
*/
    public Home_fragment() {
        // Required empty public constructor
    }

  /*  public static Home_fragment newInstance(String param1, String param2) {
        Home_fragment fragment = new Home_fragment();
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

   */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home_fragment, container, false);
        setting=view.findViewById(R.id.setting);
        news_recycler=view.findViewById(R.id.news_recycler);

        news_recycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        model_news.add(new news_str(R.drawable.news));
        model_news.add(new news_str(R.drawable.news1));
        model_news.add(new news_str(R.drawable.news2));

        model_news.add(new news_str(R.drawable.news));
        model_news.add(new news_str(R.drawable.news1));
        model_news.add(new news_str(R.drawable.news2));

        model_news.add(new news_str(R.drawable.news));
        model_news.add(new news_str(R.drawable.news1));
        model_news.add(new news_str(R.drawable.news2));

        model_news.add(new news_str(R.drawable.news));
        model_news.add(new news_str(R.drawable.news1));
        model_news.add(new news_str(R.drawable.news2));

        news_addapter addapter=new news_addapter(getContext(),model_news);
        news_recycler.setAdapter(addapter);



//---------------Emergency_recyclerView------------------------------------------------------------
        emergency_recycler=view.findViewById(R.id.emergency_recycler);
        emergency_recycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        model_emergency.add(new emergency_str(R.drawable.police));
        model_emergency.add(new emergency_str(R.drawable.support));
        model_emergency.add(new emergency_str(R.drawable.ambulance));

        model_emergency.add(new emergency_str(R.drawable.hospital));
        model_emergency.add(new emergency_str(R.drawable.road));
        model_emergency.add(new emergency_str(R.drawable.domestic_abuse));
        model_emergency.add(new emergency_str(R.drawable.senior_abuse));
        model_emergency.add(new emergency_str(R.drawable.firefighter));
        model_emergency.add(new emergency_str(R.drawable.leakage));
        model_emergency.add(new emergency_str(R.drawable.mental_health));
        model_emergency.add(new emergency_str(R.drawable.hacker));
        model_emergency.add(new emergency_str(R.drawable.missing));
        model_emergency.add(new emergency_str(R.drawable.train));
        model_emergency.add(new emergency_str(R.drawable.emergency));

        Emergency_Adapter adapter=new Emergency_Adapter(getContext(),model_emergency);
        emergency_recycler.setAdapter(adapter);






        return view;
    }
}