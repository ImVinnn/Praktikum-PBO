// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM : 24060124140193
// Lab : PBO B1
// Tanggal : 11 Maret 2026

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi, String warna, String border) {
        this.jmlSisi = 4;       //this.sisi = sisi;
        this.warna = warna;     //setWarna(warna);
        this.border = border;   //setBorder(border);
        this.sisi = sisi;       //setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + sisi);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}