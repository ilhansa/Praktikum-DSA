package Minggu6;

public class DosenMain7 {
    public static void main(String[] args) {
        DataDosen7 listDosen = new DataDosen7();

        Dosen7 ds1 = new Dosen7("1", 30);
        Dosen7 ds2 = new Dosen7("2", 40);
        Dosen7 ds3 = new Dosen7("3", 25);
        Dosen7 ds4 = new Dosen7("4", 59);
        Dosen7 ds5 = new Dosen7("5", 33);
        Dosen7 ds6 = new Dosen7("6", 42);
        Dosen7 ds7 = new Dosen7("7", 60);
        Dosen7 ds8 = new Dosen7("8", 57);
        Dosen7 ds9 = new Dosen7("9", 44);
        Dosen7 ds10 = new Dosen7("10", 44);

        listDosen.tambah(ds1);
        listDosen.tambah(ds2);
        listDosen.tambah(ds3);
        listDosen.tambah(ds4);
        listDosen.tambah(ds5);
        listDosen.tambah(ds6);
        listDosen.tambah(ds7);
        listDosen.tambah(ds8);
        listDosen.tambah(ds9);
        listDosen.tambah(ds10);

        listDosen.tampil(); 
        listDosen.sortingAsc();
        System.out.println("Setelah disorting (ASC)");
        listDosen.tampil();
        listDosen.sortingDsc();
        System.out.println("Setelah disorting (DSC)");
        listDosen.tampil();
    }
}
