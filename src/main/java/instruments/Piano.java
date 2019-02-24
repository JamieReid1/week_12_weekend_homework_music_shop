package instruments;

public class Piano extends Instrument {

    public Piano(String make, String type, String colour, double buyPrice, double sellPrice) {
        super(make, type, colour, buyPrice, sellPrice);
    }

    @Override
    public String play() {
        return "Tink Tonk!";
    }
}
