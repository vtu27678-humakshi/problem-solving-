import java.util.*;

class Main {

    static void searchDNA(String dna, String pattern) {

        int n = dna.length();
        int m = pattern.length();
        boolean found = false;

        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            while (j < m && dna.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }

            if (j == m) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Pattern not found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dna = sc.nextLine();
        String pattern = sc.nextLine();

        searchDNA(dna, pattern);

        sc.close();
    }
}

INPUT
AATGCGATGATG
ATG

OUTPUT
1 6 9