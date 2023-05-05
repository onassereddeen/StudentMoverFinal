package com.zybooks.trips;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

public class TripHolder extends RecyclerView.ViewHolder {

    ImageView imageView;

    TextView startTime, duration, durationTime, tripName, drivenBy, seatsFilled;
    Button request;
    View rootView;

    public TripHolder(@NonNull View itemView) {
        super(itemView);
        rootView = itemView;
        startTime = itemView.findViewById(R.id.start_time);
        duration = itemView.findViewById(R.id.duration);
        durationTime = itemView.findViewById(R.id.duration_time);
        tripName = itemView.findViewById(R.id.trip_name);
        drivenBy = itemView.findViewById(R.id.trip_driver);
        seatsFilled = itemView.findViewById(R.id.seat);
        request = itemView.findViewById(R.id.requestTrip);

        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(rootView.getContext(), "Trip Requested", Toast.LENGTH_LONG).show();
            }
        });



    }

}
