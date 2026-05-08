public class MaxSubArray {
    public static void main(String[] args) {
        // Find the maximum sum of a contiguous subarray of a specific length
        int[] numericalSeries = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int subLength = 3;

        if (numericalSeries.length < subLength) {
            System.out.println("Array length is shorter than the subarray size.");
            return;
        }

        int currentAccumulator = 0;
        for (int i = 0; i < subLength; i++) {
            currentAccumulator += numericalSeries[i];
        }

        int highestDetectedSum = currentAccumulator;

        // Shift the window across the series
        for (int i = subLength; i < numericalSeries.length; i++) {
            currentAccumulator += numericalSeries[i] - numericalSeries[i - subLength];
            if (currentAccumulator > highestDetectedSum) {
                highestDetectedSum = currentAccumulator;
            }
        }

        System.out.println("The maximum sum of any subarray with length " + subLength + " is: " + highestDetectedSum);
    }
}
