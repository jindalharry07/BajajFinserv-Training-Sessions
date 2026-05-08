package codeForces;
import java.io.*;
public class Kefa_and_First_Steps {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
        String[] input = br.readLine().split(" ");

        int maxLength = 1;
        int currentLength = 1;

        int prev = Integer.parseInt(input[0]);

        for (int i = 1; i < n; i++) {
            int curr = Integer.parseInt(input[i]);

            if (curr >= prev) {
                currentLength++;
            } 
            else {
                currentLength = 1;
            }

            maxLength = Math.max(maxLength, currentLength);
            prev = curr;
        }

        System.out.println(maxLength);
	}
}
