package codeForces;
import java.io.*;
public class Next_Round {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);
		
        String[] scores = br.readLine().split(" ");
        int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(scores[i]);
		}
		// Here k represent rank
		
		int cnt=0;
		int threshold = arr[k-1];
		for(int i=0;i<n;i++) {
			if(arr[i] >= threshold && arr[i]>0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
