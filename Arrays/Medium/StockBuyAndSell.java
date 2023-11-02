package Arrays.Medium;

public class StockBuyAndSell {

    //Bruteforce
    // static void printProfit(int[] arr) {
    //     int diff = 0;
    //     int maxProfit = 0;
    //     for(int i=0; i<arr.length-1; i++) {
    //         for(int j=i+1; j<arr.length; j++) {
    //             diff = arr[j] - arr[i];
    //             if(diff < 0) {
    //                 diff = 0;
    //             } else {
    //                 if(diff > maxProfit) {
    //                     maxProfit = diff;
    //                 }
    //             }
    //         }
    //     }

    //     System.out.println("Profit:" + maxProfit);
    // }

    static void printProfit(int[] arr) {
        int min = arr[0];
        int cost = 0;
        int profit = 0;
        for(int i=1; i<arr.length; i++) {
            cost = arr[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, arr[i]);
        }

        System.out.println("Profit:" + profit);
    }

    public static void stockBuyAndSell() {
        int[] arr = {7,1,5,3,6,4};
        printProfit(arr);
    }
}
