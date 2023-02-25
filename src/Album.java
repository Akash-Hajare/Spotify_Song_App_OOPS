import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

   private String name;
    private String artist;
    private List<Song> songs;

    public Album(String name,String artist) {
        this.artist = artist;
        this.name=name;
        this.songs=new ArrayList<>();
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean findSong(String title){
        for(Song s:songs){
            if(s.getTitle().equals(title))
                return true;
        }
        return false;
    }
   public void addSongToAlbum(String name, double duration){
        Song s=new Song(name,duration);
        if(findSong(s.getTitle())){
            System.out.println("Song is already present");
        }
        else{
            songs.add(s);
            System.out.println("New Song has been added");
        }
        return;
    }
    public void addToPlaylistFromAlbum(String title, LinkedList<Song> playList) {
        if (findSong(title)) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    playList.add(song);
                    System.out.println("Song has been added to your playlist");
                    break;
                }
            }
        }
        else {
            System.out.println("Song is not present in the album");
        }
    }
    public void addToPlaylistFromAlbum(int trackNo,LinkedList<Song> playList){
        int index = trackNo-1;
        if(index>=0 && index<songs.size()){
            playList.add(songs.get(index));
            System.out.println("Song has been added to your playlist");
        }
        else{
            System.out.println("Invalid track number");
        }
    }
}
