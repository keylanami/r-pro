import java.util.Scanner;

public class spllitt {
    public static void main(String[] args) {
        Scanner ying = new Scanner(System.in);

        String inp = ying.nextLine();
        String[] cincang = inp.split("");
        for(String wadah : cincang){
            System.out.println(wadah);
        }


        // beda soal
        String input = ying.nextLine();
        String tambahanKata = ying.nextLine();

        String[] cincong = input.split("");

        for (String hasil : cincong) {
            System.out.print(hasil + tambahanKata + " ");
        }

        // lala nada dan maya
        // lrawr nrawr drawr mrawr yrawr


        String apaaja = ying.nextLine();
        String buah = ying.nextLine();

        String[] arr = buah.split(",");

        for(String buahahaha : arr){
            System.out.println(buahahaha + " " + apaaja);
        }



    }
}


// input kalimat boboboy hore
// input terbaik
