/* Nama file   : Larik.java
   Deskripsi   : Generik Larik
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

class Data<T>
{
    // atribut
    private T[] ruang;
    private int banyak;

    // method
    Data()
    {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public void setIsi(int pos, T obj)
    {
        ruang[pos - 1] = obj;
        if(pos > banyak)
        {
            banyak = pos;
        }
    }

    public T getIsi(int pos)
    {
        return ruang[pos - 1];
    }

    public int getSize()
    {
        return banyak;
    }
}

public class Larik {
    public static void main(String[] args) {
        Data<Anabul> dat = new Data<>();

        // setIsi
        dat.setIsi(1, new Kucing("Firefly", 4.5));  
        dat.setIsi(2, new Anjing("March7"));     
        dat.setIsi(3, new Burung("Robin"));           
        dat.setIsi(4, new Anggora("Stelle", 3.5));
        dat.setIsi(5, new Kembangtelon("Herta", 4.0));   

        // getIsi
        System.out.print("getIsi[1] : " + dat.getIsi(1).getNama() + " - ");
        dat.getIsi(1).suara();
        System.out.print("getIsi[2] : " + dat.getIsi(2).getNama() + " - ");
        dat.getIsi(2).suara();
        System.out.print("getIsi[3] : " + dat.getIsi(3).getNama() + " - ");
        dat.getIsi(3).suara();
        System.out.print("getIsi[4] : " + dat.getIsi(4).getNama() + " - ");
        dat.getIsi(4).suara();
        System.out.print("getIsi[5] : " + dat.getIsi(5).getNama() + " - ");
        dat.getIsi(5).suara();

        // getSize
        System.out.println("Total istri weh : " + dat.getSize());
    }
}