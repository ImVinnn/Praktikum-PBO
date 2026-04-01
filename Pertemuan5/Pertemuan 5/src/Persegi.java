// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM : 24060124140193
// Lab : PBO B1
// File : Persegi.java
// Deskripsi : Kelas untuk bangun datar persegi yang mengimplementasikan interface IResize

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }

    public void zoomIn(){
        sisi *= 1.1;
    }

    public void zoomOut(){
        sisi *= 0.9;
    }
}