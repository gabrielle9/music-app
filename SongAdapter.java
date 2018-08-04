package com.example.android.musicalstruct;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> psongs) {
        super(context,0,psongs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check is the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_song_view, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songItemTextView = (TextView) listItemView.findViewById(R.id.song_item);
        songItemTextView.setText(currentSong.getSongTitle());

        TextView albumItemTextView = (TextView) listItemView.findViewById(R.id.album_item);
        albumItemTextView.setText(currentSong.getAlbum());

        return listItemView;
    }
}
