import java.util.Random;

public class Song {
    private String title;
    private String artist;
    private int length;
    private int lastPoint;

    public Song(String title) {
        this.title = title;
    }

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public Song(Song sng) {
        this.title = sng.title;
        this.artist =  sng.artist;
        this.length = sng.length;
        this.lastPoint = sng.lastPoint;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void play() {
        System.out.println(title + lastPoint);
    }

    public void stop() {
        Random rnd = new Random();
        System.out.println(rnd.nextInt(lastPoint,length));
    }

    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", length=" + length +
                '}';
    }


}

