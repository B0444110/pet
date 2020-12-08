package com.example.user.newpet.pet_addpet;

import com.google.firebase.database.IgnoreExtraProperties;


@IgnoreExtraProperties
public class Track {
    private String id;
    private String trackName;
    private String tvDate;

    public Track() {

    }

    public Track(String id, String trackName, String tvDate) {
        this.tvDate = tvDate;
        this.trackName = trackName;
        this.id = id;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getTvDate() {
        return tvDate;
    }
}
