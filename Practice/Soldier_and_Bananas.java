package codeForces;
import java.io.*;
import java.util.StringTokenizer;
public class Soldier_and_Bananas {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long k = Long.parseLong(st.nextToken());
		long n = Long.parseLong(st.nextToken());
		long w = Long.parseLong(st.nextToken());
		
		long total = k*w*(w+1)/2;
		
		if(total <= n) System.out.println(0);
		else System.out.println(total-n);
	}
}
