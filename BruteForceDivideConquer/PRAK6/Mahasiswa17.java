package BruteForceDivideConquer.PRAK6;

public class Mahasiswa17 {
    String nim;
    String nama;
    String kelas;
    Double ipk;

    Mahasiswa17() {
    }

    Mahasiswa17(String nm, String name, String kls, Double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }

    public Mahasiswa17(String ni, String na, String ke, double ip) {
        nim = ni;
        nama = na;
        kelas = ke;
        ipk = ip;
    }
}
