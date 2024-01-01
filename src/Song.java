public class Song {
    private String name;
    private String lyrics;
    private int length;
    private String genre;

    public Song(String name, String lyrics, int length, String genre) {
        this.name = name;
        this.lyrics = lyrics;
        this.length = length;
        this.genre = genre;
    }

    public String getSongName() {
        return name;
    }
    public int getSongLength() {
        return length;
    }
    public String getSongGenre() {
        return genre;
    }
    public void playSong() {
        System.out.println("Playing " + name);
        System.out.println("────@───────────────────");
        System.out.println(lyrics);
    }

}
