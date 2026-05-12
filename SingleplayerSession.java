
/**
 * Write a description of class SinglePlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SingleplayerSession extends GameSession
{   
    private static final int maxPlayers = 1;
    
    private boolean validSession;
    public SingleplayerSession(Game game)
    {
        System.out.println(game.getGameName() + " has started");
        boolean running = true;
        
    }
    public void validSession(String name)
    {
        if (lib.getGameObj(name).getGameType().equals("SINGLEPLAYER")){
            validSession = true;
        }else{
            validSession = false;
        }
    }
    public void startSession(Game game)
    {
         
    }
    
}