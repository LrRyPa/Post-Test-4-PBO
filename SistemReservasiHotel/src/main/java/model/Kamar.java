package model;

public class Kamar {
    private String namaTipe;
    
    public Kamar(String namaTipe){
        this.namaTipe = namaTipe; 
    }
    
    public String getNamaTipe(){
        return namaTipe; 
    }

    public int getTarif() {
        return 0;
    }
}
