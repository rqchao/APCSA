import java.util.Scanner;
public class nestedFor {
public static void main(String[] args) {
        for (int i = 1; i<=8; i++) {
                int j;
                for (j = 15; j >= 2*i; j--) {
                        System.out.print(" ");
                }
                for (j = 1; j <= Math.pow(2,i-2); j*=2) {
                        System.out.print(j + " ");
                }
                for (j = j; j > 0; j /= 2) {
                        System.out.print(j + " ");
                }
                System.out.println();
        }
}
}
