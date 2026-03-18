// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM  : 24060124140193
// Lab  : PBO B1

import java.time.LocalDate;
import java.time.Period;

// Tenaga kependidikan
public class Tendik extends Pegawai {

    private String bidang;
    private final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        Period mk = hitungMasaKerja();
        return 0.01 * mk.getYears() * getGajiPokok();
    }

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
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT : " + formatTanggal(getTmt()));
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);

        System.out.println("Masa Kerja : "
                + mk.getYears() + " tahun "
                + mk.getMonths() + " bulan");

        System.out.println("Tanggal Pensiun : "
                + formatTanggal(hitungTanggalPensiun()));

        System.out.println("Gaji Pokok : Rp " + getGajiPokok());
        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}