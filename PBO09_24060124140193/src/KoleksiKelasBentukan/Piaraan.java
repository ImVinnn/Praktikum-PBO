// NIM    : 24060124140193
// Nama   : Mohammad Banyuputra Eka Pramudhita
// Tanggal: 9 Mei 2026
// File   : Piaraan.java

package KoleksiKelasBentukan;

import java.util.LinkedList;

public class Piaraan {
    private int nbelm;
    private LinkedList<Anabul> Lanabul;

    public Piaraan() {
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0;
    }

    // i. jumlah elemen antrean
    public int getNbelm() {
        return nbelm;
    }

    // ii. tambah anabul ke akhir antrean
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    // iii. cek apakah objek ada dalam antrean
    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    // iv. lihat anabul pertama TANPA mengeluarkannya
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    // v. ambil anabul pertama SEKALIGUS mengeluarkannya
    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.poll();
        }
        return null;
    }

    // c. tampilkan nama panggilan semua anabul
    public void showAnabul() {
        System.out.println("=== Antrean Anabul ===");
        if (Lanabul.isEmpty()) {
            System.out.println("(Antrean kosong)");
            return;
        }
        int urutan = 1;
        for (Anabul a : Lanabul) {
            System.out.println("[" + urutan + "] " + a.getNama());
            urutan++;
        }
        System.out.println("Jumlah: " + nbelm);
    }

    // d. hitung banyak keluarga kucing
    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) { 
            }
        }
        return count;
    }

    // e. total bobot keluarga kucing
    public double bobotKucing() {
        double total = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    // f. tampilkan nama + jenis kelas
    public void showJenisAnabul() {
        System.out.println("=== Jenis Anabul dalam Antrean ===");
        if (Lanabul.isEmpty()) {
            System.out.println("(Antrean kosong)");
            return;
        }
        int urutan = 1;
        for (Anabul a : Lanabul) {
            System.out.println("[" + urutan + "] " + a.getNama() + " -> " + a.getClass().getName());
            urutan++;
        }
    }

    public static void main(String[] args) {
        Piaraan klinik = new Piaraan();

        // Buat objek anabul dengan nama + panggilan
        Anggora a1    = new Anggora("Angora Persian", "Siwol", 4.5);
        Kembangtelon a2 = new Kembangtelon("Kembangtelon Lokal", "Belang", 3.2);
        Anjing a3     = new Anjing("Golden Retriever", "Bladie");
        Burung a4     = new Burung("Lovebird", "Pipi");
        Kucing a5     = new Kucing("Domestic", "Moci", 2.8);

        // enqueueAnabul
        klinik.enqueueAnabul(a1);
        klinik.enqueueAnabul(a2);
        klinik.enqueueAnabul(a3);
        klinik.enqueueAnabul(a4);
        klinik.enqueueAnabul(a5);

        // c. showAnabul
        klinik.showAnabul();

        // getNbelm
        System.out.println("\nJumlah anabul: " + klinik.getNbelm());

        // isMember
        System.out.println("isMember(Bladie): " + klinik.isMember(a3));

        // getAnabul (peek)
        System.out.println("Anabul pertama (peek): " + klinik.getAnabul().getNama());

        // f. showJenisAnabul
        System.out.println();
        klinik.showJenisAnabul();

        // d. countKucing
        System.out.println("\nJumlah kucing: " + klinik.countKucing());

        // e. bobotKucing
        System.out.println("Total bobot kucing: " + klinik.bobotKucing() + " kg");

        // dequeueAnabul
        System.out.println("\nDequeue: " + klinik.dequeueAnabul().getNama());
        System.out.println("Antrean setelah dequeue:");
        klinik.showAnabul();
    }
}