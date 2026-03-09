package question3;

import java.util.Scanner;

public class DS_Soal_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah elemen:");
        int n = scanner.nextInt();
        
        System.out.println("Masukkan elemen target (pisahkan dengan spasi):");
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            target[i] = scanner.nextInt();
        }
        String[] kumpulanInstruksi = new String[n];
        int totalDistorsi = 0; 

        for (int i = n - 1; i >= 0; i--) {
            int nilaiYangDibuat = target[i] + totalDistorsi;

            String instruksi = buatInstruksi(nilaiYangDibuat);
            kumpulanInstruksi[i] = instruksi;
            int jumlahPlus = 0;

            for (int j = 0; j < instruksi.length(); j++) {
                if (instruksi.charAt(j) == '+') {
                    jumlahPlus++;
                }
            }
            totalDistorsi += jumlahPlus;
        }
        System.out.println("Output Instruksi:");
        StringBuilder outputAkhir = new StringBuilder();
        for (int i = 0; i < n; i++) {
            outputAkhir.append(kumpulanInstruksi[i]);
        }
        
        System.out.println(outputAkhir.toString());
        
        scanner.close();
    }
    public static String buatInstruksi(int nilai) {
        if (nilai == 1) return "1"; 

        String biner = Integer.toBinaryString(nilai);
        StringBuilder sb = new StringBuilder();
        
        sb.append("1");

        for (int i = 1; i < biner.length(); i++) {
            if (biner.charAt(i) == '0') {
                sb.append("d+");
            } else {
                sb.append("d+1+");
            }
        }
        return sb.toString();
    }
}
