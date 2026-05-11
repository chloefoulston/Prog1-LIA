
/**
 * Write a description of class GameMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameMenu
{
    private GameLibrary library;
    private InputReader inputReader;
    private GameSession session;
    private Responder responder;
    
    public void start()
    {
        library = new GameLibrary();
        inputReader = new InputReader();
        session = new GameSessionTest();
        responder = new Responder();
    }
    
    public void printMainMenu()
    {
        System.out.println("Game Menu:");
        System.out.println("1: Print library details");
        System.out.println("2: List all games");
        System.out.println("3: List games by genre");
        System.out.println("4: List games by platform");
        System.out.println("5: List games by age ratings");
        System.out.println("6:List top-rated games");
        System.out.println("7: Print game details");
        System.out.println("8: Rate a game");
        System.out.println("9: Start a game session");
        System.out.println("10: Print game session log");
        System.out.println("11: Add your own game");
        System.out.println("12: EXIT");
    }
    
    public void filterMenu()
    {
        
    }
    
    
    

}