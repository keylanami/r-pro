public class M01 {
    public static void main(String[] args) {

       char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("Baik");
                break;
            case 'C':
                System.out.println("Cukup");
                break;
            case 'D':
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Tidak valid");
        }


    }
}

