public class pairarray {
    public static void pairArray(int num[]) {
        int totalPairs = 0;
        int n = num.length;

        totalPairs = n * (n - 1) / 2;  

        for (int i = 0; i < n; i++) {
            int curr = num[i];

            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + curr + "," + num[j] + ")");
            }
            System.out.println();
        }

        System.out.println("Total Pairs are:" + totalPairs);
    }

    public static void main(String args[]) {
        int num[] = {3, 6, 9, 12, 15, 18};
        pairArray(num);
    }
}
