public class VariableSizeSubarray {
    public static void main(String[] args) {
        // Find the length of the longest subarray with a total sum not exceeding the limit
        int[] inputElements = {1, 2, 3, 4, 5, 1, 1, 1, 1, 6};
        int upperLimit = 5;

        int startPointer = 0;
        int sectionSum = 0;
        int peakLength = 0;

        for (int endPointer = 0; endPointer < inputElements.length; endPointer++) {
            sectionSum += inputElements[endPointer];

            // Adjust the section by moving the start forward if the limit is exceeded
            while (sectionSum > upperLimit) {
                sectionSum -= inputElements[startPointer];
                startPointer++;
            }

            // Record the maximum length found so far
            int currentSegmentSize = endPointer - startPointer + 1;
            if (currentSegmentSize > peakLength) {
                peakLength = currentSegmentSize;
            }
        }

        System.out.println("Maximum length of contiguous segment with sum <= " + upperLimit + " is: " + peakLength);
    }
}