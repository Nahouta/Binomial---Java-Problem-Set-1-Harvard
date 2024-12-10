//Binomial.java
/**
 * This class will print the first x rows of Pascal's Triangle, where x is read from the user's keyboard.
 * 
 * @author Tresor Habib Nahouta
 * @version Last Modified Feb 11, 2024
 */
import java.util.Scanner;

public class Binomial {


 /**
  *This method will accept two int arguments, n and k, and returns their binomial coefficient C(n, k)
  *The result will be computed recursively
  *Both n and k should be positive.
  *
  * @param n The integer value n in C(n, k)
  * @param k The integer value k in C(n, k)
  * @return The binomial coefficient C(n, k) of the integers
  */   
    public static int C(int n, int k) {
        int result = 0;
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("Integers must be positive ");
        }
        else if ( k == 0) {
            result = 1;
        }
        else if  ( k > 0 && n >= k) {
            result = C(n - 1, k) + C(n - 1, k  - 1);
        }
        return result;
    }


    public static void main (String [] args) {

        Scanner keyboard = new Scanner (System.in);
        System.out.println ("This program will print the first x rows for the Pascal's Triangle where x is provided by the user\n");
        System.out.println ("For example, for x = 7, the Pascal's Triangle is:\n");
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(C(i,j) + "  ");
            }
            System.out.print("\n");
        }


        System.out.println ("\nPlease a positive integer, the number of rows of the Pascal's Triangle to be printed");
        while (keyboard.hasNext()) {
            int n = keyboard.nextInt();
            if (n < 0) {
                System.out.println("Please enter a positive integer");
            }
            else {
                System.out.println("");
                for (int i = 0; i <= n; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(C(i,j) + "  ");
                    }
                    System.out.print("\n");
                }
            }
            System.out.println ("\nPlease enter another integer if you wish to print another Pascal's Triangle");
        }
        
    }
    
}
