package tugas2;

class Gerbong {
    String kode;
    Gerbong next;

    Gerbong(String kode) {
        this.kode = kode;
        this.next = null;
    }
}

public class MainGerbong {
    public static void main(String[] args) {
        // Membuat rangkaian gerbong: A -> B -> C
        Gerbong head = new Gerbong("A");
        head.next = new Gerbong("B");
        head.next.next = new Gerbong("C");

        // Menghitung total gerbong
        int totalGerbong = 0;
        Gerbong current = head;
        
        while (current != null) {
            totalGerbong++;
            current = current.next; // Pindah ke gerbong berikutnya
        }

        System.out.println("Total jumlah gerbong dalam rangkaian: " + totalGerbong);
    }
}
