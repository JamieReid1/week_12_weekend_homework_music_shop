package instruments;

public class Guitar extends Instrument {

    private int noOfStrings;

    public Guitar(String make, String type, String colour, double buyPrice, double sellPrice, int noOfStrings) {
        super(make ,type, colour, buyPrice, sellPrice);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    @Override
    public String play() {
        return "Thrum Twang!";
    }

}
