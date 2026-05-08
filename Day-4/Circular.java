public class Circular {
    public static void main(String[] args) {
        // Calculate the maximum subarray sum in a circular array
        int[] dataPoints = {10, -5, 10};
        
        int aggregateSum = 0;
        int peakValue = dataPoints[0], localPeak = 0;
        int bottomValue = dataPoints[0], localBottom = 0;

        for (int element : dataPoints) {
            aggregateSum += element;

            // Standard Kadane for maximum subarray
            localPeak = Math.max(element, localPeak + element);
            peakValue = Math.max(peakValue, localPeak);

            // Kadane variant for minimum subarray
            localBottom = Math.min(element, localBottom + element);
            bottomValue = Math.min(bottomValue, localBottom);
        }

        // If all numbers are negative, peakValue is the maximum element
        if (peakValue < 0) {
            System.out.println("The maximum circular subarray sum is: " + peakValue);
        } else {
            // Compare non-circular and circular sums
            int wrappedPeak = aggregateSum - bottomValue;
            int result = Math.max(peakValue, wrappedPeak);
            System.out.println("The maximum circular subarray sum is: " + result);
        }
    }
}