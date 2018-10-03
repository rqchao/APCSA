public class Constant {
public static final int size = 10;
public static void main(String[] args) {
        for (int i=1; i<=size+1; i++) {
                System.out.print(" ");
        }
        System.out.print("+");
        for (int i = 1; i <= size * 3; i++) {
                System.out.print("-");
        }
        System.out.println("+");
        for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size-i+1; j++) {
                        System.out.print(" ");
                }
                System.out.print("/");
                for (int j=1; j <= size-i; j++) {
                        System.out.print("   ");
                }
                System.out.print("___/");
                for (int j=1; j <= i-1; j++) {
                        System.out.print("__/");

                }
                for (int j=1; j <= i-1; j++) {
                        System.out.print("/");

                }
                System.out.println();
        }
        System.out.print("+");
        for (int i = 1; i <= size * 3; i++) {
                System.out.print("-");
        }
        System.out.print("+");
        for (int i = 1; i<=size; i++) {
                System.out.print("/");
        }
        System.out.println();

        for (int i = 1; i <= size; i+=2) {
                System.out.print("|");
                for (int j = 1; j <= ((size*3)-22)/2; j++) {
                        System.out.print(" ");
                }
                System.out.print("Building Java Programs");
                for (int j = 1; j <= ((size*3)-22)/2; j++) {
                        System.out.print(" ");
                }
                System.out.print("|");
                for (int j = size; j >= i; j--) {
                        System.out.print("/");
                }
                System.out.println();
        }

        System.out.print("+");
        for (int i = 1; i <= size * 3; i++) {
                System.out.print("-");
        }
        System.out.println("+");
}
}
