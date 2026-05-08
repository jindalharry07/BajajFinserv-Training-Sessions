public class RangeSum {
    public static void main(String[] args) {
        // Sample array for range sum calculation
        int[] dataSequence = {10, 20, 30, 40, 50, 60};
        int length = dataSequence.length;

        // Precompute prefix sums for efficient range queries
        int[] prefixAggregate = new int[length];
        prefixAggregate[0] = dataSequence[0];
        for (int i = 1; i < length; i++) {
            prefixAggregate[i] = prefixAggregate[i - 1] + dataSequence[i];
        }

        // Define the range [startIndex, endIndex]
        int startIndex = 2; // Index starts from 0
        int endIndex = 4;

        int totalRangeSum;
        if (startIndex == 0) {
            totalRangeSum = prefixAggregate[endIndex];
        } else {
            totalRangeSum = prefixAggregate[endIndex] - prefixAggregate[startIndex - 1];
        }

        // Display the result
        System.out.println("The sum of elements from index " + startIndex + " to " + endIndex + " is: " + totalRangeSum);
    }
}
