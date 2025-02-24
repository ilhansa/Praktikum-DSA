public class DataDosen7 {
    public void dataSemuaDosen(Dosen7[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data dosen ke-" + (i+1));
            System.out.println("Kode: " + arrayOfDosen[i].kode);
            System.out.println("Nama: " + arrayOfDosen[i].nama);
            System.out.println(
                "Jenis Kelamin: " + 
                (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita")
            );
            System.out.println("Usia: " + arrayOfDosen[i].usia);
            System.out.println("------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen7[] arrayOfDosen) {
        
    }
}
