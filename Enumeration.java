import java.util.*;

enum Months { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC } ;

class Enumeration {
    public static int daysInMonth (Months m, int year) {
        switch (m) {
            // YOU NEED TO WRITE THIS PART
            //for any month that is not FEB, the result is straightforward, and we just retrun the number of days
            case JAN : return 31;
            //For the month of february, we need to check if the year is a leap year or not 
            //by assessing the rest of the division by 4, 100 and 400 in an if statement.
            case FEB : if ( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ) { return 29; } else { return 28;}
            case MAR : return 31;
            case APR : return 30;
            case MAY : return 31;
            case JUN : return 30;
            case JUL : return 31;
            case AUG : return 31;
            case SEP : return 30;
            case OCT : return 31;
            case NOV : return 30;
            default : return 31; //Because we need a default statement, we will use the DEC month value as the default statement
        }
    }

    public static void main (String [] args) {
        for (Months m : Months.values() ) {
            System.out.println (m + " 2023 has " + daysInMonth(m, 2023) + " days!");
        }
    }
}