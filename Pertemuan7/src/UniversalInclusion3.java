// Superclass
class Anabul {
    String nama;

    Anabul(String nama) {
        this.nama = nama;
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
    Kucing(String nama) {
        super(nama);
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

public class UniversalInclusion3 {
    public static void main(String[] args) {

        Anabul[] daftar = {
            new Kucing("Kitty"),
            new Anjing("Doggy"),
            new Burung("Birdy")
        };

        for (Anabul a : daftar) {
            a.suara();
            a.gerak();
            System.out.println();
        }
    }
}