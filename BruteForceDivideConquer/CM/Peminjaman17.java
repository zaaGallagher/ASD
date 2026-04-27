package BruteForceDivideConquer.CM;

public class Peminjaman17 {
    Mahasiswa17 mhs;
    Buku17 buku;
    int lamaPinjam, terlambat, denda;

    Peminjaman17(Mahasiswa17 mhs, Buku17 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        int batasPinjam = 5;
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampil() {
        System.out.println(mhs.nama + " | " + buku.judul +
        " | Lama: " + lamaPinjam +
        " | Terlambat: " + terlambat +
        " | Denda: " + denda);
    }

    
}
