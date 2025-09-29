package service;

import model.Kamar;
import model.kamarStandard;
import model.kamarDeluxe;
import model.kamarSuite;
import model.reservasiModel;
import model.promo;
import model.kondisiPromo;
import java.util.ArrayList;

public class reservasiService {
    private ArrayList<reservasiModel> daftarReservasi;
    private int Id;

    public reservasiService() {
        this.daftarReservasi = new ArrayList<>();
        this.Id = 1;
        dataAwal();
    }

    private void dataAwal() {
        tambahReservasi("Larry", new kamarStandard(), 5);
        tambahReservasi("Polin", new kamarDeluxe(), 5);
        tambahReservasi("Anugrah", new kamarSuite(), 5);
    }
    
    // Create
    public void tambahReservasi(String nama, Kamar kamar, int malam) {
        int total = kamar.getTarif() * malam;
        reservasiModel reservasiBaru = new reservasiModel(Id++, nama, kamar, malam, total);
        daftarReservasi.add(reservasiBaru);
    }
    
    public void tambahReservasi(String nama, Kamar kamar, int malam, promo prm) {
        int total = kamar.getTarif() * malam;
        
        if (prm != null) {
            if (!(prm instanceof kondisiPromo) || ((kondisiPromo) prm).cekKondisi(kamar, malam)) {
                total = prm.hitungPotongan(total); 
            }
        }
        reservasiModel reservasiBaru = new reservasiModel(Id++, nama, kamar, malam, total);
        daftarReservasi.add(reservasiBaru);
    }
    // Read    
    public ArrayList<reservasiModel> getReservasi() {
        return daftarReservasi;
    }
    
    public reservasiModel getReservasiId(int id) {
        for (reservasiModel reservasi : daftarReservasi) {
            if (reservasi.getId() == id) {
                return reservasi;
            }
        }
        return null;
    }
    // Update
    public void perbaruiReservasi(int id, String namaBaru, Kamar kamar, int malamBaru) {
        reservasiModel reservasi = getReservasiId(id);
        if (reservasi != null) {
            reservasi.setNamaTamu(namaBaru);
            reservasi.setKamar(kamar);
            reservasi.setLamaMenginap(malamBaru);
            int totalBaru = kamar.getTarif() * malamBaru;
            reservasi.setTotalTarif(totalBaru);
        }
    }
    // Delete
    public boolean hapusReservasi(int id) {
        reservasiModel reservasi = getReservasiId(id);
        if (reservasi != null) {
            daftarReservasi.remove(reservasi);
            return true;
        }
        return false;
    }

    public ArrayList<reservasiModel> cariNama(String nama) {
        ArrayList<reservasiModel> hasil = new ArrayList<>();
        String namaLower = nama.toLowerCase();

        for (reservasiModel reservasi : daftarReservasi) {
            if (reservasi.getNamaTamu().toLowerCase().contains(namaLower)) {
                hasil.add(reservasi);
            }
        }
        return hasil;
    }
    
    public ArrayList<reservasiModel> cariTipe(String tipe) {
        ArrayList<reservasiModel> hasil = new ArrayList<>();
        String tipeLower = tipe.toLowerCase();

        for (reservasiModel reservasi : daftarReservasi) {
            if (reservasi.getKamar().getNamaTipe().toLowerCase().contains(tipeLower)) {
                hasil.add(reservasi);
            }
        }
        return hasil;
    }

}