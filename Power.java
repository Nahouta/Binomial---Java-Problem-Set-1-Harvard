public class Power {
    
    public static double power (double x, int n) {

            if (n == 0) return 1.0;
            else if (n > 0) { 
                    if (n % 2 == 0) { //We check if n is even or odd
                        double temp = power (x, n/2); //If n is even, we call power(x, n/2) and save the result in a temporary variable temp
                        return temp * temp; //we multiply the variable by itself
                    }
                    else {
                        return x * power (x, n-1); 
                    }
            }
            else return 1.0 / power(x, -n);
            }



            //The modified power(x, n) method will be called a total of 12 times, to compute power (foobar, 1024)

        public static void main (String [] args) {
            System.out.println(power(2, 10));
    }
}
