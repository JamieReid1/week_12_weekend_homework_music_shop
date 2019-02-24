import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar fender;

    @Before
    public void before(){

        fender = new Guitar("Electric", "White", 400.00, 700.00, 6);

    }

    @Test
    public void hasType(){
        assertEquals("Electric", fender.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("White", fender.getColour());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(400.00, fender.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(700.00, fender.getSellPrice(), 0.01);
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(6, fender.getNoOfStrings());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(300, fender.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Thrum Twang!", fender.play());
    }

}
