//import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScoresTest {
    Scores sc;
    /*
     * Constructor tests using numScores() and get()
     *
     */

    /**
     * test the scores constructor, without any nonsense
     */
    @Test public void ScoreCTOR(){
        //test that the constructor can take actual whitespace-delimited integers
        sc = new Scores("1 2 3 4 5 6 7 8 9");
        assertEquals(9,sc.getNumScores());
    }

    /**
     * test the score CTOR with a char thrown in the string
     */
    @Test public void ScoreChar(){
        //test what happens when a char is put in there
        assertThrows(IllegalArgumentException.class, ()->
                sc = new Scores("1 2 X 3 4 5 6 7 8 9"));
    }

    /**
     * test a CTOR with a null input
     */
    @Test public void emptyCTOR(){
        //test a null constructor
        assertThrows(IllegalArgumentException.class, ()->
                sc = new Scores(null));
    }

    /**
     * test a CTOR with too big of a number to be an int
     */
    @Test public void tooBig(){
        //test not an int
        assertThrows(IllegalArgumentException.class, ()->
                sc = new Scores("99999999999999999999999999999999999999"));
    }

    /**
     * test a CTOR with an empty string
     */
    @Test public void noScores(){
        //test an empty string
        sc = new Scores("");
        assertEquals(0,sc.getNumScores());
    }

    /**
     * .gets an index out of bounds for an empty CTOR
     */
    @Test public void OOB(){
        sc = new Scores("");
        //get an IndexOutOfBounds
        assertThrows(IndexOutOfBoundsException.class, ()->
                sc.get(0));
    }




    /*
     * getMax() tests
     */

}
