package codeForces;
import java.io.*;
import java.util.StringTokenizer;
public class Boredom {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] freq = new long[100001];
		int maxEle = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(st.nextToken());
			freq[num]++;
			maxEle = Math.max(maxEle, num);
		}
		
		long[] dp = new long[maxEle+1];
		dp[1] = freq[1]*1;
		for(int i=2;i<=maxEle;i++) {
			long take = freq[i]*i+dp[i-2];
			long notTake = dp[i-1];
			dp[i] = Math.max(take, notTake);
		}
		System.out.println(dp[maxEle]);
	}
}
