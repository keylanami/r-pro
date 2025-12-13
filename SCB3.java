import java.util.Scanner;

public class SCB3 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        String kalimat = hi.nextLine();
        String tambahan = hi.nextLine();

        String[] kata = kalimat.split(" ");

// BUAT NGECEK         
        for (int i = 0; i < kata.length; i++) {
            if ((i + 1) % 2 == 0) {
                kata[i] = balikKata(kata[i]);
            }
        }

// BUAT NGEPRINT   
        for (int i = 0; i < kata.length; i++) {
            System.out.print(kata[i] + tambahan + " ");
        }
    }



    public static String balikKata(String kata) {
        String hasil = "";

        for (int i = kata.length() - 1; i >= 0; i--) {
            hasil += kata.charAt(i);
        }

        return hasil;
    }
}
