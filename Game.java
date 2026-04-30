
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    protected String gameName;
    protected String gameCreator;
    protected int rating;
    
    
    public Game(String gameName, String gameCreator, int rating)
    {
        this.gameName = gameName;
        this.gameCreator = gameCreator;
        this.rating = rating;
        
    }
    public String getName()
    {
        return gameName;
    }
    
}