// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM  : 24060124140193
// Lab  : PBO B1

import java.time.LocalDate;
import java.time.Period;

// Dosen tamu
public class dosenTamu extends Dosen {

    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    public dosenTamu(String nip, String nidk, String nama,
                     LocalDate tanggalLahir, LocalDate tmt,
                     double gajiPokok, String fakultas,
                     LocalDate tanggalAkhirKontrak) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    public Period sisaKontrak() {
        return Period.between(LocalDate.now(), tanggalAkhirKontrak);
    }

    @Override
    public void printInfo() {

        Period kontrak = sisaKontrak();

        System.out.println("NIP : " + getNip());
        System.out.println("NIDK : " + nidk);
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT : " + formatTanggal(getTmt()));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + getFakultas());

        System.out.println("Sisa Kontrak : "
                + kontrak.getYears() + " tahun "
                + kontrak.getMonths() + " bulan");

        System.out.println("Tanggal Berakhir Kontrak : "
                + formatTanggal(tanggalAkhirKontrak));

        System.out.println("Gaji Pokok : Rp " + getGajiPokok());
        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}