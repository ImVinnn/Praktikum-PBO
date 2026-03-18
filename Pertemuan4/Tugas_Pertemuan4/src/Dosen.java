// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM  : 24060124140193
// Lab  : PBO B1

import java.time.LocalDate;

// Class turunan dari Pegawai
public class Dosen extends Pegawai {

    private String fakultas;

    public Dosen(String nip, String nama, LocalDate tanggalLahir,
                 LocalDate tmt, double gajiPokok, String fakultas) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }
}