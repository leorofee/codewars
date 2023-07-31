public class SumOfPositive {
    public static int sum(int[] arr) {
        int sumTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumTotal += arr[i];
            }
        }
        return sumTotal;
    }

}
