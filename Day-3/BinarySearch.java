public class BinarySearch {
    public static void main(String[] args) {
        // A collection of numbers sorted in ascending order
        int[] sortedCollection = {5, 12, 18, 22, 31, 45, 50, 62, 77};
        int targetValue = 45;

        int leftBoundary = 0;
        int rightBoundary = sortedCollection.length - 1;
        boolean isValueFound = false;

        // Perform a binary search for the target value
        while (leftBoundary <= rightBoundary) {
            int middleIndex = leftBoundary + (rightBoundary - leftBoundary) / 2;

            if (sortedCollection[middleIndex] == targetValue) {
                System.out.println("Target value " + targetValue + " identified at index: " + middleIndex);
                isValueFound = true;
                break;
            } else if (sortedCollection[middleIndex] < targetValue) {
                leftBoundary = middleIndex + 1;
            } else {
                rightBoundary = middleIndex - 1;
            }
        }

        if (!isValueFound) {
            System.out.println("The target value " + targetValue + " is not present in the collection.");
        }
    }
}
