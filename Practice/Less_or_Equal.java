package codeForces;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Less_or_Equal {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		long[] arr = new long[n];
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(arr);
		
		if(k == 0) {
			if(arr[0] == 1) System.out.println(-1);
			else System.out.println(arr[0]-1);
			return;
		}
		
		long x = arr[k-1];
		if(k<n && arr[k] == x) {
			System.out.println(-1);
		}
		else {
			System.out.println(x);
		}
	}
}
