import java.time.LocalDate;

public class Petani extends Manusia {
    private String asal;
    private LocalDate tglMulai;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tglLahir, String alamat, double pendapatan, String asal){
        super(nama, tglLahir, alamat, pendapatan);
        this.asal = asal;
        this.tglMulai = LocalDate.now();
        counterPetani++;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    public int hitungMasaKerja(){
        return super.hitungMasaKerja(tglMulai) + 1;
    }

    public double hitungPajak(){
        return 0;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal: " + asal);
    }
}