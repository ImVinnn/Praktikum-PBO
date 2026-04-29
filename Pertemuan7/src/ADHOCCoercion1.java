public class ADHOCCoercion1 {
    public static void main(String[] args) {

        // a. Contoh coercion
        int nilai = 65;
        System.out.println("Integer: " + nilai);
        System.out.println("Char: " + (char) nilai);
        System.out.println("Double: " + (double) nilai);

        // b. int -> double -> int
        double real = nilai;
        int kembali = (int) real;
        System.out.println("Kembali ke int: " + kembali);

        // c. 
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S (concat): " + S);
        System.out.println("Z (jumlah): " + Z);

        // d.
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("R (concat): " + R);
        System.out.println("D (jumlah): " + D);

        // e.
        Integer A = Integer.parseInt(S);
        System.out.println("A: " + A);

        // f.
        String T = A.toString();
        System.out.println("T: " + T);
    }
}