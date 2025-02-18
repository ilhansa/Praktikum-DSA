package Minggu2;

public class MataKuliah7 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah7() {}
    public MataKuliah7(
        String _kodeMk, String _nama,
        int _sks, int _jumlahJam
        ) 
    {
        kodeMk = _kodeMk;
        nama = _nama;
        sks = _sks;
        jumlahJam = _jumlahJam;
    }

    void tampilkanInformasi(){
        System.out.println("Kode matkul: " + kodeMk);
        System.out.println("Nama matkul: " + nama);
        System.out.println("Jumlah sks: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }
    void ubahSks(int _sks) {
        sks = _sks;
        System.out.println("Jumlah sks baru: " + sks);
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam baru: " + jumlahJam);
    }
    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
        } 
        else {
            System.out.println("Jumlah jam tidak dapat dikurangi");
        }
        System.out.println("Jumlah jam baru: " + jumlahJam);
    }
}
