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
public class Nota {
    private NotaPelanggan notaPelanggan;
    private List<Pesan> daftarPesan;

    public Nota(NotaPelanggan notaPelanggan) {
        this.notaPelanggan = notaPelanggan;
        this.daftarPesan = new ArrayList<>();
    }

    public NotaPelanggan getNotaPelanggan() {
        return notaPelanggan;
    }

    public void tambahPesan(Pesan pesan) {
        daftarPesan.add(pesan);
    }

    public List<Pesan> getDaftarPesan() {
        return daftarPesan;
    }
}
