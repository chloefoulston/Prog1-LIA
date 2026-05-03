

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GameTest
{
    private GameLibrary lib;
    private Game g1;
    private Game g2;
    private Game g3;
    private Game g4;

    
    

    

    /**
     * Default constructor for test class GameTest
     */
    public GameTest()
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
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testAddGames()
    {
        System.out.println("TEST STARTED");
        
        lib.addGame(g1);
        lib.addGame(g2);
        lib.addGame(g3);
        lib.addGame(g4);
        
        System.out.println("ALL GAMES ADDED, LIST BELOW");
        lib.listAllGames();
        
    
    }
    
    @Test
    public void startGame()
    {
        System.out.println("Launching " + g1.getGameName());
        
    }
}


