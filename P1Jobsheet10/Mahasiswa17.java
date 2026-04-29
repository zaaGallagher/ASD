package P1Jobsheet10;

public class Mahasiswa17 {

    String nim, nama, prodi, kelas;

    public Mahasiswa17(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
