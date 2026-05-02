
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    protected String gameName;
    protected String gameDeveloper;
    protected int rating;
    protected Genre genre;
    protected AgeRating ageRating;
    protected Platform platform;
    
    public Game(String gameName, String gameDeveloper, Genre genre, AgeRating ageRating, Platform platform)
    {
        this.gameName = gameName;
        this.gameDeveloper = gameDeveloper;
        this.genre = genre;
        this.ageRating = ageRating;
        this.platform = platform;
                
    }
    
    public void gameInfo()
    {
        System.out.println("Game Tittle : " + getGameName());
        System.out.println("Game Developer : " + getGameDeveloper());
        System.out.println("Genre : " + getGenre());
        System.out.println("Platform : " + getPlatform());
        System.out.println("Age Rating : " + getAgeRating());
    }
    public String getGameName()
    {
        return gameName;
    }
    
    public String getGameDeveloper()
    {
        return gameDeveloper;
    }
    
    public String getGenre()
    {
        return genre.toString();
    }
    
    public String getAgeRating()
    {
        return ageRating.toString();
    }
    
    public String getPlatform()
    {
        return platform.toString();
    }
    }
