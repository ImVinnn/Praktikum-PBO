// Nama : Mohammad Banyuputra Eka Pramudhita
// NIM : 24060124140193

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        
        // implementasi Tanpa Lambda (menggunakan Anonymous Class)
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // implementasi Dengan Lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // implementasi Dengan Lambda menggunakan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        // Menampilkan hasil
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}