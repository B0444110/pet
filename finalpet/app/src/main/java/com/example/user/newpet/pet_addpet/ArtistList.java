package com.example.user.newpet.pet_addpet;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.user.newpet.R;

import java.util.List;


public class ArtistList extends ArrayAdapter<Artist> {
    private Activity context;
    List<Artist> artists;

    public ArtistList(Activity context, List<Artist> artists) {
        super(context, R.layout.layout_artist_list, artists);
        this.context = context;
        this.artists = artists;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_artist_list, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewGenre = (TextView) listViewItem.findViewById(R.id.textViewGenre);
        TextView textViewGenre1 = (TextView) listViewItem.findViewById(R.id.textViewGenre1);
        TextView textViewGenre2 = (TextView) listViewItem.findViewById(R.id.textViewGenre2);

        Artist artist = artists.get(position);
        textViewName.setText(artist.getArtistName());
        textViewGenre.setText(artist.getArtistGenre());
        textViewGenre1.setText(artist.getArtistGenre1());
        textViewGenre2.setText(artist.getArtistGenre2());

        return listViewItem;
    }
}
