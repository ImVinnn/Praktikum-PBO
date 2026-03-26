// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM : 24060124140193
// Lab : PBO B1

import java.time.LocalDate;
import java.time.Period;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tglLahir;
    protected String alamat;
    protected double pendapatan;

    protected static int counterMns = 0;

    public Manusia(String nama, LocalDate tglLahir, String alamat, double pendapatan){
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public int hitungMasaKerja(LocalDate mulai){
        return Period.between(mulai, LocalDate.now()).getYears();
    }

    public abstract double hitungPajak();

    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tglLahir);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}