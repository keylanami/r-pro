import java.util.Scanner;

public class B3_searchExp {
    
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        
        // String[] data = {"Volvo", "BMW", "Ford", "Mazda"};

        // if (linearSearch(data, "BMW") == -1) {
        //     System.out.println("Gak ketemiu");
        // } else {
        //     System.out.println("ada di index: " + linearSearch(data, "BMW"));

        // }




        int[] angka = {1, 4, 7, 9, 10, 16, 19, 25, 38};
    
        int result = binarySearch(angka, hi.nextInt());

        if (result == -1) {
            System.out.println("waduh gak nemu");
        } else {
            System.out.println("angka itu ada di loker ke: " + (result));
        }

    }

    public static int binarySearch(int[] data, int target){
        int left = 0, right = data.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

        if(data[mid] == target){
            return mid;
        }

        if(data[mid] < target){
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1;
    }

    
       
    public static int linearSearch(String[] array, String target){
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(target)){
             return i;
        }
    }
    return -1;
    }
}




