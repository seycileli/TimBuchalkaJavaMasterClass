package musicApp;

import java.util.*;
import entities.Album;
import entities.Song;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();
    private static Album album = new Album();
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        myAlbums();

    }

    public static void myAlbums() {

        Album album = new Album("Goodbye & Good Riddance", "Juice WRLD");
        album.addSong("Intro", 1.14);
        album.addSong("All Girls Are The Same", 2.45);
        album.addSong("Lucid Dream", 3.59);
        album.addSong("Wasted (featuring Lil Uzi Vert", 4.18);
        album.addSong("Armed & Dangerous", 2.49);
        album.addSong("Black & White", 3.06);
        album.addSong("Lean wit Me", 2.55);
        album.addSong("I'll Be Fine", 4.04);
        album.addSong("Used To", 2.56);
        album.addSong("Candles", 3.03);
        album.addSong("Scared of Love", 2.50);
        album.addSong("Hurt Me", 2.02);
        album.addSong("I'm Still", 3.12);
        album.addSong("End of the Road", 2.42);
        album.addSong("Long Gone", 3.07);
        album.addSong("Betrayal (Skit)",1.04);
        album.addSong("Karma (Skit)", 1.14);
        albums.add(album);

        album = new Album("The Perfect LUV Tape", "Lil Uzi Vert");
        album.addSong("Do What I Want", 2.55);
        album.addSong("Of Course We Ghetto Flowers", 4.22);
        album.addSong("Original Uzi (4 of Us)", 2.46);
        album.addSong("Wasted (featuring Lil Uzi Vert", 4.18);
        album.addSong("Money Mitch", 4.07);
        album.addSong("Sideline Watching (Hold Up)", 3.11);
        album.addSong("Alfa Romeo AW30 (I Can Drive)", 2.33);
        album.addSong("You're Losto", 2.38);
        album.addSong("Erase Your Social", 3.20);
        album.addSong("Ronda (Winners)", 3.36);
        album.addSong("Seven Million (featuring Future", 3.02);
        albums.add(album); //adding this album into our directory, now we have a total of 2 different albums

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("I'm Still", playList);
        albums.get(0).addToPlaylist("Candles", playList);
        albums.get(0).addToPlaylist("Long Gone", playList);
        albums.get(1).addToPlaylist("Erase Your Social", playList);
        albums.get(1).addToPlaylist("Do What I Want", playList);
        albums.get(1).addToPlaylist("Of Course We Ghetto Flowers", playList);
        play(playList);

    }

    public static void play(LinkedList<Song> playList) {
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> songListIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("Playlist is empty");
            return;
        } else {
            System.out.println("Now playing: " +
                    songListIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = s.nextInt();
            s.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    //a function to hit skip, or go to next song
                    if (!forward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        forward = true;
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("Now playing " +
                                songListIterator.next().toString());
                    } else {
                        System.out.println("End of playlist");
                    }
                    forward = false;
                    break;
                case 2:
                    //a function to hit previous and play previous songs
                    if (forward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        forward = false;
                    }
                    if (songListIterator.hasPrevious()) {
                        System.out.println("Now playing + " + songListIterator.previous().toString());
                    } else {
                        System.out.println("We're at the start of the playlist");
                    }
                    break;
                case 3:
                    //repeat song
                    if (forward) {
                        if(songListIterator.hasPrevious()) {
                            System.out.println("Now replaying " + songListIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the playlist");
                        }
                    } else {
                        if (songListIterator.hasNext()) {
                            System.out.println("Now replaying " + songListIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    /*
                    If greater than 0 when song is removed,
                    play either the next song or the previous song in the list
                     */
                    if (playList.size() > 0) {
                        songListIterator.remove();
                        if (songListIterator.hasNext()) {
                            System.out.println("Now playing " + songListIterator.next());
                        } else if (songListIterator.hasPrevious()) {
                            System.out.println("Now plying " + songListIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printList(LinkedList<Song> playList) {
        //a method to print out the list of the songs
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=============================");

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=============================");
    }

    private static void printMenu() {
        /*
        this method is a menu. The menu will show the options that the user has
        and how to use their playlist
        Such as, how to skip
        how to reverse
        how to repeat, etc
         */
        System.out.println("\n Available Actions Below \n Press: " +
                "\n 0 - To exit application " +
                "\n 1 - To play next song " +
                "\n 2 - To play the previous song " +
                "\n 3 - To repeat the song " +
                "\n 4 - List songs in the playlist " +
                "\n 5 - Print available actions " +
                "\n 6 - Delete song from current playlist ");
    }
}
