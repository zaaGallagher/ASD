package LastJS;

public class BinaryTreeMain17 {

    public static void main(String[] args) {
        BinaryTree17 bst = new BinaryTree17();

        bst.add(new Mahasiswa17("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa17("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa17("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa17("244160220", "Dewi", "B", 3.54));

        System.out.println("\n Daftar semua mahasiswa (in order treversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\n Pencarian data mahasiswa :");
        System.out.println("Cari mahasiswa dengan IPK: 3.54 :");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        System.out.println("\n Cari mahasiswa dengan IPK: 3.22 :");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa17("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa17("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa17("244160170", "Fizi", "B", 3.46));
        System.out.println("\n Daftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("In Order Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\n Pre Order Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\n Post Order Traversal:");
        bst.traverseInOrder(bst.root);

        System.out.println("\n Penghapusan data mahasiswa :");
        bst.delete(3.57);
        System.out.println("Daftar mahasiswa setelah menghapus IPK 3.54:");
        bst.traverseInOrder(bst.root);

    }
    
}
