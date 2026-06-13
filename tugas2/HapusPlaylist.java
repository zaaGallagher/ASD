package tugas2;

class NodeLagu {
    String judul;
    NodeLagu next;

    NodeLagu(String judul) {
        this.judul = judul;
        this.next = null;
    }
}

public class HapusPlaylist {
    public static void main(String[] args) {
        // Membuat playlist: LaguA -> LaguB -> LaguC
        NodeLagu head = new NodeLagu("LaguA");
        head.next = new NodeLagu("LaguB");
        head.next.next = new NodeLagu("LaguC");

        // Telusuri hingga node sebelum terakhir (LaguB)
        NodeLagu current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        // Putus sambungan ke node terakhir (LaguC dihapus)
        current.next = null;

        // Cetak sisa isi playlist
        NodeLagu pointer = head;
        System.out.print("Isi playlist yang tersisa: ");
        while (pointer != null) {
            System.out.print(pointer.judul + (pointer.next != null ? " -> " : ""));
            pointer = pointer.next;
        }
        System.out.println();
    }
}
