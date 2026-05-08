package codeForces;
import java.io.*;
public class Petya_and_Strings {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().toLowerCase().trim();
		String t = br.readLine().toLowerCase().trim();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) < t.charAt(i)) {
				System.out.println(-1);
				return;
			}
			else if(s.charAt(i) > t.charAt(i)) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}
}
