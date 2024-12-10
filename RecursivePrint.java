import java.util.Scanner;

public class RecursivePrint {

    static StringBuilder coreName (int number) {

        StringBuilder export = new StringBuilder("");
        switch (number) {
            case 0 : export.append( "zero" ); break;
            case 1 : export.append( "one "); break; 
            case 2 : export.append( "two "); break;
            case 3 : export.append( "three "); break;
            case 4 : export.append( "four "); break;
            case 5 : export.append( "five "); break;
            case 6 : export.append( "six "); break;
            case 7 : export.append( "seven "); break;
            case 8 : export.append( "eight "); break;
            case 9 : export.append( "nine "); break;
            case 10 : export.append( "ten "); break;
            case 11 : export.append( "eleven "); break;
            case 12 : export.append( "twelve "); break;
            case 13 : export.append( "thirteen "); break;
            case 14 : export.append( "fourteen "); break;
            case 15 : export.append( "fifteen "); break;
            case 16 : export.append( "sixteen "); break;
            case 17 : export.append( "seventeen "); break;
            case 18 : export.append( "eighteen "); break;
            case 19 : export.append( "nineteen "); break;
            case 20 : export.append( "twenty "); break;
            case 30 : export.append( "thirty "); break;
            case 40 : export.append( "forty "); break;
            case 50 : export.append( "fifty "); break;
            case 60 : export.append( "sixty "); break;
            case 70 : export.append( "seventy "); break;
            case 80 : export.append( "eighty "); break;
            case 90 : export.append( "ninety "); break;
            default : ; break;
        }
        return export;
    }

    //Remaining: Handle cases when the value is larger than 999 or negative
    static StringBuilder threeDigits (int number) {

        StringBuilder export = new StringBuilder ("");
        int units, tens, cents = 0;
    
        if (number <= 19) {
            export = coreName (number);
        }
        else if (number <= 99) {
            tens = number / 10;
            units = number % 10;
            
            if (tens > 0) export.append ( coreName(tens * 10) );
            if (units > 0) export.append ( coreName(units) );
        }
        else if (number <= 999) {
            cents =  number / 100;
            // tens = number % 100 - number % 10;
            // units = number % 10;
            
            export.append ( coreName(cents) + "hundred ");
            export.append ( coreName(number % 100 - number % 10) );
            export.append ( coreName(number % 10) );
        }
        return export;
    }


    public static void main (String [] args){
        System.out.println ("Hello Fucking World " + (999999999 % 1000000 - 999999999 % 1000));

        Scanner keyboard = new Scanner (System.in);
        System.out.println("Please enter an integer");

        while (keyboard.hasNext()) {
            int n = keyboard.nextInt();
            String exportString = new String("");
            StringBuilder export = new StringBuilder("");

            if (n <= 19) {
                exportString = coreName(n).toString();
            }
            else if ( n<= 999) {
                exportString = threeDigits(n).toString();
            }
            else if (n <= 999999) {
                if ( ( n / 1000) > 0 ) export.append ( threeDigits( ( n / 1000) ) + "thousand " );
                if ( ( n % 1000) > 0 ) export.append ( threeDigits( ( n % 1000) ) );
                exportString = export.toString();
            }
            else if  (n <= 999999999) {
                if ( ( n / 1000000) > 0 ) export.append ( threeDigits( ( n / 1000000) ) + "million " );
                if ( ( n % 1000000) - ( n % 1000) > 0 ) export.append ( threeDigits( (( n % 1000000) - ( n % 1000) )/ 1000 )  + "thousand " );
                if ( ( n % 1000) > 0 ) export.append ( threeDigits( ( n % 1000) ));
                exportString = export.toString();
            }
            else if  (n <= Integer.MAX_VALUE) {
                if ( ( n / 1000000000) > 0 ) export.append ( threeDigits( ( n / 1000000000) ) + "billion " );
                if ( ( n % 1000000000) - ( n % 1000000) > 0 ) export.append ( threeDigits( (( n % 1000000000) - ( n % 1000000)) / 1000000 ) + "million " );
                if ( ( n % 1000000) - ( n % 1000) > 0 ) export.append ( threeDigits( (( n % 1000000) - ( n % 1000)) / 1000 ) + "thousand " );
                if ( ( n % 1000) > 0 ) export.append ( threeDigits( ( n % 1000) ));
                exportString = export.toString();
            }
            else {
                exportString = "The entered value is too large";
            }

            System.out.println ("The literal expression of the entered number is " + exportString);        
            System.out.println ("Please enter another number");
        }
    }
}
