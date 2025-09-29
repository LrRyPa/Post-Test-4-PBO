package model;

public class kamarDeluxe extends Kamar {
    public kamarDeluxe() {
        super("DELUXE"); 
    }

    @Override
    public int getTarif() {
        return 400000; 
    }
}
