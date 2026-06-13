package CM3;

public class NodePesanan17 {
    public Pesanan17 data; 
    public NodePesanan17 prev;
    public NodePesanan17 next;

    public NodePesanan17(Pesanan17 pesanan) {
        this.data = pesanan;
        this.prev = null;
        this.next = null;
    }
}
