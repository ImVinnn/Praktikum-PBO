// Superclass
class Civitasakademika {
    String nama;

    Civitasakademika(String nama) {
        this.nama = nama;
    }

    String getNomor() {
        return "-";
    }
}

// Dosen
class Dosen extends Civitasakademika {
    String nip;

    Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    @Override
    String getNomor() {
        return nip;
    }
}

// Mahasiswa
class Mahasiswa2 extends Civitasakademika {
    String nim;
    Dosen dosenWali;

    Mahasiswa2(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    @Override
    String getNomor() {
        return nim;
    }

    void setWali(Dosen d) {
        dosenWali = d;
    }

    void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Dosen Wali: " + dosenWali.nama);
    }
}

// Seminar
class Seminar {
    Civitasakademika[] pesertas = new Civitasakademika[100];
    int banyakPeserta = 0;

    void registrasi(Civitasakademika c) {
        pesertas[banyakPeserta++] = c;
    }

    int countPeserta() {
        return banyakPeserta;
    }

    void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " - " + pesertas[i].nama);
        }
    }

    int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }
}

public class UniversalInclusion4 {
    public static void main(String[] args) {

        Seminar s = new Seminar();

        Dosen d1 = new Dosen("Pak Budi", "D001");
        Dosen d2 = new Dosen("Bu Ani", "D002");

        Mahasiswa2 m1 = new Mahasiswa2("A", "M001");
        Mahasiswa2 m2 = new Mahasiswa2("B", "M002");
        Mahasiswa2 m3 = new Mahasiswa2("C", "M003");
        Mahasiswa2 m4 = new Mahasiswa2("D", "M004");
        Mahasiswa2 m5 = new Mahasiswa2("E", "M005");

        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        System.out.println("Total Peserta: " + s.countPeserta());
        s.tampilPeserta();
        System.out.println("Jumlah Mahasiswa: " + s.countMahasiswa());

        m1.tampilDataMahasiswa();
    }
}