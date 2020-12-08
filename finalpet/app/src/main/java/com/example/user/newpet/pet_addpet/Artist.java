package com.example.user.newpet.pet_addpet;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Artist {
    private String artistId;
    private String artistName;
    private String artistGenre;
    private String artistGenre1;
    private String artistGenre2;

    public Artist(){
        //this constructor is required
    }

    public Artist(String artistId, String artistName, String artistGenre, String artistGenre1, String artistGenre2) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
        this.artistGenre1 = artistGenre1;
        this.artistGenre2 = artistGenre2;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistGenre() {
        return artistGenre;
    }

    public String getArtistGenre1() {
        return artistGenre1;
    }

    public String getArtistGenre2() {
        return artistGenre2;
    }
}