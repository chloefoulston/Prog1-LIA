
/**
 * Write a description of class COOP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class COOPSession extends GameSession
{
    private static final int maxPlayers = 4;
    private boolean validSession;
    public void validSession(String name)
    {
        if (lib.getGameObj(name).getGameType().equals("COOP")){
            validSession = true;
        }else{
            validSession = false;
        }
    }
    }