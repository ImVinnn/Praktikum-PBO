// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM : 24060124140193
// Lab : PBO B1
// File : Pengusaha.java
// Deskripsi : Kelas untuk manusia dengan profesi pengusaha yang mengimplementasikan interface Pajak

import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private LocalDate tglMulai;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tglLahir, String alamat, double pendapatan, String npwp){
        super(nama, tglLahir, alamat, pendapatan);
        this.npwp = npwp;
        this.tglMulai = LocalDate.now();
        counterPengusaha++;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    public int hitungMasaKerja(){
        return super.hitungMasaKerja(tglMulai) + 9;
    }

    public double hitungPajak(){
        return 0.15 * pendapatan;
    }


    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}