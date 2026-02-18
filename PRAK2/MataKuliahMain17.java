public class MataKuliahMain17 {
    
    public static void main(String[] args) {
        System.out.println("=== Objek 1 (Konstruktor Default) ===");
        MataKuliah17 mk1 = new MataKuliah17();
        mk1.kodeMK = "ALSD_01";
        mk1.nama = "Algoritma Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();

        System.out.println();

        System.out.println("=== Objek 2 (Konsturktor Berparameter) ===");
        MataKuliah17 mk2 = new MataKuliah17("BING_02", "Bahasa Inggris", 2,4);

        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(1);

        System.out.println("Mencoba kurangi 10 jam: ");
        mk2.kurangiJam(10);

        System.out.println("Mencoba kurangi 2 jam:");
        mk2.kurangiJam(2);

        System.out.println("\nInformasi akhir objek 2:");
        mk2.tampilInformasi();
    }
}
