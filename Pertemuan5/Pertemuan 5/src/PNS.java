// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM : 24060124140193
// Lab : PBO B1
// File : PNS.java
// Deskripsi : Kelas untuk manusia dengan profesi PNS yang mengimplementasikan interface Pajak

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private LocalDate tglMulai;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tglLahir, String alamat, double pendapatan, String nip){
        super(nama, tglLahir, alamat, pendapatan);
        this.nip = nip;
        this.tglMulai = LocalDate.now();
        counterPNS++;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    public int hitungMasaKerja(){
        return super.hitungMasaKerja(tglMulai) + 1;
    }

    public double hitungPajak(){
        return 0.10 * pendapatan;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}