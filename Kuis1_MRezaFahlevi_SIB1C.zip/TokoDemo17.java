

public class TokoDemo17{
    public TokoDemo17(String string, String string2, String string3, String string4, String string5, String string6,
            String string7) {
            }

    public static void main(String[] args) {

        TokoDemo17[] daftarToko = new TokoDemo17[3];

        daftarToko[0] = new TokoDemo17(
                "Kalung Mutiara",
                "Gelang Emas",
                "Anting Silver",
                "Aksesoris Wanita",
                "150000",
                "20",
                "50"
        );

        daftarToko[1] = new TokoDemo17(
                "Kalung Rantai",
                "Gelang Kulit",
                "Anting Diamond",
                "Aksesoris Pria",
                "200000",
                "15",
                "30"
        );

        daftarToko[2] = new TokoDemo17(
                "Kalung Handmade",
                "Gelang Manik",
                "Anting Korea",
                "Aksesoris Remaja",
                "100000",
                "10",
                "40"
        );

        for (int i = 0; i < daftarToko.length; i++) {
            System.out.println("Data ke-" + (i + 1));
            daftarToko[i].tampilData();
            System.out.println();
        }
    }

    private void tampilData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tampilData'");
    }

    
}
