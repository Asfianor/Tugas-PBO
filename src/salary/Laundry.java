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
public class Laundry {
    private String namaLaundry;
    private List<Pelanggan> daftarPelanggan;
    private List<NotaPelanggan> daftarNota;

    public Laundry(String namaLaundry) {
        this.namaLaundry = namaLaundry;
        this.daftarPelanggan = new ArrayList<>();
        this.daftarNota = new ArrayList<>();
    }

    public String getNamaLaundry() {
        return namaLaundry;
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        daftarPelanggan.add(pelanggan);
    }

    public List<Pelanggan> getDaftarPelanggan() {
        return daftarPelanggan;
    }

    public void tambahNota(NotaPelanggan nota) {
        daftarNota.add(nota);
    }

    public List<NotaPelanggan> getDaftarNota() {
        return daftarNota;
    }
}
