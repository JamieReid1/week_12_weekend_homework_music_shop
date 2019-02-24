
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){

        saxophone = new Saxophone("Selmer", "Alto", "Brass", 500, 700);

    }

    @Test
    public void hasMake(){
        assertEquals("Selmer", saxophone.getMake());
    }

    @Test
    public void hasType(){
        assertEquals("Alto", saxophone.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Brass", saxophone.getColour());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(500.00, saxophone.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(700.00, saxophone.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(200, saxophone.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Toot Toot!", saxophone.play());
    }

}
