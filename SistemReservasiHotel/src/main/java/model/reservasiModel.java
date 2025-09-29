package model;

public class reservasiModel {
    private int id;
    private String namaTamu;
    private Kamar tipeKamar;
    private int lamaMenginap;
    private int totalTarif;

    public reservasiModel(int id, String namaTamu, Kamar tipeKamar, int lamaMenginap, int totalTarif) {
        this.id = id;
        this.namaTamu = namaTamu;
        this.tipeKamar = tipeKamar;
        this.lamaMenginap = lamaMenginap;
        this.totalTarif = totalTarif;
    }

    public int getId() {
        return id;
    }

    public String getNamaTamu() {
        return namaTamu;
    }

    public void setNamaTamu(String namaTamu) {
        this.namaTamu = namaTamu;
    }

    public Kamar getKamar() {
        return tipeKamar;
    }

    public void setKamar(Kamar tipeKamar) {
        this.tipeKamar = tipeKamar;
    }

    public int getLamaMenginap() {
        return lamaMenginap;
    }

    public void setLamaMenginap(int lamaMenginap) {
        this.lamaMenginap = lamaMenginap;
    }

    public int getTotalTarif() {
        return totalTarif;
    }

    public void setTotalTarif(int totalTarif) {
        this.totalTarif = totalTarif;
    }
}