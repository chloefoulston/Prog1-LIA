
/**
 * Write a description of class Responder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Responder
{
    private GameMenu menu;
    private GameLibrary lib;
    private InputReader input;
    private GameSession session;
    public Responder()
    {
        lib = new GameLibrary();
        input = new InputReader();
    }

    public Responder(GameLibrary lib) 
    {
        this.lib = lib;
        input = new InputReader();
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
                endGame();

                break;
            case "9": 
                addGame();
                break;
            default:
                invalidInput();
                break;

        }
    }

    public void printMainMenu()
    {
        System.out.println("Game Menu:");
        System.out.println("To select an option, enter one of the");
        System.out.println("following numbers 0 - 10");
        System.out.println("1: Print library details");
        System.out.println("2: List all games");
        System.out.println("3: Filter Games");
        System.out.println("4: List top-rated games");
        System.out.println("5: Print game details");
        System.out.println("6: Rate a game");
        System.out.println("7: Start a game session");
        System.out.println("8: end game session");
        System.out.println("9: Add your own game");
        System.out.println("0: EXIT");
    }    

    public void invalidInput()
    {
        System.out.println("Input is not recognized here are the valid options");
        printMainMenu();
    }

    private void addGame() {
        System.out.println("Game name:");
        String name = input.getString();

        System.out.println("Developer:");
        String developer = input.getString();

        Genre genre = chooseGenre();
        Platform platform = choosePlatform();
        AgeRating ageRating = chooseAgeRating();
        GameType gameType = chooseGameType();

        Game game = new Game(name, developer, genre, ageRating,platform , gameType);
        lib.addGame(game);

        System.out.println("Game added.");
        System.out.println("Game added. would you like to add another? yes or no?");
         String choice = input.getString();
         switch(choice){
            case "yes":
               addGame();
                break;
            case "no":
                System.out.println("going back to main menu");
                printMainMenu();
                break;
            default:
                System.out.println("sorry that didnt seem like a yes or no, here is the main menu");
                printMainMenu();
        }
    }

    private void filterMenu() {
        System.out.println("\nFilter by:");
        System.out.println("1. Genre");
        System.out.println("2. Platform");
        System.out.println("3. Age rating");
        System.out.println("4. Game type");

        String choice = input.getString();
        switch(choice){
            case "1":
                System.out.println("Choose genre:");
                System.out.println("Action, Adventure, Horror, Racing, RPG, Simulation, Strategy, Survival");
                String genre = input.getString().trim().toUpperCase();
                lib.listByGenre(genre);
                break;
            case "2":
                System.out.println("Choose platform:");
                System.out.println("PC, CONSOLE, MOBILE, SWITCH");
                String platform = input.getString().trim().toUpperCase();
                lib.listByPlatform(platform);
                break;
            case "3":
                System.out.println("Choose Age Rating:");
                System.out.println("E, E10, T, M, AO");
                String ageRating = input.getString().trim().toUpperCase();
                lib.listByAgeRating(ageRating);
                break;
            case "4":
                System.out.println("Choose Game Type:");
                System.out.println("Singleplayer, COOP, OnlineMultiplayer");
                String gameType = input.getString().trim().toUpperCase();
                lib.listByGameType(gameType);
                break;
        }

    }

    private Genre chooseGenre() 
    {
        while (true) {
            System.out.println("Choose genre:");
            System.out.println("Action, Adventure, Horror, Racing, RPG, Simulation, Strategy, Survival");

            String choice = input.getString().trim().toUpperCase();
            return Genre.valueOf(choice);
        }
    }

    private Platform choosePlatform() {
        while (true) {
            System.out.println("Choose platform:");
            System.out.println("PC, CONSOLE, MOBILE, SWITCH");

            String choice = input.getString().trim().toUpperCase();
            return Platform.valueOf(choice);
        }
    }

    private AgeRating chooseAgeRating() {
        while (true) {
            System.out.println("Choose Age Rating:");
            System.out.println("E, E10, T, M, AO");

            String choice = input.getString().trim().toUpperCase();
            return AgeRating.valueOf(choice);
        }
    }

    private GameType chooseGameType() {
        while (true) {
            System.out.println("Choose Game Type:");
            System.out.println("Singleplayer, COOP, OnlineMultiplayer");

            String choice = input.getString().trim().toUpperCase();
            return GameType.valueOf(choice);
        }
    }

    public void gameInfo()
    {
        System.out.println("enter game name");
        String name = input.getString();
        lib.getGameDetails(name);
        getGameLogInfo();

    }

    public void rateGame()
    {
        System.out.println("enter game name:");
        String name = input.getString();
        System.out.println("enter game rating:");
        int gameRating = input.getInt();
        lib.getGameObj(name).addRating(gameRating);

    }

    public void startGame()
    {
        System.out.println("enter game name");
        String gameNameStartGame = input.getString();
        Game game = lib.getGameObj(gameNameStartGame);
        session = lib.startSession(game);

    }
    public void endGame(){
        System.out.println("enter game name");
        String gameNameStartGame = input.getString();
        Game game = lib.getGameObj(gameNameStartGame);
        if (session != null){
            session.endGame(game);
            lib.addSession(session);
            System.out.println("game session ended.");
        }else{
            System.out.println("no active session.");
        }
        System.out.println("going back to main menu...");
    }

    public void getGameLogInfo()
    {
        System.out.println("Active session: " + session);
    }

    
}
