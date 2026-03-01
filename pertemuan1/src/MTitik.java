public class MTitik {

    public static void main(String[] args) {

        // Membuat beberapa objek Titik
        Titik T1 = new Titik(3, 4);
        Titik T2 = new Titik(-2, 5);
        Titik T3 = new Titik(); // (0,0)

        // Menampilkan titik
        System.out.println("Data Titik:");
        T1.printTitik();
        T2.printTitik();
        T3.printTitik();

        // Jarak ke pusat
        System.out.println("\nJarak T1 ke pusat: " + T1.getJarakPusat());
        System.out.println("Jarak T2 ke pusat: " + T2.getJarakPusat());

        // Jarak antar titik
        System.out.println("\nJarak T1 ke T2: " + T1.getjarak(T2));

        // Kuadran
        System.out.println("\nKuadran T1: " + T1.getKuadran());
        System.out.println("Kuadran T2: " + T2.getKuadran());
        System.out.println("Kuadran T3: " + T3.getKuadran());

        // Refleksi
        Titik T4 = T1.getRefleksiX();
        Titik T5 = T1.getRefleksiY();

        System.out.println("\nRefleksi T1 terhadap sumbu X:");
        T4.printTitik();

        System.out.println("Refleksi T1 terhadap sumbu Y:");
        T5.printTitik();

        // Geser titik
        T1.geser(2, -1);
        System.out.println("\nT1 setelah digeser (2,-1):");
        T1.printTitik();
    }
}