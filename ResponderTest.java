

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ResponderTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ResponderTest
{
    private GameLibrary lib;
    private Game g1;
    private Game g2;
    private Game g3;
    private Game g4;
    private Responder responde1;
    private GameMenu gameMenu1;
    private InputReader input;

    /**
     * Default constructor for test class ResponderTest
     */
    public ResponderTest()
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
        g1 = new Game("Minecraft","MOJANG", Genre.SURVIVAL, AgeRating.E, Platform.CROSSPLATFORM,GameType.SINGLEPLAYER);
        g2 = new Game("Forza","Playground Games", Genre.RACING, AgeRating.E, Platform.CROSSPLATFORM, GameType.ONLINEMULTIPLAYER);
        g3 = new Game("Stardew Valley","dsfadsa", Genre.SIMULATION, AgeRating.E, Platform.PC, GameType.COOP);
        g4 = new Game("Animal Crossing","Nintendo", Genre.SIMULATION, AgeRating.E, Platform.SWITCH,GameType.SINGLEPLAYER);

        lib.addGame(g1);
        lib.addGame(g2);
        lib.addGame(g3);
        lib.addGame(g4);
        
        g1.addRating(5);
        g1.addRating(4);
        g1.addRating(5);
        
        g2.addRating(1);
        g2.addRating(2);
        g2.addRating(1);
        
        g3.addRating(3);
        g3.addRating(2);
        g3.addRating(5);
        
        g4.addRating(5);
        g4.addRating(5);
        g4.addRating(5);

        System.out.println("TEST STARTED");
        input = new InputReader();
        responde1 = new Responder();
        gameMenu1 = new GameMenu();
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
    public void h()
    {
    }

    @Test
    public void tghdrtyg()
    {
    }
}

