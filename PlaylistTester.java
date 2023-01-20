 
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
        //to test the song object - delete before turning in
        Song song1 = new Song("the 1", "Taylor Swift", 210); 
        System.out.println(song1.getName()); 
        System.out.println(song1.getArtist()); 
        System.out.println(song1.getDuration()); 
        System.out.println(song1.getStatus()); 
        song1.setStatus();  
        System.out.println(song1.getStatus());
        
        // testing the playlist array - keep!
        System.out.println("Initializing a Playlist...");
        Playlist graceandedithrecs = new Playlist();
        System.out.println("");
        
        System.out.println("Adding Songs to Playlist...");
        System.out.println("");
        
        graceandedithrecs.addSong("invisible string", "Taylor Swift", 253);
        System.out.println("Added 'invisible string' by Taylor Swift (4:13)");
        graceandedithrecs.addSong("Flowers", "Miley Cyrus", 202);
        System.out.println("Added 'Flowers' by Miley Cyrus (3:12)");
        graceandedithrecs.addSong("marjorie", "Taylor Swift", 258);
        System.out.println("Added 'marjorie' by Taylor Swift (4:18)");
        graceandedithrecs.addSong("Kill Bill", "SZA", 158);
        System.out.println("Added 'Kill Bill' by SZA (2:38)");
        System.out.println("");
        
        System.out.println("Printing Playlist...");
        System.out.println("");
        System.out.println(graceandedithrecs.formatListofSongs());
        System.out.println("");
        
        System.out.println("Liking Songs 1 and 4");
        graceandedithrecs.likeSong("invisible string");
        graceandedithrecs.likeSong("Kill Bill");
        System.out.println("");
        System.out.println("Printing Playlist...");
        System.out.println("");
        System.out.println(graceandedithrecs.formatListofSongs());
        System.out.println("");
        
        System.out.println("Removing Song 3");
        graceandedithrecs.removeSong("Flowers");
        System.out.println("");
        System.out.println("Printing Playlist...");
        System.out.println("");
        System.out.println(graceandedithrecs.formatListofSongs());
        System.out.println("");
        
        System.out.println("Printing Playlist of Just Liked Songs");
        System.out.println("");
        System.out.println(graceandedithrecs.examineLikedSongs());
        System.out.println("");
        
        System.out.println("Printing Total Duration of Songs");
        System.out.println(graceandedithrecs.getTotalDuration());
        System.out.println("");
        
        System.out.println("Removing all unliked songs (with one method)");
        graceandedithrecs.removeUnliked();
        System.out.println("");
        
        System.out.println("Printing Playlist...");
        System.out.println("");
        System.out.println(graceandedithrecs.formatListofSongs());
    }
}
