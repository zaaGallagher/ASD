package tugas;

public class MainSoal2 {
    public static void main(String[] args) {
        Queue17 gudang = new Queue17(5);

        gudang.enqueue(100);
        gudang.enqueue(200);
        gudang.enqueue(300);

        System.out.println("Isi antrian gudang:");
        gudang.print();
    }
}