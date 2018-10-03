public class Art {
public static final String[] CHARS = new String[] { "u", "▂", "▃", "▄", "▅", "▆", "▇", "█" };
public static final String[] COLORS = new String[] { "\u001b[31m", "\u001b[32m", "\u001b[33m", "\u001b[34m",
                                                     "\u001b[35m", "\u001b[36m", "\u001b[37m", "\u001b[0m" };

public static void main(String[] args) {
        for (int line = 0; line < 10; line++) {
                for (int pyrmamid = line; pyrmamid < line + 7; pyrmamid++) {
                        color(pyrmamid % 7);
                        for (int block = 0; block < 8; block++) {
                                printChar(block);
                        }
                        for (int block = 7; block >= 0; block--) {
                                printChar(block);
                        }
                }
                System.out.println();
        }
}

public static void color(int n) {
        System.out.printf(COLORS[n]);

}

public static void printChar(int n) {
        System.out.printf(CHARS[n]);

}
}
