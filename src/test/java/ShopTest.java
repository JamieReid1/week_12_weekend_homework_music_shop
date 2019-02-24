import instruments.Guitar;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Saxophone saxophone;

    @Before
    public void before(){

        guitar = new Guitar("Fender", "Electric", "White", 400.00, 700.00, 6);
        saxophone = new Saxophone("Selmer", "Alto", "Brass", 500.00, 700.00);
        shop = new Shop("Ray's");

    }

    @Test
    public void hasAName(){
        assertEquals("Ray's", shop.getName());
    }

    @Test
    public void canGetStockCount(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddItemsToStock(){
        shop.add(guitar);
        shop.add(saxophone);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canRemoveItemsFromStock(){
        shop.add(guitar);
        shop.add(saxophone);
        assertEquals(2, shop.stockCount());
        shop.remove(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canCalculateProfitMargin(){
        shop.add(guitar);
        shop.add(saxophone);
        assertEquals(500.00, shop.profitMargin(), 0.01);
    }

}
