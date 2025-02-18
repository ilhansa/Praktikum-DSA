package Minggu2;

public class MahasiswaMain7 {
    public static void main(String[] args) {
        Mahasiswa7 mhs1 = new Mahasiswa7();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2j";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2k");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa7 mhs2 = new Mahasiswa7(
            "Anisa Nabila", "2141720160",
            "TI 2L", 3.25
            );
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa7 IlhanSalihIlmansyah = new Mahasiswa7(
            "Ilhan Salih Ilmansyah", "244107060072",
            "SIB 1D", 3.74
            );

        IlhanSalihIlmansyah.tampilkanInformasi();
    }
}
