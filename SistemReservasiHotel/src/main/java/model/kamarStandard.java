package model;

public class kamarStandard extends Kamar {
    public kamarStandard() {
        super("STANDARD"); 
    }

    @Override
    public int getTarif() {
        return 250000; 
    }
}
