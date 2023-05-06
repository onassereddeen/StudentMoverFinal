package com.zybooks.trips;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
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

        // Add a tag to the request button to associate it with this item's position in the RecyclerView
        request.setTag(getAdapterPosition());

        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the position of this item in the RecyclerView
                int position = (int) v.getTag();

                // Create and show the dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(itemView.getRootView().getContext());
                builder.setTitle("Request Confirmation");
                builder.setMessage("Would you like to request this ride?");

                // Add positive button
                builder.setPositiveButton("Request", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Positive button clicked
                    }
                });

                // Add negative button
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Negative button clicked
                    }
                });

                // Create and show the dialog
                AlertDialog dialog = builder.create();
                dialog.show();

                // Center the dialog on the screen
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setGravity(Gravity.CENTER);
                }
            }
        });
    }
}
