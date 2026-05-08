package codeForces;
import java.io.*;
public class Calculating_Function {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		if(n%2 == 0) {
			System.out.println(n/2);
		}
		else {
			System.out.println(-(n+1)/2);
		}
	}
}
