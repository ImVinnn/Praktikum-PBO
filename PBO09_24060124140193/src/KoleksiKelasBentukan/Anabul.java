package KoleksiKelasBentukan;
 
public class Anabul {
    String nama;
    String panggilan; 
 
    Anabul(String nama, String panggilan) { 
        this.nama = nama;
        this.panggilan = panggilan;
    }
 
    public void setNama(String panggilan) { 
        this.panggilan = panggilan;
    }
 
    String getNama() { 
        return this.panggilan;
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
 
    Kucing(String nama, String panggilan, double bobot) {
        super(nama, panggilan);
        this.bobot = bobot;
    }
 
    public double getBobot() {
        return bobot;
    }
 
    @Override
    void suara() {
        System.out.println(panggilan + ": Meong");
    }
 
    @Override
    void gerak() {
        System.out.println(panggilan + " bergerak melata");
    }
}
 
class Anggora extends Kucing {
    Anggora(String nama, String panggilan, double bobot) {
        super(nama, panggilan, bobot);
    }
 
    @Override
    void suara() {
        System.out.println(panggilan + ": Mengeong");
    }
}
 
class Kembangtelon extends Kucing {
    Kembangtelon(String nama, String panggilan, double bobot) { 
        super(nama, panggilan, bobot);
    }
 
    @Override
    void suara() {
        System.out.println(panggilan + ": Mengeong");
    }
}
 
// Subclass Anjing
class Anjing extends Anabul {
    Anjing(String nama, String panggilan) { 
        super(nama, panggilan);
    }
 
    @Override
    void suara() {
        System.out.println(panggilan + ": Guk-guk");
    }
 
    @Override
    void gerak() {
        System.out.println(panggilan + " bergerak melata");
    }
}
 
// Subclass Burung
class Burung extends Anabul {
    Burung(String nama, String panggilan) { 
        super(nama, panggilan);
    }
 
    @Override
    void suara() {
        System.out.println(panggilan + ": Cuit");
    }
 
    @Override
    void gerak() {
        System.out.println(panggilan + " terbang");
    }
}