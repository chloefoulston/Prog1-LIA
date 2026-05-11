
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
                System.out.println("enter game name");
                String gameNameInfo = input.getString();
                lib.getGameObj(gameNameInfo).getGameInfo();
                
            case "6":
                System.out.println("enter game name");
                String gameNameRate = input.getString();
                int gameRating = input.getInt();
                lib.getGameObj(gameNameRate).addRating(gameRating);
                
            case "7":
                System.out.println("enter game name");
                
            case "8":
            case "9":
            case "0":
            
        }
    }
}
