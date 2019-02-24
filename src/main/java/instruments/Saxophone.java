package instruments;

public class Saxophone extends Instrument {

    public Saxophone(String make, String type, String colour, double buyPrice, double sellPrice) {
        super(make, type, colour, buyPrice, sellPrice);
    }

    @Override
    public String play() {
        return "Toot Toot!";
    }

}
