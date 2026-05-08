package codeForces;
import java.io.*;
public class Sum_of_cubes {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(br.readLine());
		while(t-- >0) {
			long n = Long.parseLong(br.readLine());
			long s=1, e=(long) Math.cbrt(n);
			boolean found = false;
			while(s<=e) {
				long first = s*s*s;
				long second = e*e*e;
				
				if((first + second) == n) {
					found=true;
					break;
				}
				if((first+second) < n) s++;
				else e--;
			}
			System.out.println((found) ? "YES" : "NO");
		}
	}
}
