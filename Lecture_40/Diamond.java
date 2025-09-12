package Lecture_40;
public class Diamond {
    public static void main(String[] args) {
        int rows = 5;
        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=(rows-i) ; j++){
                System.out.print(" ");
            }
            for(int k=1 ; k<=2*i-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
       for(int i=rows-1 ; i>=1 ; i--){
        for(int space = 1 ; space<=rows-i ; space++){
            System.out.print(" ");
        }
        for(int j=1 ; j<=2*i-1 ; j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
