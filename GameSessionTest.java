

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameSessionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GameSessionTest
{
    private GameLibrary lib;
    private Game g1;
    private Game g2;
    private Game g3;
    private Game g4;
    private GameSession gameSess1;

    /**
     * Default constructor for test class GameSessionTest
     */
    public GameSessionTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        lib = new GameLibrary();
        g1 = new Game("Minecraft","MOJANG", Genre.SURVIVAL, AgeRating.E, Platform.CROSSPLATFORM);
        g2 = new Game("Forza","Playground Games", Genre.RACING, AgeRating.E, Platform.CROSSPLATFORM);
        g3 = new Game("Stardew Valley","dsfadsa", Genre.SIMULATION, AgeRating.E, Platform.PC);
        g4 = new Game("Animal Crossing","Nintendo", Genre.SIMULATION, AgeRating.E, Platform.SWITCH);
        
        lib.addGame(g1);
        lib.addGame(g2);
        lib.addGame(g3);
        lib.addGame(g4);
        gameSess1 = new GameSession();
        lib.listAllGames();
        System.out.println("TEST STARTED");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        System.out.println("TEST DONE");
    }

    @Test
    public void dsfdf()
    {
        
    }

    @Test
    public void testStartGameSession()
    {
        gameSess1.startGameSession(g1);
        
    }
    public void testEndGameSession()
    {
        gameSess1.endGameSession(g1);
        
    }

    @Test
    public void jh()
    {
        lib.addGame(g1);
    }
}



