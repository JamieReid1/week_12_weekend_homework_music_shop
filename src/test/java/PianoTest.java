
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano ;

    @Before
    public void before(){

        piano = new Piano("Yamaha", "Grand", "White", 1000, 2000);

    }

    @Test
    public void hasMake(){
        assertEquals("Yamaha", piano.getMake());
    }

    @Test
    public void hasType(){
        assertEquals("Grand", piano.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("White", piano.getColour());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(1000.00, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(2000.00, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1000, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Tink Tonk!", piano.play());
    }

}
