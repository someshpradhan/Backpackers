package com.saitaj.backpeackers.AllTourAttractions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.saitaj.backpeackers.R;

import java.util.ArrayList;

public class TourAttractionList extends AppCompatActivity {

    RecyclerView recyler;
    LinearLayoutManager manager;
    TouristAttractionList_Adapter adapter;
    ArrayList<TouristAttractionList_Model> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_attraction_list);

        array = new ArrayList<>();
        array.add(new TouristAttractionList_Model("Agra","Uttar Pradesh",R.drawable.agra));
        array.add(new TouristAttractionList_Model("Amritsar","Punjab",R.drawable.amritsar));
        array.add(new TouristAttractionList_Model("Darjeeling","West Bengal",R.drawable.darjeleling));
        array.add(new TouristAttractionList_Model("Jaipur","Rajasthan",R.drawable.jaipur));
        array.add(new TouristAttractionList_Model("Kolkata","West Bengal",R.drawable.kolkata));
        array.add(new TouristAttractionList_Model("Mumbai","Maharashtra",R.drawable.mumbai));
        array.add(new TouristAttractionList_Model("Udaipur","Rajasthan",R.drawable.udaipur));
        array.add(new TouristAttractionList_Model("New Delhi","Delhi",R.drawable.delhi));
        array.add(new TouristAttractionList_Model("Varanasi","Uttar Pradesh",R.drawable.varanasi));

        adapter = new TouristAttractionList_Adapter(this,array);
        manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyler = findViewById(R.id.touattr_recyler);
        recyler.setAdapter(adapter);
        recyler.setLayoutManager(manager);

    }
}