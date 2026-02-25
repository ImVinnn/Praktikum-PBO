import javax.imageio.plugins.tiff.TIFFDirectory;

public class Titik {
    /**************ATRIBUT****************/
    double absis;
    double ordinat;

    /**************METHOD*****************/
    //konstruktor untuk membuat titik (0,0)
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    Titik(){
        this(0,0);
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void setRefleksiY(){
        this.absis = this.absis*(-1);
    }

    void setRefleksiX(){
        this.ordinat = this.ordinat*(-1);
    }

    public Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }

    double getjarak(Titik T){
        return Math.sqrt(Math.pow((this.absis - T.absis), 2) + Math.pow((this.ordinat - T.ordinat), 2));
    }


} //end class Titik