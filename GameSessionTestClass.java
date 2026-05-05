import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameSessionTestClass
{
    private GameSessionTest session;
    private Game game;

    public GameSessionTestClass()
    {
    }

    @BeforeEach
    public void setUp() {
        session = new GameSessionTest();
        game = new Game("Game", "Developer", Genre.SURVIVAL, AgeRating.E, Platform.CROSSPLATFORM, GameType.SINGLEPLAYER);
        System.out.println("TEST STARTED");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("TEST DONE");
    }

    @Test
    public void testToString() {
        session.startGame(game);
        System.out.println(session);
    }

    @Test
    public void testIsRunning() {
        session.startGame(game);
        System.out.println("isRunning test: " + session.isRunning());
    }

    @Test
    public void testIsRunningFalse() {
        session.startGame(game);
        session.endGame(game);
        System.out.println("isRunning test: " + session.isRunning());
    }

    @Test
    public void testDuration() {
        session.startGame(game);
        System.out.println("duration: " + session.getGameDuration());
    }

    @Test
    public void testNoSessionDuration() {
        System.out.println("duration when not running: " + session.getGameDuration());
    }
}