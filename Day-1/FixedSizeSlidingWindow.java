public class FixedSizeSlidingWindow {
    public static void main(String[] args) {
        // Input sequence and the fixed frame length
        int[] inputValues = {5, 15, -10, 25, 30, -5, 12, 18};
        int frameLength = 4;

        if (inputValues == null || inputValues.length < frameLength) {
            System.out.println("Invalid input or frame length.");
            return;
        }

        // Initialize the first window sum
        double currentFrameSum = 0;
        for (int i = 0; i < frameLength; i++) {
            currentFrameSum += inputValues[i];
        }

        double maxFrameSum = currentFrameSum;

        // Slide the frame through the sequence
        for (int i = frameLength; i < inputValues.length; i++) {
            currentFrameSum += inputValues[i] - inputValues[i - frameLength];
            if (currentFrameSum > maxFrameSum) {
                maxFrameSum = currentFrameSum;
            }
        }

        // Calculate and display the highest average
        double peakAverage = maxFrameSum / frameLength;
        System.out.println("Peak Subarray Average: " + peakAverage);
    }
}