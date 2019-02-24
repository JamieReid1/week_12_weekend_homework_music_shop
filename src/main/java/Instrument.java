public abstract class Instrument {

    private String type;
    private String colour;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String type, String colour, double buyPrice, double sellPrice){
        this.type = type;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

}
