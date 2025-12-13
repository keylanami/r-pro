import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner unclemutu = new Scanner(System.in);
        
        int angka = unclemutu.nextInt();

        // System.out.println("Hasil faktorial dari " + angka + " adalah:");
        // System.out.println(faktorial(angka));

        // System.out.println("COUNTDOWN DARI " + angka);
        // hitungTurun(angka);

        System.out.println("HITUNG JUMLAH DARI DIGIT " + angka);
        int piring = hitungJumlah(angka);
        System.out.println(piring);
        
    }

    public static int faktorial(int a){
        // 5 * 4 * 3 * 2 * 1

        if (a == 1) { // base case (BERHENTI)
            return 1;
        }
        
        return a * faktorial(a - 1); // step case (LANJUT)
    }

    public static void hitungTurun(int a){
        if (a == 0) { // base case (BERHENTI)
            System.out.println("BOOMM SURPRISEEEE");
            return;
        }

        System.out.println(a);
        hitungTurun(a - 1); // step case (LANJUT)
    }
    

    public static int hitungJumlah(int b){
        if (b == 0) {
            return 0;
        }

        System.out.println(b + " " + (b % 10) + " " + (b/10));
        return (b % 10) + hitungJumlah(b / 10);
    }
}
