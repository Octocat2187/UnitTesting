import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScoresTest {
    /*
     * Constructor tests using numScores() and get()
     *
     */
    @Test public void ScoreCTOR(){
        //test that the constructor can take actual whitespace-delimited integers
        Scores sc = new Scores("1 2 3 4 5 6 7 8 9");
        assertEquals(9,sc.getNumScores());
    }

    @Test public void ScoreChar(){
        Scores sc = new Scores("1 2 A 3 4 5 6 7 8 9");
        assertThrows(IllegalArgumentException.class, ()->{});
    }

    @Test public void emptyCTOR(){
        Scores sc = new Scores(null);
        assertThrows(IllegalArgumentException.class, ()->{});
    }

    @Test public void tooBig(){
        Scores sc = new Scores("99999999999999999999999999999999999999");
        assertThrows(IllegalArgumentException.class, ()->{});
    }

    @Test public void noScores(){
        Scores sc = new Scores("");
        assertEquals(0,sc.getNumScores());
        sc.get(0);
        assertThrows(IndexOutOfBoundsException.class, ()->{});
    }




    /*
     * getMax() tests
     */
    
}
