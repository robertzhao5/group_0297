package MusicUtil;

import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import jaco.mp3.player.MP3Player;

public abstract class Playlist {
    protected List<Integer> musics;
    private String name;
    private String about = "";

    public Playlist(String name, String about) {
        this.name = name;
        this.about = about;
    }

    public Playlist(String name) {
        this.musics = new ArrayList<>();
        this.name = name;
    }

    public Playlist() {
        this.musics = new ArrayList<>();
    }


    public abstract boolean add(Integer musicid);


    public abstract boolean remove(Integer musicid);

    public abstract boolean empty();

    public abstract boolean isSharable();

    public abstract List getMusics();

    public String getAbout() {
        return this.about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List content() {
        return musics;
    }

    public void play(){
//        MP3Player player = new MP3Player();
//        for(Song song : musics){
//            player.addToPlayList(new File(song.getFilepath()));
//        }
//        player.play();
        // uncomment this method when we've replaced the musics variable with a List of Songs instead of a
        // List of Integers.
    }

}
