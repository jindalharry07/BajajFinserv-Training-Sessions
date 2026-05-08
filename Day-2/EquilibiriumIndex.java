public class EquilibiriumIndex {
    public static void main(String[] args) {
        // Sample array with a potential equilibrium point
        int[] streamOfNumbers = {-7, 1, 5, 2, -4, 3, 0};
        int arrayLength = streamOfNumbers.length;

        // Precompute sums from the left and right
        int[] leftPartialSums = new int[arrayLength];
        int[] rightPartialSums = new int[arrayLength];

        leftPartialSums[0] = streamOfNumbers[0];
        for (int i = 1; i < arrayLength; i++) {
            leftPartialSums[i] = leftPartialSums[i - 1] + streamOfNumbers[i];
        }

        rightPartialSums[arrayLength - 1] = streamOfNumbers[arrayLength - 1];
        for (int i = arrayLength - 2; i >= 0; i--) {
            rightPartialSums[i] = rightPartialSums[i + 1] + streamOfNumbers[i];
        }

        // Identify the index where left sum equals right sum
        boolean foundMatch = false;
        for (int i = 0; i < arrayLength; i++) {
            int leftBalance = (i == 0) ? 0 : leftPartialSums[i - 1];
            int rightBalance = (i == arrayLength - 1) ? 0 : rightPartialSums[i + 1];

            if (leftBalance == rightBalance) {
                System.out.println("Balance Point Detected at index: " + i);
                foundMatch = true;
                break;
            }
        }

        if (!foundMatch) {
            System.out.println("No point of equilibrium exists in this dataset.");
        }
    }
}
