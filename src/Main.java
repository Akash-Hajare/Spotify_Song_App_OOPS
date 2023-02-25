import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Album> album= new ArrayList<>();

    public static void main(String[] args) {
        Album album1= new Album("New songs","Arjit");
        album1.addSongToAlbum("kesariya",4.06);
        album1.addSongToAlbum("galti se mistake",3.6);
        album1.addSongToAlbum("yarana",6.5);

        Album album2= new Album("old songs","Lata");
        album2.addSongToAlbum("ye mere vatan ",6.8);
        album2.addSongToAlbum("vande",5.1);
        album2.addSongToAlbum("shakti",8.5);

        album.add(album1);
        album.add(album2);

        System.out.println(album1.findSong("yarana"));

        LinkedList<Song> myPlayList= new LinkedList<>();
        album1.addToPlaylistFromAlbum("yarana",myPlayList);
        album2.addToPlaylistFromAlbum(2, myPlayList);

        System.out.println(myPlayList);
    }
}