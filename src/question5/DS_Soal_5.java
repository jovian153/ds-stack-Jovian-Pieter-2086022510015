package question5;

import java.util.Scanner;
import java.util.Stack;

public class DS_Soal_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROGRAM PEMBAGIAN STACK ===");
        System.out.print("Masukkan angka awal: ");

        int angka = scanner.nextInt(); 

        Stack<Integer> stack = new Stack<>();

        stack.push(angka);

        while (angka > 1) {
            angka = angka / 2;
            stack.push(angka);
        }
        
        System.out.println("\nOutput (dari akhir ke awal):");

        StringBuilder hasil = new StringBuilder();
        while (!stack.isEmpty()) {
            hasil.append(stack.pop()).append(" ");
        }
        System.out.println(hasil.toString().trim());
        
        scanner.close();
    }
}
