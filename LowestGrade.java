import java.util.Arrays;

public class LowestGrade {     

    public static int [] removeLowest (int... input) {

        //If the input has zero or one element, there is no work to be done and the output is that same array
        if (input.length <= 1) {
            int [] export = new int [input.length];
            export = Arrays.copyOf(input, input.length);
            return export;
        }

        //If the input has two or more elements
        else {

            //We will remove at least one grade, even if all the values are the same. The exported array will have one less element
            int [] export = new int [input.length - 1];

            //Locating the index of the lowest grade
            int min = 0;
            for (int i = 0; i < input.length; i++){
                if (input[i] < input[min]) min = i;
            }

            //Copying values from the input array into the export array, except the value located at the index of the smallest element
            int i = 0;
            for (int j = 0; j < input.length; j++) {
                if ( j != min) {
                    export[i] = input [j];
                    i++;
                }
            }

            return export;
        }
    }

    public static String arrayPrint (int [] a) {
        //If the input array is empty, the exported string is the empty square brackets
        if(a.length == 0) {
            String exportedString = "[]";
            return exportedString;
        }

        //If there is at least one value to be printed, then we will use a StringBuilder to construct the result, then convert it into a String before returning
        else {
            //Opening the square bracket of the returned string
            StringBuilder export = new StringBuilder ("[");

            //Appending the values of the returned string, except the last one
            for (int i = 0; i < a.length-1; i++ ) {
                export.append(Integer.toString ( a [i] ) + ", ");
            }

            //Appending the last value of the String and closing the bracket
            export.append(Integer.toString ( a [a.length-1] ) + "]");

            //Converting the final StringBuilder into a String and returning
            String exportedString = export.toString();
            return exportedString;
        }
    }

    public static void main (String [] args) {

        System.out.println ("DEMONSTRATION OF THE REMOVELOWEST METHOD");
        System.out.println ("\nHere are samples of sets of grades before the use of the removeLowest method\n");

        /*We want to show the sets of grades before and after the removal of the lowest grade using the arrayPrint method.
         * Since it only accepts an int array as input, we will construct int arrays that match the provided sample cases.
         */

        int [] a0 = {23, 90, 47, 55, 88};
        int [] b0 = {85};
        int [] c0 = {};
        int [] d0 = {59, 92, 93, 47, 88, 47};

        //Diplaying the initial grades
        System.out.println ("a = " + arrayPrint(a0));
        System.out.println ("b = " + arrayPrint(b0));
        System.out.println ("c = " + arrayPrint(c0));
        System.out.println ("d = " + arrayPrint(d0));
        
        //Displaying the grades after the method removeLowest has been applied
        System.out.println ("\nHere are the sets of grades after the removeLowest method has been applied\n");

        int [] a = removeLowest (23, 90, 47, 55, 88);
        int [] b = removeLowest ( 85 );
        int [] c = removeLowest ();
        int [] d = removeLowest (59, 92, 93, 47, 88, 47);

        System.out.println ("a = " + arrayPrint(a));
        System.out.println ("b = " + arrayPrint(b));
        System.out.println ("c = " + arrayPrint(c));
        System.out.println ("d = " + arrayPrint(d));

        //More examples
        System.out.println ("\nMore examples:\n");
        System.out.println ("\nHere are samples of sets of grades before the use of the removeLowest method\n");

        //Before the use of the method
        int [] e0 = {0, 0, 0, 1, 0};
        int [] f0 = {1000};
        int [] g0 = {2, 5, 7, 11};
        int [] h0 = {};

        System.out.println ("e = " + arrayPrint(e0));
        System.out.println ("f = " + arrayPrint(f0));
        System.out.println ("g = " + arrayPrint(g0));
        System.out.println ("h = " + arrayPrint(h0));

        //After the use of the method
        System.out.println ("\nHere are the sets of grades after the removeLowest method has been applied\n");
        int [] e = removeLowest (e0);
        int [] f = removeLowest (f0);
        int [] g = removeLowest (g0);
        int [] h = removeLowest (h0);

        System.out.println ("e = " + arrayPrint(e));
        System.out.println ("f = " + arrayPrint(f));
        System.out.println ("g = " + arrayPrint(g));
        System.out.println ("h = " + arrayPrint(h));
        
    }

}
 