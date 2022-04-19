public class Karyawan {
    // atribut & variabel
    protected String idKaryawan;
    protected String nama;
    protected int gol;
     
    // constructor
    Karyawan(String id, String nama, int gol){
        this.idKaryawan = id;
        this.nama = nama;
        this.gol = gol;
    }
     
    // Menghitung total Gaji Pokok
    // Asumsi Gaji Pokok 4,500.000
    long hitungGapok(){
        long gapok = 4500000;
        return gapok;
    }
     
    // mencetak data pegawai dan gaji pokoknya
    void printKaryawan(){
        System.out.println("ID Karyawan\t: " + this.idKaryawan);
        System.out.println("Nama Karyawan\t: " + this.nama);
        System.out.println("Golongan\t: " + this.gol);
        System.out.println("Gaji Pokok\t: Rp " + this.hitungGapok() + "\n");
    }
}