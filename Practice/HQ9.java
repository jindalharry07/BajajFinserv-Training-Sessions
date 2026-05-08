package codeForces;
import java.io.*;
public class HQ9 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for(char c : str.toCharArray()) {
			if(c == 'H' || c=='Q' || c=='9') {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}
