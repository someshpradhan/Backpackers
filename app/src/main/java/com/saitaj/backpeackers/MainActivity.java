package com.saitaj.backpeackers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.saitaj.backpeackers.AllTourAttractions.TourAttractionList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
       RecyclerView touristdestinations, touristattractions;
    ArrayList<TouristDestination_MODEL> touristDestination_models;
    ArrayList<TouristAttraction_MODEL> touristAttraction_models;
    TouristDestination_ADAPTER touristDestination_adapter;
    TouristAttraction_ADAPTER  touristAttraction_adapter;
       LinearLayoutManager manager;
       TextView seetouristdestinations;
       Button explore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        touristdestinations = findViewById(R.id.touristdestination_recylervuew);
        touristDestination_models = new ArrayList<>();
        touristDestination_models.add(new TouristDestination_MODEL(R.drawable.delhi,"New Delhi","Delhi"));
        touristDestination_models.add(new TouristDestination_MODEL(R.drawable.jaipur,"Jaipur","Rajasthan"));
        touristDestination_models.add(new TouristDestination_MODEL(R.drawable.darjeleling,"Darjeeling","West Bengal"));
        touristDestination_models.add(new TouristDestination_MODEL(R.drawable.varanasi,"Varanasi","Uttar Pradesh"));
        touristDestination_models.add(new TouristDestination_MODEL(R.drawable.mumbai,"Mumbai","Maharashtra"));
        touristDestination_models.add(new TouristDestination_MODEL(R.drawable.kolkata,"Kolkata","West Bengal"));
        touristDestination_models.add(new TouristDestination_MODEL(R.drawable.udaipur,"Udaipur ","Rajasthan"));








        touristDestination_adapter =  new TouristDestination_ADAPTER(this,touristDestination_models);
        manager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        touristdestinations.setAdapter(touristDestination_adapter);
        touristdestinations.setLayoutManager(manager);

        touristattractions = findViewById(R.id.touristattractions_recylerview);
        touristAttraction_models = new ArrayList<>();
        touristAttraction_models.add(new TouristAttraction_MODEL(R.drawable.agra,"Taj Mahal","Agra, Uttar Pradesh"));
        touristAttraction_models.add(new TouristAttraction_MODEL(R.drawable.amritsar,"Golden Temple","Amritsar, Punjab"));
        touristAttraction_models.add(new TouristAttraction_MODEL(R.drawable.udaipur,"Lake Pichola","Udiapur, Rajasthan"));
        touristAttraction_models.add(new TouristAttraction_MODEL(R.drawable.jaipur,"Hawa Mahal","Jaipur, Rajasthan"));
        touristAttraction_models.add(new TouristAttraction_MODEL(R.drawable.mumbai,"Hotel Taj","Mumbai, Maharashtra"));
        touristAttraction_models.add(new TouristAttraction_MODEL(R.drawable.kolkata,"Howrah Bridge","Kolkata, West Bengal"));
        touristAttraction_models.add(new TouristAttraction_MODEL(R.drawable.varanasi,"Ramgarh Fort","Varanasi, Uttar Pradesh"));




        touristAttraction_adapter =  new TouristAttraction_ADAPTER(this,touristAttraction_models);
        manager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        touristattractions.setAdapter(touristAttraction_adapter);
        touristattractions.setLayoutManager(manager);
        explore =  findViewById(R.id.toursitdestinations_button);
        seetouristdestinations = findViewById(R.id.seetouristdestination_link);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TourAttractionList.class));
            }
        });
       seetouristdestinations.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(MainActivity.this, TourAttractionList.class));
           }
       });

    }
}