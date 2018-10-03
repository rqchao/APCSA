public class P2_1_NestedFor {
public static void main(String[] args) {
        // Number of spaces on each line
        int n = 14;
        // Print inital 1 because I was too lazy to make it efficient
        System.out.println("                1                ");
        // main loop
        for (int i = 1; i < 128; i *= 2) {
                int j;
                // print first set of spaces
                for (int k = 0; k < n; k++) {
                        System.out.print(" ");
                }
                // print first set of numbers (increasing)
                for (j = 1; j < i + 1; j *= 2) {
                        System.out.print(j + " ");
                }
                // print second set of numbers (decreasing)
                for (j = j; j > 0; j /= 2) {
                        System.out.print(j + " ");
                }
                // print last set of spaces
                for (int k = 0; k < n; k++) {
                        System.out.print(" ");
                }
                //print newline at the end of each line
                System.out.println();
                n -= 2;
        }
}
}
