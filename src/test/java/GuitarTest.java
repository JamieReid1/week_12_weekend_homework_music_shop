import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){

        guitar = new Guitar("Fender", "Electric", "White", 400.00, 700.00, 6);

    }

    @Test
    public void hasMake(){
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void hasType(){
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("White", guitar.getColour());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(400.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(700.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(300, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Thrum Twang!", guitar.play());
    }

}
