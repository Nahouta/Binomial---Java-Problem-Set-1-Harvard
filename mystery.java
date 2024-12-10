public class mystery {
    public static void mystery (int [] a, int [] b) {
        for (int i = 0; i < a.length; i++) {
            a [i] += b [b.length - 1 -i];
        }
    }

    public static void main (String [] args) {
        int [] a1 = {1, 3, 5, 7, 9};
        int [] a2 = {1, 4, 9, 16, 25};
        mystery (a1, a2);

        for (int j = 0; j < a1.length; j++) {
            System.out.print("a1[" + j + "] = " + a1[j] + "\n");
        }

        System.out.println("\n");
        
        for (int k = 0; k < a2.length; k++) {
            System.out.print("a2[" + k + "] = " + a2[k] + "\n");
        }
    }
}
