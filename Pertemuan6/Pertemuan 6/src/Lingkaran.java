// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM : 24060124140193
// Lab : PBO B1

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    public void zoomIn(){
        jari *= 1.1;
    }

    public void zoomOut(){
        jari *= 0.9;
    }
}