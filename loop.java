import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner tokAbah = new Scanner(System.in);
        

        // ascending

        // 0, 1, 2....
        // 19, 20, 21...
        for(int angka = 2; angka < 5; angka++){
	        System.out.print(angka + " ");
        }

        System.out.println();


        //descending

        for(int angka = 10; angka >= 1; angka--){
            System.out.print(angka + " ");
        }


        int angka = 3;
        while (angka < 5) {
            System.out.println(angka);
             angka++;
        }


        System.out.println("Masukkan username:");
        String usn = tokAbah.nextLine();

        int pw;

        do {
            System.out.println("Masukkan password");
            pw = tokAbah.nextInt();
        } while (pw != 123);
        
        System.out.println("kamu berhasil login!");
        
        
        String asbun = "";
        
        do {
            System.out.println("Tulis asbun kamu!");
            asbun = tokAbah.nextLine();
        } while (!asbun.equals("stop"));

        System.out.println("udah yappingnya");






    

    }
    
}
