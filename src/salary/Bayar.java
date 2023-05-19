/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author User
 */
public class Bayar {
    private NotaPelanggan nota;
    private double jumlahBayar;

    public Bayar(NotaPelanggan nota, double jumlahBayar) {
        this.nota = nota;
        this.jumlahBayar = jumlahBayar;
    }

    public NotaPelanggan getNota() {
        return nota;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }
}
