// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM  : 24060124140193
// Lab  : PBO B1

import java.time.LocalDate;
import java.time.Period;

// Dosen tetap (turunan dari Dosen)
public class dosenTetap extends Dosen {

    private String nidn;
    private final int BUP = 65;

    public dosenTetap(String nip, String nidn, String nama,
                      LocalDate tanggalLahir, LocalDate tmt,
                      double gajiPokok, String fakultas) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // Hitung tunjangan
    public double hitungTunjangan() {
        Period masaKerja = hitungMasaKerja();
        return 0.02 * masaKerja.getYears() * getGajiPokok();
    }

    // Hitung tanggal pensiun
    public LocalDate hitungTanggalPensiun() {
        return getTanggalLahir()
                .plusYears(BUP)
                .plusMonths(1)
                .withDayOfMonth(1);
    }

    @Override
    public void printInfo() {

        Period mk = hitungMasaKerja();

        System.out.println("NIP : " + getNip());
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT : " + formatTanggal(getTmt()));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + getFakultas());

        System.out.println("Masa Kerja : "
                + mk.getYears() + " tahun "
                + mk.getMonths() + " bulan");

        System.out.println("Tanggal Pensiun : "
                + formatTanggal(hitungTanggalPensiun()));

        System.out.println("Gaji Pokok : Rp " + getGajiPokok());
        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}