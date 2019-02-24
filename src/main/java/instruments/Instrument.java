package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String make;
    private String type;
    private String colour;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String make, String type, String colour, double buyPrice, double sellPrice){
        this.make = make;
        this.type = type;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMake() {
        return make;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup(){
        return sellPrice - buyPrice;
    }

}
