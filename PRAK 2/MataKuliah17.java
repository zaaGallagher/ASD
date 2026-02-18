public class MataKuliah17 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah17(){
    }

    public MataKuliah17(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi(){
        System.out.println("Kode MK :" + kodeMK);
        System.out.println("Nama :" + nama);
        System.out.println("SKS :" + sks);
        System.out.println("Jumlah Jam :" + jumlahJam);
        System.out.println("---------------------------");
    }

    void ubahSKS(int sksBaru){
        this.sks = sksBaru;
        System.out.println("SKS telah di ubah menjadi :" + sks);
    }

    void tambahJam(int Jam){
        this.jumlahJam += Jam;
        System.out.println("Jam berhasil ditambah. Total jam sekarang:" + jumlahJam);
    }

    void kurangiJam(int Jam){
       if (this.jumlahJam >= Jam) {
            this.jumlahJam -= Jam;
            System.out.println("Pengurangan berhasil. Sisa jam: " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal! Jumlah jam tidak mencukupi (Sisa jam: " + jumlahJam + ")");

        }
    }
}