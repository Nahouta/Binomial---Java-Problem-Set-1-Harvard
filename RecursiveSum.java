import java.util.Scanner;

public class RecursiveSum {

    public static double sumTo(int n) {
        if ( n < 0) { //If the input is a negative integer, the program will throw an illegalArumentException
            throw new IllegalArgumentException ("The input value should be an integer greater than or equal to zero");
        }
        else if ( n == 0 ) { //Base case.
            return 0;
        }
        else { //For any other case (n >= 1), we compute the value and cast it into a double to avoid the answer to be rounded  
            return (double) 1/n + sumTo( n - 1 );
        }
    }

    
    public static void main (String [] args) {

        Scanner keyboard = new Scanner (System.in);

        //Demonstration of some test cases
        System.out.println("This method takes an integer parameter n and returns the sum of the first n reciprocals.\nEXAMPLES:");
        System.out.println ( "\n\tThe sum of the first 2 reciprocals is: " + Double.toString( sumTo(2) ));
        System.out.println ( "\n\tThe sum of the first 5 reciprocals is: " + Double.toString( sumTo(5) ));
        System.out.println ( "\n\tIf the input value is 0, the result will be: " + Double.toString( sumTo(0) ));
        System.out.println ( "\n\tIf the input value is negative, the program will throw an IllegalArgumentException and exit");

        //Letting the user try some cases.
        System.out.println("Please enter a positive integer");

        int n = keyboard.nextInt();
        System.out.println ( "The sum of the first " + n + " reciprocals is: " + Double.toString( sumTo(n) ));

    }
}
