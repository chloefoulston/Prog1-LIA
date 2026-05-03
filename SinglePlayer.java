
/**
 * Write a description of class SinglePlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SinglePlayer extends Game
{
     private static final GameType gameType = GameType.SINGLEPLAYER;
     
     private static final int maxPlayers = 1;
     public SinglePlayer(String gameName, String gameDeveloper, Genre genre, AgeRating ageRating, Platform platform, GameType gameType)
     {
         super(gameName, gameDeveloper, genre, ageRating, platform);
         
     }
     
     public void startGame()
     {
         System.out.println("Launching " + getGameName());
     }
}