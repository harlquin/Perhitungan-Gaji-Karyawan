import java.time.*;
 
public class Program {
 
    public static void main(String[] args) {
        // contoh obyek data pegawai
        Karyawan p1 = new Karyawan("H01", "Alfian", 0);
        p1.printKaryawan();
         
        // contoh obyek data pegawai dosen
        Tetap p2 = new Tetap("H02", "Alfian", 1, "6666");
        p2.printKaryawan();
         
        // contoh obyek data pegawai nondosen
        Honorer p3 = new Honorer("H03", "Alfian", 2);
        p3.printKaryawan();
    }
     
}