package jdbc.program;

import java.util.ArrayList;
import java.util.List;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        List<Mahasiswa> listMhs = new ArrayList<>();
        System.out.println("");

        // insert
        System.out.println("insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // update
        System.out.println("\nupdate");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // delete
        System.out.println("\ndelete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

    public static void displayAll() {
        System.out.println("===displayAll");

        List<Mahasiswa> listMhs = service.getAll();

        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }
}