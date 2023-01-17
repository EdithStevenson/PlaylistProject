
/**
 * The Song Object inclues its name, artist, duration, and like-status
 *
 * @author Edith and Grace
 * @version Jan 16, 2022
 */
public class Song
{
    // instance variables
    private String name;
    private String artist;
    private String duration;
    private boolean like;

    /**
     * Constructor for objects of class Song
     */
    public Song(String name, String artist, String duration)
    {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        like = false; //songs will start out not liked
    }

    /**
     * Gets name of Song
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets artist of Song
     *
     * @return the artist of the song
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Gets duration of Song
     *
     * @return the duration of the song
     */
    public String getDuration()
    {
        return duration;
    }
    
    /**
     * Gets like-status of Song
     *
     * @return the like-status of the song
     */
    public String getStatus()
    {
        if (like)
            return " -- liked";
        else
            return "";
    }
    
    /**
     * Sets like-status of Song to opposite of what it currently is
     *
     */
    public void setStatus()
    {
        if (like)
            like = false;
        else
            like = true;
    }
}