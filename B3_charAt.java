public class B3_charAt {
    public static void main(String[] args) {
        String nama = "probe";

        System.out.println(nama.charAt(0));
        System.out.println(nama.charAt(2));
        System.out.println(nama.charAt(4));



        String dessert = "blueberrycheesecake";
        for (int i = 0; i < dessert.length(); i+=2) {
            System.out.println(dessert.charAt(i));
        }
    }
}
