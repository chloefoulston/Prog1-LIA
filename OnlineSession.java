
/**
 * Write a description of class Multiplayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OnlineSession extends GameSession
{
    public OnlineSession(Game game)
    {
        System.out.println(game.getGameName() + " has started, select server");
        running = true;
        startTime = System.currentTimeMillis();
    }
    private boolean validSession;
    public void validSession(String name)
    {
        if (lib.getGameObj(name).getGameType().equals("ONLINEMULTIPLAYER")){
            validSession = true;
        }else{
            validSession = false;
        }
    }
    public void startSession(Game game)
    {
       
    }
}

