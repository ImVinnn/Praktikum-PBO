// PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
// Jelaskan pada lembar laporan praktikum!

/* Yang kurang tepat adalah penggunaan assert untuk memvalidasi input nilai jari-jari.
/* Secara konsep, asersi tidak boleh digunakan untuk memvalidasi input dari pengguna
/* karena asersi hanya aktif jika program dijalankan dengan flag -enableassertions.
/* Jika dijalankan tanpa flag tersebut, asersi diabaikan dan program tetap berjalan
/* meski nilai jari-jari nol. Untuk validasi input, seharusnya digunakan eksepsi
/* seperti IllegalArgumentException agar validasi selalu berjalan dalam kondisi apapun. */

// Apakah baris 12 dieksekusi saat eksepsi terjadi?
/* Tidak. Ketika cobaAngka(13) dipanggil dan kondisi if(angka==13) terpenuhi, program
/* langsung mengeksekusi throw new AngkaSialException() sehingga alur method langsung
/* berhenti. Baris 12 tidak sempat dieksekusi karena kontrol program sudah berpindah
/* ke blok catch. */

// Apakah baris 21 dieksekusi?
/* Ya. Ketika as.cobaAngka(13) melempar eksepsi, blok catch pada baris 21 aktif
/* menangkap eksepsi tersebut. Akibatnya baris 20 as.cobaAngka(12) tidak sempat
/* dieksekusi, dan program langsung mencetak pesan dari getMessage() yaitu
/* "jangan memasukkan angka 13 karena angka sial !!!" diikuti
/* "hati-hati memasukkan angka!!!". */