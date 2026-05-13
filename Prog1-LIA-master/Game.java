import java.util.ArrayList;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    private String gameName;
    private String gameDeveloper;
    private Genre genre;
    private AgeRating ageRating;
    private Platform platform;
    private GameType gameType;
    private ArrayList<Integer> ratings;
    
    
    public Game(String gameName, String gameDeveloper, Genre genre, AgeRating ageRating, Platform platform,GameType gameType)
    {
        this.gameName = gameName;
        this.gameDeveloper = gameDeveloper;
        this.genre = genre;
        this.ageRating = ageRating;
        this.platform = platform;
        this.gameType = gameType;
        ratings = new ArrayList<>();        
    }
    // overides toString()  
    public String toString()
    {
        return getGameName();
    }
    // prints all game info
    public void getGameInfo()
    {
        System.out.println("Game Tittle : " + getGameName());
        System.out.println("Game Developer : " + getGameDeveloper());
        System.out.println("Genre : " + getGenre());
        System.out.println("Platform : " + getPlatform());
        System.out.println("Age Rating : " + getAgeRating());
    }
    //add rating
    public void addRating(int rating)
    {
        Boolean validRating = (rating>=1 && rating<=5) ? true : false;
        if (validRating){
            ratings.add(rating);
        }else{
            System.out.println("INVALID RATING! ONLY ENTER VALUES BETWEEN 1-5");
        }
    }
    //list all ratings
    public void listAllRatings()
    {
        for (Integer i : ratings){
            System.out.println(i);
        }
    }
    
    public double getAverageRating()
    {
        int ratingSum=0;
        double average;
        for (Integer i : ratings){
            ratingSum = i + ratingSum;
            
        }
        average = ratingSum / ratings.size();
        return average;
        
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
    public String getGameType()
    {
        return gameType.toString();
    }
    
    
}
