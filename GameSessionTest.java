

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
    private GameSession s1;
    private GameSession s2;
    private GameSession s3;
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
        s1 = new GameSession();
        s1.startGameSession();
        s2 = new GameSession();
        s2.startGameSession();
        s3 = new GameSession();
    }
    @Test
    public void testingisRunning(){
        System.out.println("TEST STARTED");
        System.out.println(s1.isRunning());
        s2.endGameSession();
        System.out.println(s2.isRunning());
        System.out.println(s3.isRunning());
    }
    @Test
    public void testingGetGameDuration(){
        System.out.println("TEST STARTED");
        s1.getGameDuration();
        s2.endGameSession();
        s2.getGameDuration();
        s3.getGameDuration();
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
}