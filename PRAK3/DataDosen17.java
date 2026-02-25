package PRAK3;

public class DataDosen17 {
    public void dataSemuaDosen(Dosen17[] arrayOfDosen) {
        System.out.println("\n=== Menampilkan Data Semua Dosen ===");
        for (int i = 0; i < arrayOfDosen.length; i++) {
           System.out.println("Data Dosen ke-" + (i + 1));
           arrayOfDosen[i].tampilData();
           System.out.println("-----------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen17[] arrayOfDosen) {
        int Pria = 0;
        int Wanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                Pria++;
            } else {
                Wanita++;
            }
        }
        System.out.println("\n=== Statistik Jenis Kelamin ===");
        System.out.println("Jumlah Dosen Pria: " + Pria);
        System.out.println("Jumlah Dosen Wanita: " + Wanita);
    }

    public void rataRataUsiaDosen(Dosen17[] arrayOfDosen) {
        int totalUsia = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                totalUsia += arrayOfDosen[i].usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += arrayOfDosen[i].usia;
                jumlahWanita++;
            }
        }
        System.out.println("\n=== Rata-rata Usia Dosen ===");
        double rataRataPria = (jumlahPria > 0) ? (double) totalUsia / jumlahPria : 0;
        double rataRataWanita = (jumlahWanita > 0) ? (double) totalUsiaWanita / jumlahWanita : 0;
        System.out.println("Rata-rata Usia Dosen Pria: " + rataRataPria);
        System.out.println("Rata-rata Usia Dosen Wanita: " + rataRataWanita);
    }

    public void infoDosenPalingTua(Dosen17[] arrayDosen17){
        if (arrayDosen17.length == 0) return;
          
        Dosen17 tertua = arrayDosen17[0];
        for (int i = 1; i < arrayDosen17.length; i++) {
            if (arrayDosen17[i].usia > tertua.usia) {
                tertua = arrayDosen17[i];
            }
        }
        System.out.println("\n=== Informasi Dosen Paling Tua ===");
        tertua.tampilData();
    }

    public void infoDosenPalingMuda(Dosen17[] arrayDosen17){
        if (arrayDosen17.length == 0) return;
          
        Dosen17 termuda = arrayDosen17[0];
        for (int i = 1; i < arrayDosen17.length; i++) {
            if (arrayDosen17[i].usia < termuda.usia) {
                termuda = arrayDosen17[i];
            }
        }
        System.out.println("\n=== Informasi Dosen Paling Muda ===");
        termuda.tampilData();
    }
}