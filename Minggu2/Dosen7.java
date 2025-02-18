package Minggu2;

public class Dosen7 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen7() {}
    public Dosen7(
        String _idDosen, String _nama, 
        boolean _statusAktif, int _tahunBergabung,
        String _bidangKeahlian
    ) {
        idDosen = _idDosen;
        nama = _nama;
        statusAktif = _statusAktif;
        tahunBergabung = _tahunBergabung;
        bidangKeahlian = _bidangKeahlian;
    }

    void tampilkanInformasi() {
        System.out.println("Id: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status aktif: " + statusAktif);
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean _statusAktif) {
        statusAktif = _statusAktif;
        System.out.println("Status aktif: " + statusAktif);
    }

    int hitungMasaKerja(int _thnNow) {
        if (_thnNow < tahunBergabung) {
            System.out.println("Tahun tidak valid");
        } else {
            return _thnNow -= tahunBergabung;
        }
        return 0;
    }

    void ubahKeahlian(String _bidangKeahlian) {
        bidangKeahlian = _bidangKeahlian;
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }
}
