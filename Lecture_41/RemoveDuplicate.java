public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 20, 40, 20, 50};
        int value = 20;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                array[count] = array[i];
                count++;
            }
        }
        int[] newArray = new int[count];
        for (int i = 0; i < count; i++) {
            newArray[i] = array[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
