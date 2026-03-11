// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM : 24060124140193
// Lab : PBO B1
// Tanggal : 9 Maret 2026

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;

    private MataKuliah[] listMatKul = new MataKuliah[50];
    private int jumlahMatKul = 0;

    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Menambahkan Mata Kuliah
    public void addMatKul(MataKuliah mk) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = mk;
            jumlahMatKul++;
        }
    }

    // Menghitung jumlah SKS
    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            total += listMatKul[i].getSks();
        }
        return total;
    }

    // Menghitung jumlah matkul
    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    // Print data mahasiswa
    public void printMhs() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Print detail mahasiswa
    public void printDetailMhs() {
        printMhs();

        System.out.println("\nDosen Wali : " + dosenWali.getNama());

        if (kendaraan != null) {
            System.out.println("Kendaraan : " + kendaraan.getJenis() + " - " + kendaraan.getNoPlat());
        } else {
            System.out.println("Kendaraan : Tidak ada");
        }

        System.out.println("\nDaftar Mata Kuliah:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama() + " (" + listMatKul[i].getSks() + " SKS)");
        }

        System.out.println("\nJumlah Mata Kuliah : " + getJumlahMatKul());
        System.out.println("Jumlah SKS : " + getJumlahSKS());
    }
}