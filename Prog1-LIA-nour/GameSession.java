
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
    private boolean running = false;

    public void startGameSession(){
        startTime = System.currentTimeMillis();
        running = true;
    }

    public void endGameSession(){
        endTime = System.currentTimeMillis();
        running = false;
    }

    public boolean isRunning(){
        return running;
    }

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
            System.out.println("Game currently not running.");
            return 0;
        }
    }
}