public class stockprofit {
    public static int buySellStock(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (price[i] > buyPrice) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int price[] = {5, 7, 3, 4, 8, 10, 2};
        System.out.println("Profit is: " + buySellStock(price));
    }
}
