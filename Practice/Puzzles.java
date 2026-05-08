package codeForces;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Puzzles {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[m];
		for(int i=0;i<m;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		int i=0, j=0, mini = Integer.MAX_VALUE;
		while(j<m) {
			if(j-i+1 == n) {
				mini = Math.min(mini, arr[j] - arr[i]);
				i++;
			}
			j++;
		}
		System.out.println(mini);
	}
}
