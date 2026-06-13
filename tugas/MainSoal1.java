package tugas;

public class MainSoal1 {
    public static void main(String[] args) {
        Queue17 antrian = new Queue17(5); 

        antrian.enqueue(15);
        antrian.enqueue(30);

        System.out.println("Isi antrian saat ini:");
        antrian.print();
    }
}
