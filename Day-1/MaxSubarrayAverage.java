public class MaxSubarrayAverage {
    public static void main(String[] args) {
        // Sample dataset and window size
        int[] dataset = {3, -1, 15, 20, -5, 10, 8, -2};
        int windowSize = 3;

        if (dataset.length < windowSize) {
            System.out.println("Dataset too small for the given window size.");
            return;
        }

        // Calculate the sum of the initial window
        double currentTotal = 0;
        for (int i = 0; i < windowSize; i++) {
            currentTotal += dataset[i];
        }

        double maxTotal = currentTotal;

        // Slide the window across the rest of the dataset
        for (int i = windowSize; i < dataset.length; i++) {
            currentTotal += dataset[i] - dataset[i - windowSize];
            if (currentTotal > maxTotal) {
                maxTotal = currentTotal;
            }
        }

        // Compute and output the maximum average found
        double averageResult = maxTotal / windowSize;
        System.out.printf("Maximum average of subarray of size %d is: %.2f%n", windowSize, averageResult);
    }
}
