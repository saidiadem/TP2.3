public class Main {
    public static void main(String[] args) {
        FreeUser freeuser = new FreeUser("freeuser");
        freeuser.createPlaylist("playlist1");
        freeuser.createPlaylist("playlist2");
        freeuser.createPlaylist("playlist3");
        freeuser.createPlaylist("playlist4");
        Song freesong1 = new Song("song1", "lyrics1", 1, "genre1");
        Song freesong2 = new Song("song2", "lyrics2", 2,"genre2");
        freeuser.addToPlaylist("playlist1", freesong1);
        freeuser.addToPlaylist("playlist1", freesong2);
        freeuser.addToPlaylist("playlist2", freesong1);
        freeuser.listen(freesong1);
        freeuser.listen("playlist1");
        freeuser.removeFromPlaylist("playlist1", "song1");
        freeuser.listen("playlist1");
        PremiumUser premiumuser = new PremiumUser("PremiumUser");
        premiumuser.createPlaylist("Playlist1");
        premiumuser.createPlaylist("Playlist2");
        premiumuser.createPlaylist("Playlist3");
        premiumuser.createPlaylist("Playlist4");
        premiumuser.addToPlaylist("Playlist1", new Song("Song1", "Lyrics1", 1, "Genre1"));
        premiumuser.addToPlaylist("Playlist1", new Song("Song2", "Lyrics2", 2, "Genre2"));
        premiumuser.addToPlaylist("Playlist1", new Song("Song3", "Lyrics3", 3, "Genre3"));
        premiumuser.shufflePlaylist("Playlist1");
        premiumuser.listSongs("Playlist1");
        Song song1 = new Song("Song1", "Lyrics1", 1, "Genre1");
        Song song2 = new Song("Song2", "Lyrics2", 2, "Genre2");
        Song song3 = new Song("Song3", "Lyrics3", 3, "Genre3");
        Song song4 = new Song("Song4", "Lyrics4", 4, "Genre4");
        Album album = new Album("AlbumName", new Song[] {song1, song2});
        album.addSong(new Song[] {song4, song3});
        album.addSong(song1);
        album.listSongs();
        album.playSong("Song1");
        Song song = new Song("Highway to Hell",
                "Living easy, lovin' free\r\n" + //
                        "Season ticket on a one way ride\r\n" + //
                        "Asking nothing, leave me be\r\n" + //
                        "Taking everythin' in my stride\r\n" + //
                        "Don't need reason, don't need rhyme\r\n" + //
                        "Ain't nothing I'd rather do\r\n" + //
                        "Goin' down, party time\r\n" + //
                        "My friends are gonna be there too, yeah\r\n" + //
                        "I'm on the highway to hell\r\n" + //
                        "On the highway to hell\r\n" + //
                        "Highway to hell\r\n" + //
                        "I'm on the highway to hell", 213, "Rock and roll");
        song.playSong();
    }
}