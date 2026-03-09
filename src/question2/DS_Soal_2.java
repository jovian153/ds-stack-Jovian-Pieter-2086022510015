package question2;

import java.util.Scanner;
import java.util.Stack;

public class DS_Soal_2 {
    public static int evaluate_rpn(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int nilaiKanan = stack.pop(); 
                int nilaiKiri = stack.pop();  
                
                int hasil = 0;

                if (token.equals("+")) {
                    hasil = nilaiKiri + nilaiKanan;
                } else if (token.equals("-")) {
                    hasil = nilaiKiri - nilaiKanan;
                } else if (token.equals("*")) {
                    hasil = nilaiKiri * nilaiKanan;
                } else if (token.equals("/")) {
                    hasil = nilaiKiri / nilaiKanan;
                }
                stack.push(hasil);
                
            } else {
                int angka = Integer.parseInt(token);
                stack.push(angka);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan ekspresi RPN (pisahkan dengan spasi): ");
        System.out.println("Contoh input: 2 1 + 3 *");
        System.out.print("Input: ");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        int hasilAkhir = evaluate_rpn(tokens);
        System.out.println("Hasil Evaluasi: " + hasilAkhir);
        
        scanner.close();
    }
}
