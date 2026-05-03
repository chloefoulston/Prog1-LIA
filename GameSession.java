
/**
 * Write a description of class GameSession here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameSession
{
    private Game game;
    private long startTime;
    private long endTime;
    private long duration;
    private boolean running = true;
    
    public GameSession()
    {
        start();
        
    }
    
    public void start()
    {
        running = true;
        while (running){
            this.startTime = System.currentTimeMillis();
            
        }
    }
    public void endGameSession()
    {
        running = false;
        this.endTime = (System.currentTimeMillis())/100/60;
        
    }
    public long duration()
    {
        duration = (endTime - startTime) / 60000;
        return duration;
    }
    
}