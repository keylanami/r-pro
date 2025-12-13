import java.util.Scanner;

public class B3_SortingExp {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        int[] numbers = {4, 9, 1, 5, 10, 11, 32, 15, 3};
        int[] numberss = {4, 9, 1, 5, 10, 11, 32, 3};
        

        BubbleSort(numbers);
        BubbleSort(numberss);
        
        System.out.println("DIURUTIN PAKE BUBBLE SORT");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        
        
        System.out.println(); // buffer refresher


        InsertionSort(numbers);
        System.out.println("DIURUTIN PAKE INSERTION SORT");
        for (int i : numbers) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        String inp = hi.nextLine();
        String[] daftarNama = inp.split(" ");
       
        // String[] daftarNama = {"acikiwir", "dodol", "bebek", "cendol", "furina", "escoffier"};
        
        BubbleSortString(daftarNama);
        for (String eachNama : daftarNama) {
            System.out.println(eachNama);
        }
        
    }

    public static void BubbleSort(int[] data){
        int n = data.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }


    public static void InsertionSort(int[] data){

        int n = data.length;

        for(int i = 1; i < n; i++){
            int key = data[i];
            int j = i - 1;

            while(j >= 0 && data[j] > key){
                data[j+1] = data[j];
                j--;
            }

            data[j+1] = key;
        }
    }


    public static void BubbleSortString(String[] data){
    
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].compareTo(data[j + 1]) < 0) { // operator > atau < akan berpengaruh
                    String temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}
