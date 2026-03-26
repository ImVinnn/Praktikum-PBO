import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {

        PNS p1 = new PNS("Otto Apocalypse", LocalDate.of(2006,4,1),"Jl. NgestiPandowo",15000000,"198302032006041002");
        Pengusaha pe1 = new Pengusaha("Ashveil", LocalDate.of(2000,1,1),"Jl.Planacardia 10",55000000,"000-556-773-212-000-5");
        Petani pt1 = new Petani("Kiana Kaslana", LocalDate.of(1977,1,9),"Jl. Schicksal III",5000000,"Wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.of(2010,4,1),"",10000000,"198004212010041002");

        p2.setAlamat("Jl. Panorama");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("Pajak PNS = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha = " + pe1.hitungPajak());
        System.out.println("Pajak Petani = " + pt1.hitungPajak());

        System.out.println("Masa Kerja PNS = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja Pengusaha = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja Petani = " + pt1.hitungMasaKerja());

        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}
