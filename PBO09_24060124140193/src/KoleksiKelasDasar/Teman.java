package KoleksiKelasDasar;
// NIM    : 24060124140193
// Nama   : Mohammad Banyuputra Eka Pramudhita
// Tanggal: 9 Mei 2026
// File   : Teman.java
// Deskripsi: Kelas Teman untuk mengelola daftar nama teman dengan berbagai operasi seperti tambah, hapus, cek anggota, dan ganti nama.

import java.util.ArrayList;

public class Teman {
    private ArrayList<String> LNama;

    public Teman() {
        LNama = new ArrayList<String>();
    }

    public int getNbelm() {
        return LNama.size(); 
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < LNama.size()) {
            return LNama.get(indeks);
        }
        return null;
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < LNama.size()) {
            LNama.set(indeks, nama);
        }
    }

    public void addNama(String nama) {
        LNama.add(nama); 
    }

    public void delNama(String nama) {
        LNama.removeIf(n -> n.equals(nama));
    }

    public boolean isMember(String nama) {
        return LNama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru) {
        for (int i = 0; i < LNama.size(); i++) {
            if (LNama.get(i).equals(nama)) {
                LNama.set(i, namaBaru);
            }
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : LNama) {
            if (n.equals(nama)) count++;
        }
        return count;
    }

    public void showTeman() {
        System.out.println("=== Daftar Teman ===");
        if (LNama.isEmpty()) {
            System.out.println("(Koleksi kosong)");
        } else {
            for (int i = 0; i < LNama.size(); i++) {
                System.out.println("[" + i + "] " + LNama.get(i));
            }
        }
        System.out.println("Jumlah: " + getNbelm());
    }

    
    public static void main(String[] args) {
        Teman t = new Teman();

        // addNama
        t.addNama("Jordy");
        t.addNama("Rezzel");
        t.addNama("Siwol999");
        t.addNama("Hayfish"); 
        t.addNama("Muenza");
        t.addNama("Kafe");
        t.addNama("Buanyu");
        t.showTeman();

        // getNbelm
        System.out.println("\nJumlah teman: " + t.getNbelm());

        // getNama
        System.out.println("Nama indeks 1: " + t.getNama(1));

        // setNama
        t.setNama(0, "Alpha");
        System.out.println("Setelah setNama(0, Alpha): " + t.getNama(0));

        // isMember
        System.out.println("isMember(Kafe): " + t.isMember("Kafe"));
        System.out.println("isMember(Zaki): " + t.isMember("Zaki"));

        // countNama
        System.out.println("countNama(Siwol999): " + t.countNama("Siwol999"));

        // gantiNama
        t.gantiNama("Siwol999", "Siwol123");
        System.out.println("\nSetelah gantiNama(Siwol999 -> Siwol123):");
        t.showTeman();

        // delNama
        t.delNama("Buanyu");
        System.out.println("\nSetelah delNama(Buanyu):");
        t.showTeman();
    }
}