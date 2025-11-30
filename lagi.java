import java.util.Scanner;

public class lagi {
    public static void main(String[] args) {
        Scanner gopal = new Scanner(System.in);

        // int usia = gopal.nextInt();
        // if (usia < 13) {
        //     System.out.println("Tidak Boleh Masuk");
        // } else {
        //     System.out.println("Boleh masuk");
        // }



        // System.out.println("Halo, Mikasa");

        // String nama = "Mikasa";
        // System.out.println("Halo, " + nama);

        // String namaa = gopal.nextLine();
        // System.out.println("Halo, " + namaa);     
        
        // int hargaBOba = gopal.nextInt();
        // int uang = gopal.nextInt();

        // if (hargaBOba > uang) {
        //     System.out.println("Tidak Bisa Beli Boba");
        // } else {
        //     System.out.println("Bisa beli boba");
        // }


        // boolean status = gopal.nextBoolean();
        // int sisaMasa = gopal.nextInt();

        // if (status == true && sisaMasa >= 1) {
        //     System.out.println("Bisa masuk gym");
        // } else {
        //     System.out.println("TIdak boleh masuk");
        // }

        // if (status == true) {
        //     if (sisaMasa >= 1) {
        //         System.out.println("Bisa masuk");
        //     } else {
        //         System.out.println("Tidak boleh");
        //     }
        // }


        int suhu = gopal.nextInt();

        if (suhu <= 20) {
            System.out.println("tirizzz");
        } else if (suhu > 20 && suhu <= 30) {
            System.out.println("B ajah");
        } else if (suhu > 30) {
            System.out.println("Hareudang");
        }



    }
}
