package com.example.singlepackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.Firebase;

public class SinglePackageAdapter extends FirebaseRecyclerAdapter<ModelClassOfSinglePackage,SinglePackageAdapter.singlePackageViewHolder> {
    public SinglePackageAdapter(@NonNull FirebaseRecyclerOptions<ModelClassOfSinglePackage> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull singlePackageViewHolder singlePackageViewHolder, int position, @NonNull ModelClassOfSinglePackage modelClassOfSinglePackage) {
        singlePackageViewHolder.popularity_text.setText(modelClassOfSinglePackage.getPopularity_text());
        singlePackageViewHolder .tvOfferDailyOrWeekly.setText(modelClassOfSinglePackage.getOfferDailyOrWeekly());
        singlePackageViewHolder.tvOfferName.setText(modelClassOfSinglePackage.getOfferName());
        singlePackageViewHolder .tvPackageUseFulFor.setText(modelClassOfSinglePackage.getPackageUseFulFor());
        singlePackageViewHolder.tvPackageDataType.setText(modelClassOfSinglePackage.getPackageDataType());
        singlePackageViewHolder.tvPackageDataInNumbers.setText(modelClassOfSinglePackage.getPackageDataInNumbers());
        singlePackageViewHolder.tvPackagePrice.setText(modelClassOfSinglePackage.getPackagePrice());
    }

    @NonNull
    @Override
    public singlePackageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_design_package,parent,false);
        return new singlePackageViewHolder(view);
    }

    public class singlePackageViewHolder extends RecyclerView.ViewHolder{
    TextView popularity_text,tvOfferDailyOrWeekly, tvOfferName,
              tvPackagePrice,tvPackageDataInNumbers,
              tvPackageUseFulFor,tvPackageDataType;

        public singlePackageViewHolder(@NonNull View itemView) {
            super(itemView);
            popularity_text = itemView.findViewById(R.id.popularity_text);
            tvOfferDailyOrWeekly = itemView.findViewById(R.id.tvOfferDailyOrWeekly);
            tvOfferName = itemView.findViewById(R.id.tvOfferTimeName);
            tvPackagePrice = itemView.findViewById(R.id.tvPackagePrice);
            tvPackageDataInNumbers = itemView.findViewById(R.id.tvPackageDataInNumbers);
            tvPackageUseFulFor = itemView.findViewById(R.id.tvPackageUseFulFor);
            tvPackageDataType = itemView.findViewById(R.id.tvPackageDataType);
        }
    }


}
