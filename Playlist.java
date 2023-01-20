
/**
 * The Playlist Array
 *
 * @author Grace and Edith
 * @version 01-19-2023
 */

import java.util.ArrayList; 
public class Playlist
{
    // instance variables - replace the example below with your own
    private ArrayList<Song> playlist;  

    /**
     * Constructor for objects of class Playlist
     */
    public Playlist()
    {
        // initialise instance variables
        playlist = new ArrayList<Song>(); 
    }
    
    /**
     * adds a song to the playlist
     * @param song name
     * @param song artist
     * @param song duration
     */
    public void addSong(String name, String artist, int duration)
    {
        playlist.add(new Song(name,artist,duration)); 
    }
    
    /**
     * removes song from playlist (using the song's name)
     * 
     * @param name of song user wishes to remove
     */
    public void removeSong(String name)
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).getName().equals(name))
            {
                playlist.remove(i);
            }
        }
    }
    
    /**
     * likes song from playlist (using the song's name)
     * 
     * @param name of song user wishes to like
     */
    public void likeSong(String name)
    {
       for (int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).getName().equals(name))
            {
                playlist.get(i).setStatus();
            }
        }
    }
    
    /**
     * Completes and Formats the playlist (ready to be printed)
     * 
     * @returns a String that displays the playlist
     */
    public String formatListofSongs()
    {
        String allSongs = ""; 
        for (int i = 0; i < playlist.size(); i++)
        {
            allSongs += playlist.get(i).getName(); 
            allSongs += " by ";
            allSongs += playlist.get(i).getArtist(); 
            allSongs += " (";
            allSongs += playlist.get(i).getDuration(); //replace with convert
            allSongs += ")";
            if (playlist.get(i).getStatus())
            {
                allSongs += " -- liked";
            }
            allSongs += "\n";
        }
        return allSongs; 
    }
    
    /**
     * gets the total duration of the playlist
     * 
     * @return total playing time
     */
    public int getTotalDuration()
    {
        int total = 0;
        for (int i = 0; i < playlist.size(); i++)
        {
             total += playlist.get(i).getDuration();
        }
        return total;
    }
    
    /**
     * creates printable display of liked songs
     * 
     * @return a String of liked songs with formatting
     */
    public String examineLikedSongs()
    {
        String likedSongs = ""; 
        for (int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).getStatus() == true)
            {
                likedSongs += playlist.get(i).getName(); 
                likedSongs += " by ";
                likedSongs += playlist.get(i).getArtist(); 
                likedSongs += " (";
                likedSongs += playlist.get(i).getDuration(); //replace with convert
                likedSongs += ") -- liked";
                likedSongs += "\n";
            }
        }
        return likedSongs; 
    }
    
    /**
     * removes unliked songs from the Playlist
     * 
     */
    public void removeUnliked()
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            if(playlist.get(i).getStatus() == false)
            {
                playlist.remove(i); 
            }
        }
    }
}
