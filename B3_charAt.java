import java.util.Scanner;

public class B3_charAt {
    public static void main(String[] args) {
        String nama = "probe";

        System.out.println(nama.charAt(0));
        System.out.println(nama.charAt(2));
        System.out.println(nama.charAt(4));



        String dessert = "blueberrycheesecake";
        for (int i = 0; i <= dessert.length() - 1; i+=5) {
            System.out.println(dessert.charAt(i));
        }

        Scanner meng = new Scanner(System.in);

        String inp = meng.nextLine();
        System.out.println("huruf pertama");
        System.out.println(inp.charAt(0));
        
        System.out.println("huruf terakhir");
        int indexHurufTerakhir = inp.length() - 1;
        System.out.println(inp.charAt(indexHurufTerakhir));


    }
}
