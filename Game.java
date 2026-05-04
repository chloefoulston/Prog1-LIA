import java.util.ArrayList;

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
    protected Genre genre;
    protected AgeRating ageRating;
    protected Platform platform;
    protected GameSession session = new GameSession();
    private ArrayList<Integer> ratings;
    
    
    public Game(String gameName, String gameDeveloper, Genre genre, AgeRating ageRating, Platform platform)
    {
        this.gameName = gameName;
        this.gameDeveloper = gameDeveloper;
        this.genre = genre;
        this.ageRating = ageRating;
        this.platform = platform;
        ratings = new ArrayList<>();        
    }
      
    public String toString()
    {
        return getGameName() + ":"  + getGenre();
    }
    
    public void getGameInfo()
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
    
    public void addRating(int rating)
    {
        Boolean validRating = (rating>=1 && rating<=5) ? true : false;
        if (validRating){
            ratings.add(rating);
        }else{
            System.out.println("INVALID RATING! ONLY ENTER VALUES BETWEEN 1-5");
        }
    }
    public void listAllRatings()
    {
        for (Integer i : ratings){
            System.out.println(i);
        }
    }
    }
