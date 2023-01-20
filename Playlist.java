
/**
 * Write a description of class Playlist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList; 
public class Playlist
{
    // instance variables - replace the example below with your own
    ArrayList<Song> playlist;  

    /**
     * Constructor for objects of class Playlist
     */
    public Playlist()
    {
        // initialise instance variables
        playlist = new ArrayList<Song>(); 
  
    }
     public void addSong(Song song)
    {
        playlist.add(song); 
        
    }
    public void removeSong(Song song)
    {
        playlist.remove(song); 
    }
    public void likeSong()
    {
       
    }
    public String examineAllSongs()
    {
        String allSongs = ""; 
        for (int i = 0; i < playlist.size() -1; i++)
        {
            allSongs += playlist.get(i); 
        }
        return allSongs; 
    }
    public String examineLikedSongs()
    {
        String likedSongs = ""; 
        for (int i = 0; i < playlist.size() - 1; i++)
        {
            if (playlist.get(i).setStatus() == true)
            {
               likedSongs += playlist.get(i); 
            }
        }
        return likedSongs; 
    }
    public void totalDuration()
    {
        
    }
    public void removeUnliked()
    {
        for (int i = 0; i < playlist.size() - 1; i++)
        {
            if(playlist.get(i).setStatus() == false)
            {
                playlist.remove(i); 
                i--; 
            }
        }
    }
}
