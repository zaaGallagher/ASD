package tugas;

public class MainSoal4 {
    public static void main(String[] args) {
        Queue17 klinik = new Queue17(3);
        
        klinik.enqueue(101);
        klinik.enqueue(102);
        klinik.enqueue(103);
        
        klinik.dequeue();
        klinik.dequeue();
        klinik.dequeue();
        
        System.out.println("Nilai front di akhir: " + klinik.front);
        System.out.println("Nilai rear di akhir: " + klinik.rear);
    }
}
