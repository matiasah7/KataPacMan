import model.Position;
import model.State;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void initialBoardWithoutCookiesTest() throws Exception {
        State initialState = new State();
        assertEquals(initialState.getBoard().getHeight(), 10);
        assertEquals(initialState.getBoard().getWidth(), 10);
        assertEquals(initialState.getPacmanPosition().getX(), 0);
        assertEquals(initialState.getPacmanPosition().getY(), 0);
    }

}
