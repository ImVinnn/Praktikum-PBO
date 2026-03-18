// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM  : 24060124140193
// Lab  : PBO B1

import java.time.LocalDate;
import java.time.Period;

// Superclass semua pegawai
public class Pegawai {

    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;

    // Konstruktor
    public Pegawai(String nip, String nama, LocalDate tanggalLahir,
                   LocalDate tmt, double gajiPokok) {

        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // Getter
    public String getNip() { return nip; }
    public String getNama() { return nama; }
    public LocalDate getTanggalLahir() { return tanggalLahir; }
    public LocalDate getTmt() { return tmt; }
    public double getGajiPokok() { return gajiPokok; }

    // Menghitung masa kerja
    public Period hitungMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    // Format tanggal ke Indonesia
    public String formatTanggal(LocalDate t) {

        String[] bulan = {
            "Januari","Februari","Maret","April","Mei","Juni",
            "Juli","Agustus","September","Oktober","November","Desember"
        };

        return t.getDayOfMonth() + " " +
               bulan[t.getMonthValue()-1] + " " +
               t.getYear();
    }

    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
    }
}