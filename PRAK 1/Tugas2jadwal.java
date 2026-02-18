import java.util.Scanner;

public class Tugas2jadwal {

    static Scanner sc = new Scanner(System.in);

    static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang       : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari        : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam         : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n=== SEMUA JADWAL ===");
        System.out.printf("%-20s %-15s %-10s %-12s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-15s %-10s %-12s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    static void cariHari(String[][] jadwal, int n) {
        System.out.print("\nCari jadwal hari : ");
        String hari = sc.nextLine();

        boolean ketemu = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " + jadwal[i][1] + " | " + jadwal[i][3]);
                ketemu = true;
            }
        }

        if (!ketemu)
            System.out.println("Tidak ada jadwal di hari tersebut.");
    }

    static void cariMatkul(String[][] jadwal, int n) {
        System.out.print("\nCari mata kuliah : ");
        String matkul = sc.nextLine();

        boolean ketemu = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.println(jadwal[i][2] + " | " + jadwal[i][1] + " | " + jadwal[i][3]);
                ketemu = true;
            }
        }

        if (!ketemu)
            System.out.println("Mata kuliah tidak ditemukan.");
    }

    public static void main(String[] args) {

        System.out.print("Jumlah jadwal : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);

        int pilih;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tampilkan semua");
            System.out.println("2. Cari berdasarkan hari");
            System.out.println("3. Cari berdasarkan mata kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1 -> tampilSemua(jadwal, n);
                case 2 -> cariHari(jadwal, n);
                case 3 -> cariMatkul(jadwal, n);
            }

        } while (pilih != 0);

        sc.close();
    }
}
