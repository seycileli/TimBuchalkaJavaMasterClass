package musicApp;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    //create 2 fields (instance variables)
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album() {
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        /*
        Checking to see that we don't add duplicated songs
         */
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        /*
        This is an alternative way of using the for loop, by using the for each loop
        instead of typing int i = 0, i++ and having the loop iterate and increment
        internally the for each is a short cut and is doing the same as the for loop
         */
        for (Song checkedSongs : this.songs) {
            if(checkedSongs.getTitle().equals(title)) {
                return checkedSongs;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index > 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This song " + title + " is not in this album");
        return false;
    }
}
