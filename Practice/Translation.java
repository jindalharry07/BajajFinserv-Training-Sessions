package codeForces;
import java.io.*;
public class Translation {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t = br.readLine().trim();
		String s = br.readLine().trim();
		
		if(check(t,s)) System.out.println("YES");
		else System.out.println("NO");
	}
	
	public static boolean check(String t, String s) {
		if(t.length() != s.length()) return false;
		int i=0, j=s.length()-1;
		while(i<t.length() && j>=0) {
			if(t.charAt(i)!=s.charAt(j)) return false;
			i++;j--;
		}
		return true;
	}
}
