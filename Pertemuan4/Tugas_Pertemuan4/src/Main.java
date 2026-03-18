import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        dosenTetap dosen1 = new dosenTetap(
                "9545647548",
                "78647324",
                "Farhan Maulana Risanta",
                LocalDate.of(1990,5,5),
                LocalDate.of(2015,1,1),
                5000000,
                "Fakultas Sains dan Matematika"
        );

        dosenTamu dosen2 = new dosenTamu(
                "8899776655",
                "12345678",
                "Jeyfrey Eighteen",
                LocalDate.of(1985,3,10),
                LocalDate.of(2022,2,1),
                4500000,
                "Fakultas Teknik",
                LocalDate.of(2027,2,1)
        );

        Tendik tendik1 = new Tendik(
                "9988776655",
                "Adyios Saputra",
                LocalDate.of(1992,8,20),
                LocalDate.of(2018,4,1),
                3500000,
                "Akademik"
        );

        System.out.println("===== DOSEN TETAP =====");
        dosen1.printInfo();

        System.out.println("\n===== DOSEN TAMU =====");
        dosen2.printInfo();

        System.out.println("\n===== TENDIK =====");
        tendik1.printInfo();
    }
}