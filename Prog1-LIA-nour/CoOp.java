
/**
 * Write a description of class COOP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CoOp extends Game
{
    private static final int maxPlayers = 4;
    private static final GameType gameType = GameType.COOP;
    public CoOp(String gameName, String gameDeveloper, Genre genre, AgeRating ageRating, Platform platform)
    {
        super(gameName, gameDeveloper, genre, ageRating, platform);
    }
    public void startGame()
     {
         System.out.println("Launching " + getGameName());
         System.out.println("Add Players");
         System.out.println("Start Game");
     }
}