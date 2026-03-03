public class Garis {

    /************** ATRIBUT ****************/
    Titik titikAwal;
    Titik titikAkhir;

    /************** KONSTRUKTOR ****************/
    // Konstruktor dengan parameter
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    // Konstruktor default
    Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    Titik getTitikAwal() {
        return titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    void setTitikAwal(Titik T) {
        titikAwal = T;
    }

    void setTitikAkhir(Titik T) {
        titikAkhir = T;
    }

    double getPanjang() {
        return titikAwal.getjarak(titikAkhir);
    }

    double getGradien() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        if (x2 - x1 == 0) {
            throw new ArithmeticException("ini adalah gris tegak lurus");
        }

        return (y2 - y1) / (x2 - x1);
    }

    void printGaris() {
        System.out.println(
            "Garis dari (" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() +") ke (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")"
        );
    }

}