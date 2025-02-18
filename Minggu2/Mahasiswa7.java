package Minggu2;

public class Mahasiswa7 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa7(){}

    public Mahasiswa7(
        String _nama, String _nim,
        String kelas, Double ipk) {
            nama = _nama;
            nim = _nim;
            this.kelas = kelas;
            this.ipk = ipk;
    }
    
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Ipk: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }
    
    String nilaiKinerja() {
        if (ipk > 4.0 || ipk < 0 ) {
            return "Nilai ipk tidak valid";
        }
        else if(ipk >= 3.5) {
            return "Kinerja sangat baik";
        }
        else if (ipk >= 3.0) {
            return "Kinerja baik";
        }
        else if (ipk >= 2.0) {
            return "Kinerja cukup";
        }
        else {
            return "Kinerja kurang";
        }
    }
}
