// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM : 24060124140193
// Lab : PBO B1
// File : MBangunDatar.java 

public class MBangunDatar {
    public static void main(String[] args) {

        BangunDatar p1 = new Persegi(10);
        Persegi p2 = new Persegi(5);
        BangunDatar l1 = new Lingkaran(7);

        System.out.println("Luas Persegi: " + p1.getLuas());
        System.out.println("Keliling Lingkaran: " + l1.getKeliling());

        System.out.println("Luas sama? " + p1.isEqualLuas(l1));

        ((Persegi)p1).zoomIn();
        System.out.println("Luas setelah zoomIn: " + p1.getLuas());
    }
}