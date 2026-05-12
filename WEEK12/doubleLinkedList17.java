package WEEK12;

public class doubleLinkedList17 {
    node17 head;
    node17 tail;
    int size = 0; 

    public doubleLinkedList17() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(mahasiswa17 data) {
        node17 newNode = new node17(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(mahasiswa17 data) {
        node17 newNode = new node17(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, mahasiswa17 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar jangkauan.");
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            node17 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            node17 newNode = new node17(data);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void insertAfter(String keyNim, mahasiswa17 data) {
        node17 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        node17 newNode = new node17(data);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong."); 
            return;
        }
        System.out.println("Data yang berhasil dihapus:"); 
        head.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong."); 
            return;
        }
        System.out.println("Data yang berhasil dihapus:"); 
        tail.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void remove(int index) {
        if (isEmpty() || index >= size) {
            System.out.println("Indeks salah atau list kosong.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            node17 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            System.out.println("Data pada indeks " + index + " berhasil dihapus.");
        }
    }

    public void removeAfter(String keyNim) {
        node17 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            node17 toDelete = current.next;
            if (toDelete == tail) {
                removeLast();
            } else {
                current.next = toDelete.next;
                toDelete.next.prev = current;
                size--;
                System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus.");
            }
        } else {
            System.out.println("Data tidak ditemukan atau tidak ada data setelahnya.");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong."); 
            return;
        }
        node17 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        node17 current = tail;
        System.out.println("--- Cetak Terbalik (Tail ke Head) ---");
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void getFirst() {
        if (isEmpty()) System.out.println("List Kosong");
        else head.data.tampil();
    }

    public void getLast() {
        if (isEmpty()) System.out.println("List Kosong");
        else tail.data.tampil();
    }

    public void getIndex(int index) {
        if (isEmpty() || index >= size) {
            System.out.println("Indeks salah!");
        } else {
            node17 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.data.tampil();
        }
    }
}