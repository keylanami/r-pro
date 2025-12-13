public class split {
    public static void main(String[] args) {
        String kalimat = "aku suka belajar";
        String[] arr = kalimat.split(" ");

        for (String kata : arr) {
            System.out.println(kata);
        }

        String lirik = "Boboiboy Galaxy Uwow";
        String add = "RAWR";
        String[] pisah = lirik.split("o");

        for (String lir : pisah) {
            System.out.print(lir + add);
        }
    }
}
