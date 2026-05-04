
/**
 * Write a description of class OnlineMultiplayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OnlineMultiplayer extends Game
{
    private static final GameType gameType = GameType.ONLINEMULTIPLAYER;
    public OnlineMultiplayer(String gameName, String gameDeveloper, Genre genre, AgeRating ageRating, Platform platform)
    {
        super(gameName, gameDeveloper, genre, ageRating, platform);
        
    }
    public void startGame()
     {
         System.out.println("Launching " + getGameName());
         System.out.println("Choose Server");
         System.out.println("Joining Server");
     }
}