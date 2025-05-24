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

    static void pattern4 (int n){
        for (int row = 1 ; row <= n ; row++){           
            for (int col =1 ; col<=row; col++){                     
                System.out.print(col);                              
            }
            System.out.println();
        }
    }

    static void pattern5 (int n){
        for (int row =1 ; row <= 2*n-1 ; row++){        // 1-1 2-2 3-3 4-4 5-3 6-2 7-1
            int newcols = row > n ? 2*n-row : row ;     // row jab 4 per aayegi tab row > n(bg mei 4 condition false) row  
            for (int col =1 ; col<=newcols; col++){     // row jab 5 per aayegi tab row > n (max value 4 condition true ) 2n -1              
                System.out.print("*");                  // 2n-1 yani 8-5=3 tab 3 baar loop chalega col ka           
            }
            System.out.println();
        }
    }

    static void pattern28 (int n){
        for (int row =1 ; row < 2*n ; row++){
            
            int totalcols = row>n ? 2*n-row : row ;
            int numofspace = n - totalcols ;
            
            for (int space = 1 ; space <= numofspace ; space++){
                System.out.print(" ");
            }
            for (int col =1 ; col <= 2*totalcols-1 ; col++){
                System.out.print("*");
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