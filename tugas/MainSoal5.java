package tugas;

import java.util.Scanner;
import java.util.Stack;

public class MainSoal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue17 qPerpus = new Queue17(3);
        Stack<Integer> sArsip = new Stack<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan ID Buku ke-" + (i+1) + ": ");
            int id = sc.nextInt(); // Masukkan berturut-turut angka 1, 2, dan 3
            qPerpus.enqueue(id);
        }

        while (!qPerpus.isEmpty()) {
            int dataDipindah = qPerpus.dequeue();
            sArsip.push(dataDipindah);
        }

        System.out.println("ID buku pada posisi teratas (top) di Stack: " + sArsip.peek());
    }
}
