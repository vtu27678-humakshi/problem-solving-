import java.util.*;

class Main {

    static void search(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }

            if (j == m) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        search(text, pattern);

        sc.close();
    }
}

INPUT
AABAACAADAABAABA
AABA
OUTPUT
0 9 12