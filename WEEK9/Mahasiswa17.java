public class Mahasiswa17 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa17(String nama, String nim, String kelas, double d) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    public void tampilInformasi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tampilInformasi'");
    }
}
