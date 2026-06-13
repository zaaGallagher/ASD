package tugas2;

class NodeGenre {
    String genre;
    NodeGenre next;
    NodeGenre prev;

    NodeGenre(String genre) {
        this.genre = genre;
    }
}

public class RiwayatMusik {
    public static void main(String[] args) {
        // Membuat node
        NodeGenre rock = new NodeGenre("Rock");
        NodeGenre jazz = new NodeGenre("Jazz");
        NodeGenre pop = new NodeGenre("Pop");

        // Menghubungkan secara Double Linked List: Rock <-> Jazz <-> Pop
        rock.next = jazz;
        jazz.prev = rock;
        jazz.next = pop;
        pop.prev = jazz;

        // Mulai dari node terakhir (tail)
        NodeGenre current = pop;

        System.out.print("Riwayat lagu dari terakhir ke pertama: ");
        while (current != null) {
            System.out.print(current.genre + (current.prev != null ? " <-> " : ""));
            current = current.prev; // Mundur menggunakan pointer prev
        }
        System.out.println();
    }
}
