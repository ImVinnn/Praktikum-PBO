public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser
        
        T1.setRefleksiY(); //mengubah absis T1 menjadi refleksi terhadap sumbu Y
        T1.setRefleksiX(); //mengubah ordinat T1 menjadi refleksi terhadap sumbu X
        T1.printTitik(); //menampilkan koordinat T1 setelah direfleksikan terhadap sumbu X dan Y

        Titik RefleksiX = T1.getRefleksiX(); //membuat objek Titik RefleksiX yang merupakan hasil refleksi T1 terhadap sumbu X
        RefleksiX.printTitik();

        Titik RefleksiY = T1.getRefleksiY(); //membuat objek Titik RefleksiY yang merupakan hasil refleksi T1 terhadap sumbu Y
        RefleksiY.printTitik();
    }
}