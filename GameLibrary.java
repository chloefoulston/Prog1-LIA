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
    private ArrayList<GameSession>session;
    public GameLibrary(){
        games= new ArrayList<>();
        
    }
    public Game getGame(String name)
    {
        for (Game g : games){
            if (g.getGameName().equals(name)){
                return g;
                
            }
        }
        return null;
    }
    public void addGame(Game g)
    {
        games.add(g);
    }
    public void ListAllGames()
    {
        for (Game g: games){
            System.out.println(g);
        }
        
    }
    
    public void ListByGenre(String genre)
    {
        for (Game g: games){
            if(g.getGenre().equals(genre.toUpperCase())){
                System.out.println(g);
                
            }
        }
    }
    
    public void ListByAgeRating()
    {
        
    }
    
    public void ListByPlatform()
    {
        
    }
}
