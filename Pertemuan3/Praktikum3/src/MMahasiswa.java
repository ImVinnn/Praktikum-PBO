// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM : 24060124140193
// Lab : PBO B1
// Tanggal : 9 Maret 2026

public class MMahasiswa {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("12345", "Pak Fajar", "Informatika");

        MataKuliah mk1 = new MataKuliah("PBO101", "Rekayasa Perangkat Lunak", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("IF103", "Basis Data", 3);

        Kendaraan k1 = new Kendaraan("H1234AB", "Motor");

        Mahasiswa m1 = new Mahasiswa("24060124140193", "Banyu", "Informatika");

        m1.setDosenWali(d1);
        m1.setKendaraan(k1);

        m1.addMatKul(mk1);
        m1.addMatKul(mk2);
        m1.addMatKul(mk3);

        m1.printDetailMhs();
    }
}