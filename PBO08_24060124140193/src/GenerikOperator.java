/* Nama file   : GenerikOperator.java
   Deskripsi   : Generik pada Operator
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

class OperatorGenerik {

    public static <T> void Tukar(T[] a, T[] b) {
        T temp = a[0];
        a[0]   = b[0];
        b[0]   = temp;
    }

    public static <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}

public class GenerikOperator {
public static void main(String[] args) {

    // Tukar Integer
    Integer[] a = {3}, b = {6};
    System.out.println("Sebelum: a=" + a[0] + ", b=" + b[0]);
    OperatorGenerik.Tukar(a, b);
    System.out.println("Sesudah: a=" + a[0] + ", b=" + b[0]);

    // Tukar String
    String[] s1 = {"Kiana"}, s2 = {"Mei"};
    System.out.println("Sebelum: s1=" + s1[0] + ", s2=" + s2[0]);
    OperatorGenerik.Tukar(s1, s2);
    System.out.println("Sesudah: s1=" + s1[0] + ", s2=" + s2[0]);

    // Tukar Anabul
    Anabul[] obj1 = { new Anjing("Bronya") };
    Anabul[] obj2 = { new Kucing("Seele", 3.0) };
    System.out.println("Sebelum: obj1=" + obj1[0].getNama() + ", obj2=" + obj2[0].getNama());
    OperatorGenerik.Tukar(obj1, obj2);
    System.out.println("Sesudah: obj1=" + obj1[0].getNama() + ", obj2=" + obj2[0].getNama());
    obj1[0].suara();
    obj2[0].suara();

    // Bobot2
    Anggora ag1 = new Anggora("Elysia", 3.5);
    Kembangtelon kt1 = new Kembangtelon("Kiana", 4.0);
    System.out.println("Bobot2 Anggora & Anggora           : " + OperatorGenerik.Bobot2(ag1, ag1));
    System.out.println("Bobot2 Kembangtelon & Kembangtelon : " + OperatorGenerik.Bobot2(kt1, kt1));
    System.out.println("Bobot2 Anggora & Kembangtelon      : " + OperatorGenerik.<Kucing>Bobot2(ag1, kt1));
    
    }
}