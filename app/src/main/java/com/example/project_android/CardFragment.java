package com.example.project_android;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class CardFragment extends Fragment {

    private RecyclerView recyclerView;
    private Adaptercard adaptercard;
    private ArrayList<cardmodel> cardmodels;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CardFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CardFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CardFragment newInstance(String param1, String param2) {
        CardFragment fragment = new CardFragment();
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
        return inflater.inflate(R.layout.fragment_card, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataInitialize();

        recyclerView = view.findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adaptercard = new Adaptercard(getContext(), cardmodels);
        recyclerView.setAdapter(adaptercard);
        adaptercard.notifyDataSetChanged();
    }
    private void dataInitialize(){
        cardmodels = new ArrayList<cardmodel>();
        cardmodels.add(new cardmodel("Dania Angga", R.drawable.angga));
        cardmodels.add(new cardmodel("Naufal I'mal", R.drawable.naufal));
        cardmodels.add(new cardmodel("Bayu Krisna", R.drawable.bayu));
        cardmodels.add(new cardmodel("Yohanes Krisna D", R.drawable.krisna));
        cardmodels.add(new cardmodel("Mochamad Alfan", R.drawable.alfan));
        cardmodels.add(new cardmodel("Sevri Vendrian", R.drawable.sevri));
        cardmodels.add(new cardmodel("Fathur Rahman H", R.drawable.hakim));
        cardmodels.add(new cardmodel("Rama Diputer", R.drawable.rama));
    }
}