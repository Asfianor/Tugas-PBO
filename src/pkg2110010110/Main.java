/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010110;
import java.util.List;
import salary.*;
/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek laundry
        Laundry laundry = new Laundry("Laundry Barokah");

        // Membuat objek pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Akhmad Asfianor", "Jalan Pahlawan No. 123", "081234567890");
        Pelanggan pelanggan2 = new Pelanggan("Udin Petot", "Jalan Merdeka No. 456", "089876543210");

        // Menambahkan pelanggan ke laundry
        laundry.tambahPelanggan(pelanggan1);
        laundry.tambahPelanggan(pelanggan2);

        // Membuat objek pesanan
        Pesanan pesanan1 = new Pesanan("Cuci Setrika", 3, 50.0);
        Pesanan pesanan2 = new Pesanan("Dry Cleaning", 2, 70.0);

        // Membuat objek nota pelanggan
        NotaPelanggan nota1 = new NotaPelanggan(1, pelanggan1);
        NotaPelanggan nota2 = new NotaPelanggan(2, pelanggan2);

        // Menambahkan pesanan ke nota pelanggan
        nota1.tambahPesanan(pesanan1);
        nota2.tambahPesanan(pesanan2);

        // Menambahkan nota pelanggan ke laundry
        laundry.tambahNota(nota1);
        laundry.tambahNota(nota2);

        // Mencetak informasi pelanggan dan nota pada laundry
        List<Pelanggan> daftarPelanggan = (List<Pelanggan>) laundry.getDaftarPelanggan();
        List<NotaPelanggan> daftarNota = (List<NotaPelanggan>) laundry.getDaftarNota();

        for (Pelanggan pelanggan : daftarPelanggan) {
            System.out.println("Pelanggan: " + pelanggan.getNama());
            System.out.println("Alamat: " + pelanggan.getAlamat());
            System.out.println("Nomor Telepon: " + pelanggan.getNomorTelepon());
            System.out.println();

            for (NotaPelanggan nota : daftarNota) {
                if (nota.getPelanggan().equals(pelanggan)) {
                    System.out.println("Nota: " + nota.getNomorNota());

                    List<Pesanan> daftarPesanan = nota.getDaftarPesanan();

                    for (Pesanan pesanan : daftarPesanan) {
                        System.out.println("Jenis Layanan: " + pesanan.getJenisLayanan());
                        System.out.println("Berat: " + pesanan.getBerat());
                        System.out.println("Harga: " + pesanan.getHarga());
                        System.out.println();
                    }
                }
            }
        }
    }
}
