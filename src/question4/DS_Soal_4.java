package question4;

import java.util.Scanner;
import java.util.Stack;

public class DS_Soal_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CHEAT BUSTER SECURITY SYSTEM ===");
        System.out.println("Masukkan kode (pisahkan dengan spasi):");
        String inputLine = scanner.nextLine();
        
        String[] tokens = inputLine.split(" ");

        int[] arrayAngka = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arrayAngka[i] = Integer.parseInt(tokens[i]);
        }

        for (int i = 0; i < arrayAngka.length - 1; i++) {
            for (int j = 0; j < arrayAngka.length - 1 - i; j++) {

                if (arrayAngka[j] > arrayAngka[j + 1]) {
                    int sementara = arrayAngka[j];
                    arrayAngka[j] = arrayAngka[j + 1];
                    arrayAngka[j + 1] = sementara;
                }
                
            }
        }
        Stack<Integer> stackRahasia = new Stack<>();

        for (int i = 0; i < arrayAngka.length; i++) {
            stackRahasia.push(arrayAngka[i]);
        }

        System.out.println("Kode Rahasia Ditemukan (Output):");

        for (int angka : stackRahasia) {
            System.out.print(angka + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
