import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sic =new Scanner(System.in);
        pattern1(sic.nextInt());
        pattern2(sic.nextInt());
    }


    static void pattern2 (int n){
        for (int row = 1 ; row <= n ; row++){
            for (int col =1 ; col<=n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3 (int n){
        for (int row = 1 ; row <= n ; row++){           
            for (int col =1 ; col<=n-row+1; col++){                 // 1-5
                System.out.print("*");                            // 2-4
                                                                    // 3-3
            }
            System.out.println();
        }
    }






    static void pattern1 (int n){
        for (int row =1 ; row <= n ; row++){
            for (int col =1 ; col <= row ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}