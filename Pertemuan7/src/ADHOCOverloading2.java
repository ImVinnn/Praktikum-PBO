class Mahasiswa {
    String nim;
    String nama;
    String programStudi;

    // Constructor default
    Mahasiswa() {
        nim = "-999";
        nama = "n/a";
        programStudi = "n/a";
    }

    // Constructor parameter
    Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // Copy constructor
    Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // Overloading method
    void setProgramStudi() {
        programStudi = "Kosong";
    }

    void setProgramStudi(String prodi) {
        programStudi = prodi;
    }

    void setProgramStudi(Mahasiswa m) {
        programStudi = m.programStudi;
    }

    void tampil() {
        System.out.println(nim + " | " + nama + " | " + programStudi);
    }
}

public class ADHOCOverloading2 {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();
        m1.setProgramStudi();

        Mahasiswa m2 = new Mahasiswa("123", "Banyu", "Informatika");

        Mahasiswa m3 = new Mahasiswa();
        m3.setProgramStudi("Sistem Informasi");

        Mahasiswa m4 = new Mahasiswa();
        m4.setProgramStudi(m2);

        Mahasiswa m5 = new Mahasiswa(m2); // cloning

        m1.tampil();
        m2.tampil();
        m3.tampil();
        m4.tampil();
        m5.tampil();
    }
}