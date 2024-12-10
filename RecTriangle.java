public class RecTriangle {

    public static void printTriangle (int s) {
        if (s < 1) return;
        printTriangle (s-1);
        for (int i = 0; i < s; i++) {
            System.out.print( "[]");
        }

        System.out.println ();
    }

    public static void printTriangle2 (int s) {
        if (s > 1) {
            for (int i = 0; i < s; i++) {
                System.out.print( "[]");
            }
            System.out.println ();
            printTriangle2 (s-1);
        }
        else return;

    }

    public static void main (String [] args) {
        printTriangle(10);
        printTriangle2(10);
    }
    
}
