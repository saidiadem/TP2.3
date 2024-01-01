import java.util.HashMap;

public class FreeUser extends Person implements User{
    protected String name;
    protected HashMap<String,Playlist> playlists;

    public FreeUser(String name) {
        this.name = name;
        this.playlists = new HashMap<String,Playlist>();
    }
    public String getName() {
        return name;
    }
    public void createPlaylist(String playlistname) {
        if (playlists.containsKey(playlistname)) {
            System.out.println(playlistname+" playlist already exists");
            return;
        }
        if(playlists.size()>=3) {
            System.out.println("3 playlist limit reached");
            return;
        }
        playlists.put(playlistname, new Playlist(playlistname));
        System.out.println(playlistname+" playlist created successfully");
    }
    public void deletePlaylist(String playlistname) {
        if (!playlists.containsKey(playlistname)) {
            System.out.println(playlistname+" playlist not found");
            return;
        }
        playlists.remove(playlistname);
        System.out.println(playlistname+" playlist deleted successfully");
    }
    public void listPlaylists() {
        System.out.println("---------------------------------");
        System.out.println("Playlists under "+name+" user:");
        for (String playlistname : playlists.keySet()) {
            System.out.println(playlistname);
        }
        System.out.println("---------------------------------");
    }
    public void listSongs(String playlistname) {
        if (!playlists.containsKey(playlistname)) {
            System.out.println(playlistname+" playlist not found");
            return;
        }
        playlists.get(playlistname).listSongs();
    }
    public void listen(Song song) {
        System.out.println("You are listening to "+song.getSongName());
        song.playSong();
    }
    public void listen(String playlistname) {
        if (!playlists.containsKey(playlistname)) {
            System.out.println(playlistname+" playlist not found");
            return;
        }
        System.out.println("You are listening to "+playlistname+" playlist");
        playlists.get(playlistname).playPlaylist();
    }
    public void addToPlaylist(String playlistname, Song song) {
        if (!playlists.containsKey(playlistname)) {
            System.out.println(playlistname+" playlist not found");
            return;
        }
        playlists.get(playlistname).addSong(song);
    }
    public void removeFromPlaylist(String playlistname, String songName) {
        if (!playlists.containsKey(playlistname)) {
            System.out.println(playlistname+" playlist not found");
            return;
        }
        playlists.get(playlistname).removeSong(songName);
    }
}
