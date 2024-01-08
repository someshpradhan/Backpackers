package com.saitaj.backpeackers.AllTourAttractions;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.saitaj.backpeackers.CityDetails;
import com.saitaj.backpeackers.R;

import java.util.ArrayList;

public class TouristAttractionList_Adapter extends RecyclerView.Adapter<TouristAttractionList_Adapter.ViewHolder> {

    Context context;
    ArrayList<TouristAttractionList_Model> arrayList;

    public TouristAttractionList_Adapter(Context context, ArrayList<TouristAttractionList_Model> arrayList) {

        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public TouristAttractionList_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View showview = LayoutInflater.from(context).inflate(R.layout.tour_attractions_list_layout,null,true);
        return  new TouristAttractionList_Adapter.ViewHolder(showview);

    }

    @Override
    public void onBindViewHolder(@NonNull TouristAttractionList_Adapter.ViewHolder holder, int position) {
         TouristAttractionList_Model model = arrayList.get(position);

         holder.city.setText(model.city);
        holder.state.setText(model.state);
        holder.picture.setImageResource(model.image);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CityDetails.class);
                  intent.putExtra("putextra_city", model.city);


                context.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView city,state;
        ShapeableImageView picture;
        public ViewHolder(@NonNull View itemView) {


            super(itemView);

            city = itemView.findViewById(R.id.tourattr_name);
            state = itemView.findViewById(R.id.tourattr_state);
            picture = itemView.findViewById(R.id.tourattr_image);

        }
    }

}
