package deqo.jdup;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item item1;
    Item item2;

    @Before
    public void setUp() throws Exception {

        item1 = new Item(1);



    }

    @Test
    public void getValue() {
        assertEquals(1, item1.getValue());
    }

    @Test
    public void setValue() {
        item2 = new Item(1);
        item2.setValue(2);
        assertEquals(2, item2.getValue());
    }
}