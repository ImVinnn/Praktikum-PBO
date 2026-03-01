public class Titik {

    /************** ATRIBUT ****************/
    double absis;
    double ordinat;

    /************** KONSTRUKTOR ****************/
    // Konstruktor dengan parameter
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    // Konstruktor default (0,0)
    Titik() {
        this(0, 0);
    }

    /************** GETTER ****************/
    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    /************** SETTER ****************/
    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    /************** METHOD LAIN ****************/
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void setRefleksiY() {
        this.absis = this.absis * (-1);
    }

    void setRefleksiX() {
        this.ordinat = this.ordinat * (-1);
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    double getjarak(Titik T) {
        return Math.sqrt(
            Math.pow((this.absis - T.absis), 2) +
            Math.pow((this.ordinat - T.ordinat), 2)
        );
    }

    // Menghitung jarak titik ke pusat (0,0)
    double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    // Menentukan kuadran titik
    int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0){
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else if (absis > 0 && ordinat < 0){
            return 4;
        } else {
            return 0;
        }
    }

} // end class Titik