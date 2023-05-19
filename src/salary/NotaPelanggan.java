/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class NotaPelanggan {
    private int nomorNota;
    private Pelanggan pelanggan;
    private List<Pesanan> daftarPesanan;

    public NotaPelanggan(int nomorNota, Pelanggan pelanggan) {
        this.nomorNota = nomorNota;
        this.pelanggan = pelanggan;
        this.daftarPesanan = new ArrayList<>();
    }

    public int getNomorNota() {
        return nomorNota;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void tambahPesanan(Pesanan pesanan) {
        daftarPesanan.add(pesanan);
    }

    public List<Pesanan> getDaftarPesanan() {
        return daftarPesanan;
    }
}
