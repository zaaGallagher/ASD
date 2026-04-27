package BruteForceDivideConquer.CM;

public class Buku17 {
    String kodeBuku, judul, penerbit;
    int tahunTerbit;

    Buku17(String kodeBuku, String judul, String penerbit, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
    }
    void tampil() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit + " | penerbit: " + penerbit);
    }
}
