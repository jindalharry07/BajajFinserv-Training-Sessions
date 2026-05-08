public class FindPairWithKSum {
    public static void main(String[] args) {
        // A sorted collection of integers
        int[] sortedData = {3, 5, 8, 12, 19, 21, 30};
        int searchGoal = 31;

        int headIndex = 0;
        int tailIndex = sortedData.length - 1;
        boolean matchExists = false;

        // Use a bidirectional approach to find the pair
        while (headIndex < tailIndex) {
            int currentCombination = sortedData[headIndex] + sortedData[tailIndex];

            if (currentCombination == searchGoal) {
                matchExists = true;
                System.out.println("Pair discovered: " + sortedData[headIndex] + " + " + sortedData[tailIndex] + " = " + searchGoal);
                break;
            } else if (currentCombination < searchGoal) {
                headIndex++;
            } else {
                tailIndex--;
            }
        }

        if (!matchExists) {
            System.out.println("No pair in the collection adds up to " + searchGoal);
        }
    }
}