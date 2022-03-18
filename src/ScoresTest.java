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
        //test what happens when a char is put in there
        assertThrows(IllegalArgumentException.class, ()->{
            Scores sc = new Scores("1 2 A 3 4 5 6 7 8 9");
        });
    }

    @Test public void emptyCTOR(){
        //test a null constructor
        assertThrows(IllegalArgumentException.class, ()->{
            Scores sc = new Scores(null);
        });
    }

    @Test public void tooBig(){
        //test not an int
        assertThrows(IllegalArgumentException.class, ()->{
            Scores sc = new Scores("99999999999999999999999999999999999999");
        });
    }

    @Test public void noScores(){
        //test an empty string
        Scores sc = new Scores("");
        assertEquals(0,sc.getNumScores());
        //get an IndexOutOfBounds
        assertThrows(IndexOutOfBoundsException.class, ()->{
            sc.get(0);
        });
    }




    /*
     * getMax() tests
     */
    
}
