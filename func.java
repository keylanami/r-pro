import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        halo();

        Scanner inp = new Scanner(System.in);
        // int angkaA = inp.nextInt();
        // int angkaB = inp.nextInt();

        // System.out.println(tambahin(angkaB, angkaA));
        System.out.println();

        System.out.println(cekoddevenn(1900187));
        cekoddeven(178423974);

    }

    public static void halo() {
        System.out.println("Halo!");
    }

    public static int tambahin(int a, int b){
        int jumlah = a + b;
        return jumlah;

        // return a + b;
    }

    public static void ngurangin(int a, int b, int c){
        System.out.println(a - b - c);

        int result = a - b - c;
        System.out.println(result);
    }

    public static void cekoddeven(int a){
        if (a % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
    }

    public static String cekoddevenn(int a){
        String result = "";

        if (a % 2 == 0) {
            result = "Angka ini Genap!!!!";
        } else {
            result = "Angka ini ganjil!!!!!";
        }

        return result;

    }


}
