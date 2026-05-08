public class VariableSizeSlidingWindow {
    public static void main(String[] args) {
        // Dataset and the maximum allowed sum for a subarray
        int[] dataPoints = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int threshold = 8;

        int windowStart = 0;
        int runningSum = 0;
        int maxSegmentLength = 0;

        // Expanding the window from the right
        for (int windowEnd = 0; windowEnd < dataPoints.length; windowEnd++) {
            runningSum += dataPoints[windowEnd];

            // Shrink the window from the left if the sum exceeds the threshold
            while (runningSum > threshold) {
                runningSum -= dataPoints[windowStart];
                windowStart++;
            }

            // Calculate the length of the valid segment and update max
            int currentLength = windowEnd - windowStart + 1;
            if (currentLength > maxSegmentLength) {
                maxSegmentLength = currentLength;
            }
        }

        System.out.println("Maximum length of a subarray with sum <= " + threshold + " is: " + maxSegmentLength);
    }
}
