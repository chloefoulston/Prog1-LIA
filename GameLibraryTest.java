
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameLibraryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GameLibraryTest
{
    
    /**
     * Default constructor for test class GameLibraryTest
     */
    public GameLibraryTest()
    {
        Game g1 = new Game("Minecraft","MOJANG", Genre.SURVIVAL, AgeRating.E, Platform.CROSSPLATFORM);
        Game g2 = new Game("Forza","Playground Games", Genre.RACING, AgeRating.E, Platform.CROSSPLATFORM);
        Game g3 = new Game("Stardew Valley","dsfadsa", Genre.SIMULATION, AgeRating.E, Platform.PC);
        Game g4 = new Game("Animal Crossing","Nintendo", Genre.SIMULATION, AgeRating.E, Platform.SWITCH);
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        
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
    public void testingENUMFilterbyGenre()
    {
        System.out.println("TEST STARTED");
        
        GameLibrary lib = new GameLibrary();
        
        Game g1 = new Game("Minecraft","MOJANG", Genre.SURVIVAL, AgeRating.E, Platform.CROSSPLATFORM);
        Game g2 = new Game("Forza","Playground Games", Genre.RACING, AgeRating.E, Platform.CROSSPLATFORM);
        Game g3 = new Game("Stardew Valley","dsfadsa", Genre.SIMULATION, AgeRating.E, Platform.PC);
        Game g4 = new Game("Animal Crossing","Nintendo", Genre.SIMULATION, AgeRating.E, Platform.SWITCH);
        
        lib.addGame(g1);
        lib.addGame(g2);
        lib.addGame(g3);
        lib.addGame(g4);
        
        System.out.println("ALL GAMES ADDED, Filtered LIST BELOW");
        lib.listByGenre("simulation");
    }
}







