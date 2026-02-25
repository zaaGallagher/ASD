package PRAK3;

import java.util.Scanner;

public class DosenDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahDosen = 3;

        Dosen17[] daftarDosen = new Dosen17[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode       : ");
            String kode = sc.nextLine();
            System.out.print("Nama       : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jkInput = sc.nextLine();
            Boolean jk = jkInput.equalsIgnoreCase("Pria");

            System.out.print("Usia       : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("-----------------------------");

            daftarDosen[i] = new Dosen17(kode, nama, jk, usia);
        }

        System.out.println("\n======= DATA SELURUH DOSEN =======");
        int counter = 1;
        for (Dosen17 dsn : daftarDosen) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);

            String gender = dsn.jenisKelamin ? "Pria" : "Wanita";
            System.out.println("Jenis Kelamin : " + gender);

            System.out.println("Usia          : " + dsn.usia);
            System.out.println("-----------------------------");
            counter++;
        }
        DataDosen17 data = new DataDosen17();

        data.dataSemuaDosen(daftarDosen);
        data.jumlahDosenPerJenisKelamin(daftarDosen);
        data.rataRataUsiaDosen(daftarDosen);
        data.infoDosenPalingTua(daftarDosen);
        data.infoDosenPalingMuda(daftarDosen);

        sc.close();
    }
}