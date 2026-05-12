
/**
 * Write a description of class GameMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameMenu
{
    
    private InputReader input;
    private Responder responder;
    private boolean finished;
    
    public GameMenu(GameLibrary lib)
    {
        input = new InputReader();
        responder = new Responder(input,lib);
        finished = false;        
        
    }
    public void start() {
        while (!finished) {
            printMainMenu();
            String choice = input.getChoice();

            if (choice.equals("quit")) {
                finished = true;
                System.out.println("Goodbye.");
            } else {
                responder.responses(choice);
            }
        }
    }
    public void printMainMenu()
    {
        System.out.println("Game Menu:");
        System.out.println("1: Print library details");
        System.out.println("2: List all games");
        System.out.println("3: Filter Games");
        System.out.println("4:List top-rated games");
        System.out.println("5: Print game details");
        System.out.println("6: Rate a game");
        System.out.println("7: Start a game session");
        System.out.println("8: Print game session log");
        System.out.println("9: Add your own game");
        System.out.println("0: EXIT");
    }      
}