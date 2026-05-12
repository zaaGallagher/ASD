
public class MahasiswaTugas17 {
    String nim;
    String nama;
    String keperluan;

    public MahasiswaTugas17(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilData() {
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Keperluan  : " + keperluan);
    }
}