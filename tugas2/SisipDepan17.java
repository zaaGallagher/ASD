package tugas2;

class NodeGerbong {
    String isi;
    NodeGerbong next;

    NodeGerbong(String isi) {
        this.isi = isi;
        this.next = null;
    }
}

public class SisipDepan17 {
    public static void main(String[] args) {
        // Rangkaian awal: B -> C
        NodeGerbong head = new NodeGerbong("B");
        head.next = new NodeGerbong("C");

        // Membuat gerbong baru "A"
        NodeGerbong gerbongBaru = new NodeGerbong("A");
        
        // Menyisipkan di paling depan
        gerbongBaru.next = head;
        head = gerbongBaru; // "A" sekarang jadi head baru

        // Cetak seluruh isi rangkaian
        NodeGerbong current = head;
        System.out.print("Isi rangkaian gerbong saat ini: ");
        while (current != null) {
            System.out.print(current.isi + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }
}
