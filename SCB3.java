import java.util.Scanner;

public class SCB3 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        String kalimat = hi.nextLine();


        String[] kata = kalimat.split(" ");

        
        for (int i = 0; i < kata.length; i++) {
            if ((i + 1) % 2 == 1) {
                kata[i] = balikKata(kata[i]);
            }
        }


        for (int i = 0; i < kata.length; i++) {
            System.out.print(kata[i] + " ");
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
