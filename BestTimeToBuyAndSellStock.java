public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }

        int left = 0;
        int right = 1;
        int maxProfit = 0;

        while (right <= prices.length - 1) {
            if (prices[right] < prices[left]) {
                left = right;
            } else {
                maxProfit=Math.max(maxProfit,prices[right] - prices[left]);
            }
            right++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] test1 = { 7, 1, 5, 3, 6, 4 };
        int[] test2 = { 7, 6, 4, 3, 1 };
        int[] test3 = { 1, 2, 3, 4, 5 }; 
        int[] test4 = {};

        System.out.println(maxProfit(test1)); 
        System.out.println(maxProfit(test2)); 
        System.out.println(maxProfit(test3));
        System.out.println(maxProfit(test4));  
    }
}