package model;

public class kamarSuite extends Kamar {
    public kamarSuite() {
        super("SUITE"); 
    }

    @Override
    public int getTarif() {
        return 750000;
    }
}
