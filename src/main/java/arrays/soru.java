package arrays;

public class soru {
    public static void main(String[] args) {

        int[] arr = {1, 6, -5, -9, 10, 5, 77, 3, -6, -9, -4};
        int largestNegative = Integer.MIN_VALUE;
        int smallestPositive = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] > largestNegative) {
                largestNegative = arr[i];
            }
            if (arr[i] > 0 && arr[i] < smallestPositive) {
                smallestPositive = arr[i];
            }
        }

        System.out.println("Largest negative: " + largestNegative);
        System.out.println("Smallest positive: " + smallestPositive);
    }
}
