public class SplitArray {
    public static void main(String[] args) {
        // Dataset to check if it can be partitioned into three equal-sum segments
        int[] inputCollection = {1, 3, 4, 1, 2, 1};
        int grandTotal = 0;

        for (int value : inputCollection) {
            grandTotal += value;
        }

        // The total sum must be divisible by 3 for a valid three-way split
        if (grandTotal % 3 != 0) {
            System.out.println("Result: False (Sum not divisible by 3)");
            return;
        }

        int requiredSectionSum = grandTotal / 3;
        int temporarySum = 0;
        int sectionCounter = 0;

        for (int element : inputCollection) {
            temporarySum += element;
            if (temporarySum == requiredSectionSum) {
                sectionCounter++;
                temporarySum = 0;
            }
        }

        // Output whether at least three equal-sum sections were identified
        boolean isSplittable = sectionCounter >= 3;
        System.out.println("Can be split into three equal parts: " + isSplittable);
    }
}
