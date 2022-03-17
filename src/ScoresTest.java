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
        assertEquals(sc.getNumScores(),9);
    }

    @Test public void ScoreChar(){
        Scores sc = new Scores("1 2 3 4 5 A 6 7 8 9");
        assertThrows(IllegalArgumentException.class, ()->{});
    }




    /*
     * getMax() tests
     */
    
}
