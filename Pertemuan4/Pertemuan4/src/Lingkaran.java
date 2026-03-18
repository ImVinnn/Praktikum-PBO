// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM : 24060124140193
// Lab : PBO B1
// Tanggal : 11 Maret 2026

public class Lingkaran extends BangunDatar {
    private double jariJari;
    private static int CounterLingkaran = 0;

    // Konstruktor
    public Lingkaran(double jariJari, String warna, String border) {
        super(1, warna, border);
        this.jariJari = jariJari;
        CounterLingkaran++;
    }

    // Getter dan Setter
    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // Menghitung luas
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    // Menghitung keliling
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    // Override printInfo
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari : " + jariJari);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }

    public void printCounter() {
        System.out.println("Total Lingkaran yang dibuat : " + CounterLingkaran);
    }
}