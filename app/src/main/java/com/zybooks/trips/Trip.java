package com.zybooks.trips;


public class Trip {
    private String mTripName;
    private String mDriver;
    private String seats;
    private String mDuration;
    private String mStartingTime;
    int image;


    public Trip(String name, String drivenBy, String seat, String StartingTime, String duration) {
        mTripName = name;
        mDriver = drivenBy;
        seats = seat;
        mStartingTime = StartingTime;
        mDuration = duration;

    }

//    public int getId() {
//        return mId;
//    }
//
//    public void setId(int id) {
//        this.mId = id;
//    }

    public String getmTripName() {
        return mTripName;
    }

    public void setmTripName(String name) {
        this.mTripName = name;
    }

    public String getmStartingTime() {
        return mStartingTime;
    }

    public void setmStartingTime(String mStartingTime) {
        this.mStartingTime = mStartingTime;
    }

    public String getmDuration() {
        return mDuration;
    }

    public void setmDuration(String mDuration) {
        this.mDuration = mDuration;
    }

    public String getmDriver() {
        return mDriver;
    }

    public void setmDriver(String mDriver) {
        this.mDriver = mDriver;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }
}