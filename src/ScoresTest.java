//import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScoresTest {
    Scores sc;
    /*
     * Constructor tests using numScores() and get()
     *
     */

    /**
     * @author ARMOURIT21
     * test the score constructor with integers 1 through 9
     */
    @Test public void ScoreCTOR(){
        //test that the constructor can take actual whitespace-delimited integers
        sc = new Scores("1 2 3 4 5 6 7 8 9");
        assertEquals(9,sc.getNumScores());
    }
    /**
     * @author ARMOURIT21
     * tests the score constructor with two digit inputs
     */
    @Test public void overTen(){
        sc = new Scores("10 11 12 13 14");
        assertEquals(5, sc.getNumScores());
    }

    /**
     * @author ARMOURIT21
     * tests the score cunstructor with negative ints 1-9
     */
    @Test public void negInt(){
        sc = new Scores("-1 -2 -3 -4 -5 -6 -7 -8 -9");
        assertEquals(9,sc.getNumScores());
    }

    /**
     * @author ARMOURIT21
     * test the score CTOR with a char thrown in the string
     */
    @Test public void ScoreChar(){
        //test what happens when a char is put in there
        assertThrows(IllegalArgumentException.class, ()->
                sc = new Scores("1 2 X 3 4 5 6 7 8 9"));
    }

    /**
     * @author ARMOURIT21
     * test a CTOR with a null input
     */
    @Test public void emptyCTOR(){
        //test a null constructor
        assertThrows(IllegalArgumentException.class, ()->
                sc = new Scores(null));
    }

    /**
     * @author ARMOURIT21
     * test a CTOR with too big of a number to be an int
     */
    @Test public void tooBig(){
        //test not an int
        assertThrows(IllegalArgumentException.class, ()->
                sc = new Scores("99999999999999999999999999999999999999"));
    }

    /**
     * @author ARMOURIT21
     * test a CTOR with an empty string
     */
    @Test public void noScores(){
        //test an empty string
        sc = new Scores("");
        assertEquals(0,sc.getNumScores());
    }

    /**
     * @author ARMOURIT21
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

    /**
     * @author ARMOURIT21
     * tests a standard getMax with numbers 1 through 9
     */
    @Test public void getMax(){
        //numbers 1 through 9 all jumbled up
        sc = new Scores("1 9 2 8 3 7 4 6 5");
        assertEquals(9, sc.getMax());
    }

    /**
     * @author ARMOURIT21
     * tests a getMax but with negative numbers 1 through 9
     */
    @Test public void getNeg(){
        sc = new Scores("-9 -8 -7 -6 -5 -4 -3 -2 -1");
        assertEquals(-1,sc.getMax());
    }

    /**
     * @author ARMOURIT21
     * tests getMax on an empty scores()
     */
    @Test public void getEmpty(){
        sc = new Scores("");
        assertThrows(NoSuchElementException.class, ()->
                sc.getMax());
    }
    /**
     * @author ARMOURIT21
     * tests getMax with all the number 1
     */
    @Test public void getOne(){
        sc = new Scores("1 1 1 1 1 1 1 1 1 1 1 1 ");
        assertEquals(1,sc.getMax());
    }

    /**
     * @author REYNOLDSTM18
     * tests get with an invalid index
     */
    @Test public void wrongIndex(){
        sc = new Scores("1 2 3 4 5 6 7 8 9");
        assertThrows(IndexOutOfBoundsException.class, ()-> sc.get(9));
    }
}
