import java.util.Scanner;

public class B01 {
    public static void main(String[] args) {
        Scanner adudu = new Scanner(System.in);
      //  soal 1
        System.out.println("Masukkan jumlah apel!");
        int apel = adudu.nextInt();
        int apple = 3;

        int harga = 5000;
        int total = apple * harga;
        System.out.println(total);

        System.out.println(10 * 5000);


   // soal 2
        int usia = adudu.nextInt();

        if (usia >= 13) {
            System.out.println("Boleh masuk");
        } else {
            System.out.println("Tidak boleh masuk");
        }


   // soal 3
    String nama = adudu.nextLine();
    System.out.println("Halo, " + nama);


   // Soal 4
    int nilai = adudu.nextInt();
    if (nilai > 75) {
        System.out.println("Lulus");
    } else {
        System.out.println("Tidak Lulus");
    }

  //  soal 5
    int kapasitas = 30;
    int peserta = 17;
    int sisaKuota = kapasitas - peserta;
    System.out.println(kapasitas + " - " + peserta + " = " + sisaKuota);



   // soal 6
    boolean penggunaBaru = true;
    boolean tanggalKembar = true;

    if (penggunaBaru && tanggalKembar) {
        System.out.println("Diskon 90%");
    } else {
        System.out.println("Tidak diskon");
    }


    // soal 7
    System.out.println("Masukkan Harga Boba");
    int hargaBoba = adudu.nextInt();

    System.out.println("Masukkan Uang Kamu!");
    int uangUser = adudu.nextInt();

    if (hargaBoba <= uangUser) {
        System.out.println("Beli Boba");
    } else {
        System.out.println("Cuci Piring");
    }


    // soal 8
    boolean kerudungKakeyItem = true;

    if (kerudungKakeyItem) {
        System.out.println("Tidak pake itam");
    } else {
        System.out.println("Pake itam");
    }

    // soal 9
    int x  = 10;
    int y = x * 5;
    int z = x + 2;
    System.out.println(y + z);


    }
}
