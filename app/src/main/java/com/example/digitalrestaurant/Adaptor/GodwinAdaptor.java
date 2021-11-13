package com.example.digitalrestaurant.Adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digitalrestaurant.R;
import com.example.digitalrestaurant.UserData.ItemData;

import java.util.ArrayList;

public class GodwinAdaptor extends RecyclerView.Adapter<GodwinAdaptor.GodwinViewHolder> {

    ArrayList<ItemData> itemDatalist;

    public GodwinAdaptor(ArrayList<ItemData> itemDatalist) {
        this.itemDatalist = itemDatalist;
    }

    public class GodwinViewHolder extends RecyclerView.ViewHolder {
        private TextView price,name,nationality,addtocart;
        private RatingBar ratingBar;

        public GodwinViewHolder(@NonNull View itemView) {
            super(itemView);

            price=itemView.findViewById(R.id.price1);
            name=itemView.findViewById(R.id.jelof1);
            nationality=itemView.findViewById(R.id.nigerian1);


        }
    }

    @NonNull
    @Override
    public GodwinAdaptor.GodwinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemise= LayoutInflater.from(parent.getContext()).inflate(R.layout.items_display,parent,true );
        return new GodwinViewHolder(itemise);
    }

    @Override
    public void onBindViewHolder(@NonNull GodwinAdaptor.GodwinViewHolder holder, int position) {
        holder.price.setText(itemDatalist.get(position).getPrice());
        holder.name.setText(itemDatalist.get(position).getName());
        holder.nationality.setText(itemDatalist.get(position).getNationality());



    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
