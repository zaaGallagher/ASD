public class RoyalGarden {

    public static int hitungPendapatan(int[] stok, int[] harga) {
        int total = 0;
        for (int i = 0; i < stok.length; i++) {
            total += stok[i] * harga[i];
        }
        return total;
    }

    public static void main(String[] args) {

        String[] cabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
        };

        String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] harga = {75000, 50000, 60000, 10000};

        System.out.println("=== Pendapatan RoyalGarden ===");
        System.out.println("==============================================");

        for (int i = 0; i < cabang.length; i++) {

            int pendapatan = hitungPendapatan(stok[i], harga);

            String status;
            if (pendapatan > 150000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }

            System.out.printf("%-15s : Rp %,d  -> %s\n",
                    cabang[i], pendapatan, status);
        }
    }
}
