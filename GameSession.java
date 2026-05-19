
/**
 * Write a description of class CopyOfGameSession here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class GameSession
{
    protected GameLibrary lib;
    protected long startTime;
    protected long endTime;
    protected long duration;
    protected boolean running = false;
    
    public GameSession(){
        lib = new GameLibrary();
    }
    

    public String toString() {
        return "GameSession: running = " + running + ", duration = " + duration + "s";
    }
    // takes game object and ends session
    public void endGame(Game game){
        endTime = System.currentTimeMillis();
        System.out.println("exiting "+ game);
        running = false;
    }
    public abstract void startSession(Game game);
    public boolean isRunning(){
        return running;
    }
    
    // found a way to make milliseconds into seconds minutes and hours
    // by searching it up, should be fine now. I forgot about the fact I
    // can just divide the seconds by how many there are in minutes and hours
    // NOT USED IN RESPONDER BTW!
    public long getGameDuration(){
        duration = (System.currentTimeMillis() - startTime) / 1000;
        if (running){
            long seconds = duration % 60;
            long minutes = (duration / 60) % 60;
            long hours = duration / 3600;
            if (hours > 0){
                System.out.println("Game duration: " + hours + "h " + minutes + "min " + seconds + "s." );
            }else if (minutes > 0){
                System.out.println("Game duration: " + minutes + "min " + seconds + "s." );
            }else{
                System.out.println("Game duration: " + seconds + "s." );
            }
            return duration;
        }else{
            System.out.println("Game not running.");
            return 0;
        }
    }
}
