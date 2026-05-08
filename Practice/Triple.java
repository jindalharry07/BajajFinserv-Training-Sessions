package codeForces;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Triple {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			int cnt=1;
			int ans=-1;
			for(int i=1;i<n;i++) {
				if(arr[i] == arr[i-1]) {
					cnt++;
				}
				else {
					cnt=1;
				}
				
				if(cnt == 3) {
					ans = arr[i];
				}
			}
			System.out.println(ans);
		}
	}
}
