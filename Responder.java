
/**
 * Write a description of class Responder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Responder
{
    
    private GameLibrary lib;
    private GameMenu menu;
    private InputReader input;
    private GameSession session;
    public Responder(GameLibrary lib,InputReader input) 
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
                menu.filterMenu();
                break;
            case "4":
                lib.listTopRatings();
                break;
            case "5":
                gameInfo();
                break;
                
            case "6":
                System.out.println("enter game name");
                String gameNameRate = input.getString();
                int gameRating = input.getInt();
                lib.getGameObj(gameNameRate).addRating(gameRating);
                break;
                
            case "7":
                startGame();
                break;
        
            case "8":
                
                break;
            case "9":                
                
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
                String gameNameInfo = input.getString();
                lib.getGameObj(gameNameInfo).getGameInfo();
            
    }
   
    public void rateGame()
    {
        
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
