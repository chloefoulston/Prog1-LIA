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
    private boolean foundGame;
    public GameLibrary()
    {
        games = new ArrayList<>();
        session = new ArrayList<>();
    }
    
    public Game searchForGame(String name)
    {
        boolean foundGame = false;
        for (Game g : games){
            if (g.getGameName().equals(name)){
               foundGame= true;
            }else{
                foundGame=false;
            }
        }
        return null;
        
    }
    
    // returns a game object by searching its name
    public Game getGameObj(String name)
    {
        searchForGame(name);       
        for (Game g : games){
            if(foundGame = true){
            searchForGame(name);
            return g;
            }
        }
        return null;
    }
    
    public void listTopRatings(String name)
    {
        for (Game g:games){
            if(g.getAverageRating() >=4){
                System.out.println(g.getGameName()+" : has a rating of" + g.getAverageRating() + " stars");
            }
        }
    }
    
    // add game to collection
    public void addGame(Game g)
    {
        games.add(g);
    }
    
    public void listAllGames()
    {
        for (Game g: games){
            System.out.println(g);
        }
        
    }

    
    public void listByGenre(String genre)
    {
        for (Game g: games){
            if(g.getGenre().equals(genre.toUpperCase())){
                System.out.println(g);
                
            }
        }
    }
    public void listByAgeRating(String ageRating)
    {
        for (Game g: games){
            if(g.getAgeRating().equals(ageRating.toUpperCase())){
                System.out.println(g);
                
            }
        }
        
    }
    
    public void listByPlatform(String platform)
    {
        for (Game g: games){
            if(g.getPlatform().equals(platform.toUpperCase())){
                System.out.println(g);
                
            }
        }
    }
    
    
}
