package model;

public class promoMenginap extends promo implements kondisiPromo {
    private final int persen;
    private final int minMalam;

    public promoMenginap(int persen, int minMalam) {
        this.persen = persen;
        this.minMalam = minMalam;
    }

    @Override
    public boolean cekKondisi(Kamar kamar, int malam) {
        return malam >= minMalam;
    }

    @Override
    public int hitungPotongan(int total) {
        return total - (total * persen / 100);
    }
}
