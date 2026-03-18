// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM : 24060124140193
// Lab : PBO B1
// Tanggal : 11 Maret 2026

public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int CounterBangunDatar = 0;


    // Konstruktor tanpa parameter
    public BangunDatar() {
        CounterBangunDatar++;
    }

    // Konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        CounterBangunDatar++;
    }

    // Getter dan Setter
    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // Method info
    public void printInfo() {
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }

    public void printCounter() {
        System.out.println("Total Bangun Datar yang dibuat : " + CounterBangunDatar);
    }
}