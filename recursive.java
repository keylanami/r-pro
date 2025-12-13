public class recursive {
    public static void main(String[] args) {
        int angka = 5;
        int hasil = factorial(angka);
        System.out.println(hasil);

        // countdown(angka);
        System.out.println(jumlahDigit(angka));
    }

    public static int factorial(int n){
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void countdown(int n){
        if (n == 0) {
            System.out.println("BOOM");
            return;
        }

        System.out.println(n);
        countdown(n-1);
    }


    public static int jumlahDigit(int n){
        if (n == 0) {
            return 0;
        }

        return n + jumlahDigit( n - 1);

    }


}
