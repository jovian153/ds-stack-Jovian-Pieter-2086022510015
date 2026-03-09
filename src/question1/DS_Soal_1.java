package question1;

import java.util.Scanner;
import java.util.Stack;

public class DS_Soal_1 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Stack<Character> kurung = new Stack<Character>();

        System.out.println("Masukkan kurung : ");
        String input = scanner.nextLine();

        for(int i = 0;i<input.length();i++){
            char sekarang = input.charAt(i);
            if (sekarang == '(' || sekarang == '{' || sekarang == '['){
                kurung.push(sekarang);
            }
            if (sekarang == ')' || sekarang == '}' || sekarang == ']') {
                if (kurung.isEmpty()) {
                    System.out.println("Tidak Seimbang");
                    return;
                }
                char atas = kurung.pop();
                
                if ((sekarang == ')' && atas != '(') || (sekarang == '}' && atas != '{') ||(sekarang == ']' && atas != '[')) {
                    System.out.println("Tidak Seimbang");
                    return;
                }
            }
        }
        if (kurung.isEmpty()) {
            System.out.println("Seimbang");
        } else {
            System.out.println("Tidak Seimbang");
        }
        
        scanner.close();
    }
}
