import java.util.ArrayList;
/**
 * Write a description of class GameLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameLibrary
{
    private ArrayList<Game>games;
    public GameLibrary(){
        games= new ArrayList<>();
    }
    public Game getGame(String name)
    {
        for (Game g: games){
            if(g.getName().equals(name)){
                return g;
            }
        }
        return null;
    }
    public void addGame(Game g)
    {
        games.add(g);
    }
}
