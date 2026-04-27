public class Surat17 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // S: sakit, I: izin
    int durasi;

    public Surat17(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampil() {
        System.out.println("ID Surat       : " + idSurat);
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("Kelas          : " + kelas);
        System.out.println("Jenis Izin     : " + jenisIzin);
        System.out.println("Durasi         : " + durasi + " hari");
        System.out.println("-----------------------------");
    }
}