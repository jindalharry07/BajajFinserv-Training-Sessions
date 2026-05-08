import java.util.HashMap;
import java.util.Map;

public class SlidingWindowTwoPointers {
    public static void main(String[] args) {
        // String to analyze and the target number of distinct characters
        String sourceText = "abbaccca";
        int distinctCharGoal = 2;

        int windowStart = 0;
        int maxSubstrLen = 0;

        // Map to store frequencies of characters within the current window
        Map<Character, Integer> frequencyRegistry = new HashMap<>();

        for (int windowEnd = 0; windowEnd < sourceText.length(); windowEnd++) {
            char incomingChar = sourceText.charAt(windowEnd);
            frequencyRegistry.put(incomingChar, frequencyRegistry.getOrDefault(incomingChar, 0) + 1);

            // Shrink the window if the number of distinct characters exceeds the goal
            while (frequencyRegistry.size() > distinctCharGoal) {
                char outgoingChar = sourceText.charAt(windowStart);
                frequencyRegistry.put(outgoingChar, frequencyRegistry.get(outgoingChar) - 1);

                if (frequencyRegistry.get(outgoingChar) == 0) {
                    frequencyRegistry.remove(outgoingChar);
                }
                windowStart++;
            }

            // Update max length if the current window has exactly the target number of distinct characters
            if (frequencyRegistry.size() == distinctCharGoal) {
                int currentWidth = windowEnd - windowStart + 1;
                if (currentWidth > maxSubstrLen) {
                    maxSubstrLen = currentWidth;
                }
            }
        }

        System.out.println("Length of longest subarray with exactly " + distinctCharGoal + " distinct characters: " + maxSubstrLen);
    }
}