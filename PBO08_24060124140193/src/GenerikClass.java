/* Nama file   : GenerikClass.java
   Deskripsi   : Generik dengan Class
   NIM / Nama  : 24060124140193 / Mohammad Banyuputra Eka Pramudhita
   Tanggal     : 3 Mei 2025
   Lab         :  B1 */

// Superclass
class Anabul {
    String nama;

    Anabul(String nama) {
        this.nama = nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return this.nama;
    }

    void suara() {
        System.out.println("Hewan bersuara");
    }

    void gerak() {
        System.out.println("Hewan bergerak");
    }
}

// Subclass Kucing
class Kucing extends Anabul {
    double bobot;

    Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    void suara() {
        System.out.println(nama + ": Meong");
    }

    @Override
    void gerak() {
        System.out.println(nama + " bergerak melata");
    }
}

class Anggora extends Kucing {
    Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    void suara() {
        System.out.println(nama + ": Mengeong");
    }

}

class Kembangtelon extends Kucing {
    Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    void suara() {
        System.out.println(nama + ": Mengeong");
    }
}

// Subclass Anjing
class Anjing extends Anabul {
    Anjing(String nama) {
        super(nama);
    }

    @Override
    void suara() {
        System.out.println(nama + ": Guk-guk");
    }

    @Override
    void gerak() {
        System.out.println(nama + " bergerak melata");
    }
}

// Subclass Burung
class Burung extends Anabul {
    Burung(String nama) {
        super(nama);
    }

    @Override
    void suara() {
        System.out.println(nama + ": Cuit");
    }

    @Override
    void gerak() {
        System.out.println(nama + " terbang");
    }
}

class Datum<T> {
    private T isi;

    Datum(T isi) {
        this.isi = isi;
    }

    T getIsi() {
        return isi;
    }

    void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}

public class GenerikClass {
    public static void main(String[] args) {
        Anggora ag1 = new Anggora("Cypher", 3.5);
        Kembangtelon kt1 = new Kembangtelon("DElta", 4.0);

        Datum<Kucing> d = new Datum<>(ag1);

        System.out.println("Tipe sekarang : Anggora");
        System.out.println("Nama  : " + d.getIsi().nama);
        d.getIsi().suara();
        d.getIsi().gerak();

        d.setIsi(kt1);

        System.out.println("Tipe sekarang : Kembangtelon");
        System.out.println("Nama  : " + d.getIsi().nama);
        d.getIsi().suara();
        d.getIsi().gerak();
    }
}