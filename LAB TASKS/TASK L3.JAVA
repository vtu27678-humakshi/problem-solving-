import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int minPrice = price[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {

            if (price[i] < minPrice) {
                minPrice = price[i];
            }

            int profit = price[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println(maxProfit);

        sc.close();
    }
}

INPUT
6
7 1 5 3 6 4

OUTPUT
5

CONCEPTS
Keep the lowest price seen so far
        ↓
Calculate today's profit
        ↓
Keep the maximum profit