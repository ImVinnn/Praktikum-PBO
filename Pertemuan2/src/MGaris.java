public class MGaris {

    public static void main(String[] args) {

        // Membuat beberapa titik
        Titik T1 = new Titik(1, 2);
        Titik T2 = new Titik(4, 6);
        Titik T3 = new Titik(1, 5);

        // Membuat garis
        Garis G1 = new Garis(T1, T2);
        Garis G2 = new Garis(T1, T3);

        // Menampilkan garis
        System.out.println("Data Garis:");
        G1.printGaris();
        G2.printGaris();

        // Menampilkan panjang garis
        System.out.println("\nPanjang G1: " + G1.getPanjang());
        System.out.println("Panjang G2: " + G2.getPanjang());

        // Menampilkan gradien
        System.out.println("\nGradien G1: " + G1.getGradien());

        try {
            System.out.println("Gradien G2: " + G2.getGradien());
        } catch (ArithmeticException e) {
            System.out.println("Gradien G2: " + e.getMessage());
        }

    }
}