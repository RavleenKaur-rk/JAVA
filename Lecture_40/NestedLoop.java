package Lecture_40;
public class NestedLoop {
    public static void main(String[] args) {
        int rows = 7 , cols = 7;
        for(int i=rows ; i>=1 ; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for(int i=rows+1 ; i<=rows ; i++){
            for(int j=1;j<=cols;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

       for(int i=2 ; i<=rows ; i++){
        for(int j=1 ; j<=i ; j++){
            System.out.print(j + " ");
        }
        System.out.println();
       }
    }
}
