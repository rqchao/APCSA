public class HourglassFor {
public static void main(String[] args) {
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
        for (int i = 8; i>= 2; i-=2) {
                for (int j = 1; j <= 9-i; j+=2) {
                        System.out.print(" ");
                }
                System.out.print("\\");
                for (int j = 0; j < i; j++) {
                        System.out.print(":");
                }
                System.out.print("/");
                System.out.println();
        }
        System.out.println("     ||");
        for (int i = 2; i <= 8; i+=2) {
                for (int j = 0; j >= i-9; j-=2) {
                        System.out.print(" ");
                }
                System.out.print("/");
                for (int j = 0; j < i; j++) {
                        System.out.print(":");
                }
                System.out.print("\\");
                System.out.println();
        }
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
}
}
