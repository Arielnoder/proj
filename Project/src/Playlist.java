import java.util.Arrays;

public class Playlist {
    private String plName;
    private Song[] songs;

    private int counter;

    public Playlist(String plName) {
        this.plName = plName;
    }


    public Playlist(String plName, Song[] songs) {
        this.plName = plName;
        this.songs = songs;
    }

    public Song[] getSongList() {
        return songs;
    }

    public void setSongList(Song[] songs) {
        this.songs = songs;
    }


    public String getPlName() {
        return plName;
    }

    public void setPlName(String plName) {
        this.plName = plName;
    }

    public Song getSongByIndex(int i) {
        return songs[i];

        }

    public Song getSongByName(String name) {
        for (int i = 0; i < songs.length; i++) {
            if(songs[i].getTitle() == name) {
                return songs[i];
            }
        }
        return null;
    }

    public void replace(Song sng,int i) {
        songs[i] = sng;
    }
    public void add(Song sng) {
       songs[songs.length + 1] = sng;
    }

    public void addByIndex(Song sng,int i) {
        for (int j = 0; j < songs.length; j++) {
            if (j == i) {
                songs[i] = songs[i + 1];
                songs[i] = sng;


            }
        }
    }

    public void remove(int i) {
        Song[] songscopy = new Song[songs.length - 1];
        for (int j = 0; j < songs.length; j++) {
            if(j != i) {
                songscopy[j++] = songs[i];
            }
        }
    }

    public void play() {
        for (int i = 0; i < songs.length; i++) {
            songs[i].play();
        }
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "plName='" + plName + '\'' +
                ", songs=" + Arrays.toString(songs) +
                '}';
    }
}


