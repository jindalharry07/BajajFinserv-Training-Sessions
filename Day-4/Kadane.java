public class Kadane {
    public static void main(String[] args) {
        // Find the maximum sum of any contiguous subarray using Kadane's Algorithm
        int[] numericSequence = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        if (numericSequence.length == 0) return;

        int currentRunningTotal = numericSequence[0];
        int overallMaximum = numericSequence[0];

        for (int i = 1; i < numericSequence.length; i++) {
            // Either start a new subarray or extend the current one
            currentRunningTotal = Math.max(numericSequence[i], currentRunningTotal + numericSequence[i]);
            
            // Track the maximum sum encountered so far
            if (currentRunningTotal > overallMaximum) {
                overallMaximum = currentRunningTotal;
            }
        }

        System.out.println("The highest sum found in a contiguous subarray is: " + overallMaximum);
    }
}
