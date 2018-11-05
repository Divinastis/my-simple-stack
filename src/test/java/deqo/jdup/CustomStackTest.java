package deqo.jdup;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class CustomStackTest {

    CustomStack testStackNul;
    CustomStack testStackNonNul;
    Item itemNul;
    Item itemNonNul;
    Item itemNonNul2;
    Item itemNonNul3;

    @Before
    public void setUp() throws Exception {

        itemNonNul = new Item(1);
        itemNonNul2 = new Item(2);
        itemNonNul3 = new Item(3);
        testStackNonNul = new CustomStack();
        testStackNul = new CustomStack();
        testStackNonNul.push(itemNonNul);


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isEmpty() {
        assertTrue("a new stack should be empty", testStackNul.isEmpty());
        assertFalse("a pushed stack should not be empty", testStackNonNul.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals("a new stack should be empty", 0 , testStackNul.getSize());
        assertEquals("a pushed stack should not be empty", 1 , testStackNonNul.getSize());

    }

    @Test
    public void push() {


        testStackNonNul.push(itemNonNul2);
// assertions ( oracle )
        assertFalse ( " The stack must be not empty " , testStackNonNul.isEmpty ());
        assertEquals ( " The stack shoult contain 1 item " ,
                2 , testStackNonNul.getSize ());
        assertSame ( "Pushed itm should be on top of stack ",
                itemNonNul2 , testStackNonNul.peek ());
    }

    @Test
    public void peek() {
        testStackNonNul.push(itemNonNul3);
// assertions ( oracle )

        assertSame ( "Pushed itm should be on top of stack ",
                itemNonNul3 , testStackNonNul.peek ());
    }

    @Test ( expected = EmptyStackException.class )
    public void pop () throws EmptyStackException {
// Setup the " state of the world "
// Code under test
        testStackNul.pop(); // should throws an E m p t y S t a c k E x c e p t i o n .
    }
}