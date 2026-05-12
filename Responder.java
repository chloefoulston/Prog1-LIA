
/**
 * Write a description of class Responder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Responder
{
    
    private GameLibrary lib;
    private InputReader input;
    private GameSession session;
    public Responder(InputReader input, GameLibrary lib ) 
    {
        this.lib=lib;
        this.input = input;
    }
    public void responses(String choice)
    {
        switch (choice){
            case "1":
                lib.printLibraryDetails();
                break;
            case "2":
                lib.listAllGames();
                break;
            case "3":
                filterMenu();
                break;
            case "4":
                lib.listTopRatings();
                break;
            case "5":
                gameInfo();
                break;
                
            case "6":
                rateGame();
                break;
                
            case "7":
                startGame();
                break;
        
            case "8":
                getGameLogInfo();
                
                break;
            case "9": 
                addGame();
                
                break;
            case "0":
                
                break;
            
        }
    }
    
     public void filterMenu()
    {
        
    }
    
    public void addGame()
    {
        
    }
    
    public void gameInfo()
    {
        System.out.println("enter game name");
        String name = input.getString();
        lib.getGameDetails(name);
            
    }
   
    public void rateGame()
    {
        System.out.println("enter game name");
                String name = input.getString();
                int gameRating = input.getInt();
                lib.getGameObj(name).addRating(gameRating);
        
    }
    
    public void startGame()
    {
        System.out.println("enter game name");
            String gameNameStartGame = input.getString();
            Game game = lib.getGameObj(gameNameStartGame);
            GameSession session = lib.startSession(game);
            session.startSession();
    }
    
    public void getGameLogInfo()
    {
        
    }
    
    
    
}
