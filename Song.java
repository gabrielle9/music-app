package com.example.android.musicalstruct;

public class Song {

        private String mSongTitle;

        private String mSongAlbum;


        public Song(String songTitle, String songAlbum) {
            mSongTitle = songTitle;
            mSongAlbum = songAlbum;
        }

        public String getSongTitle() {
            return mSongTitle;
        }

        public String getAlbum() {
            return mSongAlbum;
        }

}
