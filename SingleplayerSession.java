
/**
 * Write a description of class SinglePlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SingleplayerSession extends GameSession
{   
     private static final int maxPlayers = 1;
     
     public SingleplayerSession(Game game)
     {
         
     }
    private boolean validSession;
    public void validSession(String name)
    {
        if (lib.getGameObj(name).getGameType().equals("SINGLEPLAYER")){
            validSession = true;
        }else{
            validSession = false;
        }
    }
     public void startGame(String gameName)
     {
                  
         
     }
}