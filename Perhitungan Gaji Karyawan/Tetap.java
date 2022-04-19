public class Tetap extends Karyawan {
    // atribut tambahan untuk Karyawan
    private String nidn;
    private int hari=30;
     
    // constructor
    Tetap(String id, String nama, int gol, String nidn){
        super(id, nama, gol);
        this.nidn = nidn;
    }
 
    // menghitung tunjangan karyawan
    long hitungTunjKaryawan(){
        long tunjKaryawan = this.hitungGapok() * 10/100;
        return tunjKaryawan;
    }
    // menghitung tunjangan Makan
    long hitungTunjMakan(){
        long tunjMakan = 50000*hari;
        return tunjMakan;
    }
    // menghitung tunjangan Transport
    long hitungTunjTransport(){
        long tunjTransport = 75000*hari;
        return tunjTransport;
    }
     
    // menghitung total gaji
    long hitungTotalGaji(){
        long total = this.hitungGapok() + this.hitungTunjMakan() + this.hitungTunjTransport() + this.hitungTunjKaryawan();
        return total;
    }
     
    // cetak data karyawan, rincian gaji, total gaji
    void printKaryawan(){
        System.out.println("ID Karyawan\t: " + this.idKaryawan);
        System.out.println("Nama Karyawan\t: " + this.nama);
        System.out.println("Golongan\t: " + this.gol);
        System.out.println("NIDN\t\t: " + this.nidn);
        System.out.println("Gaji Pokok\t: Rp " + this.hitungGapok());
        System.out.println("Tunj Makan\t: Rp " + this.hitungTunjMakan());
        System.out.println("Tunj Transport\t: Rp " + this.hitungTunjTransport());
        System.out.println("Tunj Karyawan\t: Rp " + this.hitungTunjKaryawan());
        System.out.println("Total Gaji\t: Rp " + this.hitungTotalGaji() + "\n");
    }
}