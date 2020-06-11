package entities;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.addSong(new Song(title, duration));

        //no need for the below code anymore now that we've refactored
/*        if(songs.findSong(title) == null) {
            this.songs.addSong(new Song(title, duration));
            return true;
        }
        return false;
        */
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);

        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

/*        int index = trackNumber -1;
        if((index >+ 0) && (index <= this.songs.size())) {
            playList.add(this.songs.addSong(index));
            return true;
        }
*/
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList {
        /* This is our song list, which we will be saving our songs to
        * within the ArrayList, we are adding the Song class, which contains
        * the Song's information, such as Song title and Song duration */
        private ArrayList<Song> songs;

        public SongList() {
            //our Constructor
            this.songs = new ArrayList<Song>();
        }

        public boolean addSong(Song song) {
            //a method to add songs to our playlist
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for(Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index >= 0) && (index <= songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}
