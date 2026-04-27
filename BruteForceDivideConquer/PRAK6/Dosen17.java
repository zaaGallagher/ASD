package BruteForceDivideConquer.PRAK6;

public class Dosen17 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen17(String kd, String nm, boolean jk, int us) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = us;
    }
    void tampilInformasi() {
        String jk = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia          : " + usia);
    }
}
