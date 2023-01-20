 
/**
 * Showing the Playlist program
 *
 * @author Edith and Grace
 * @version 01-19-2023
 */

import java.util.ArrayList; 
public class PlaylistTester
{
    public static void main(String[] args)
    {
        //to test the song object
        Song song1 = new Song("the 1", "Taylor Swift", "3:30"); 
        System.out.println(song1.getName()); 
        System.out.println(song1.getArtist()); 
        System.out.println(song1.getDuration()); 
        System.out.println(song1.getStatus()); 
        song1.setStatus();  
        System.out.println(song1.getStatus());
        // testing the playlist array
        Playlist graceandedithrecs = new Playlist();
        graceandedithrecs.addSong("invisible string", "Taylor Swift", "4:13");
        graceandedithrecs.addSong("Flowers", "Miley Cyrus", "3:22");
        graceandedithrecs.addSong("marjorie", "Taylor Swift", "4:18");
        graceandedithrecs.addSong("Kill Bill", "SZA", "2:38");
        
        
    }
}
