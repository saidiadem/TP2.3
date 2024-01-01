public class PremiumUser extends FreeUser {
    public PremiumUser(String name) {
        super(name);
    }

    @Override
    public void createPlaylist(String playlistname) {
        if (playlists.containsKey(playlistname)) {
            System.out.println(playlistname+" playlist already exists");
            return;
        }
        playlists.put(playlistname, new Playlist(playlistname));
        System.out.println(playlistname+" playlist created successfully");
    }

    public void shufflePlaylist(String playlistname) {
        if (!playlists.containsKey(playlistname)) {
            System.out.println(playlistname+" playlist not found");
            return;
        }
        playlists.get(playlistname).shuffle();
        System.out.println(playlistname+" playlist has been shuffled");
    }

}