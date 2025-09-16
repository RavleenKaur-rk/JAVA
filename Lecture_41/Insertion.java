import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 0}; 
        int n = 5; 
        int value = 25;
        int pos = 2;
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i-1]; 
        }
          arr[pos] = value;
          n++;
         System.out.println(Arrays.toString(arr));
    }
}
