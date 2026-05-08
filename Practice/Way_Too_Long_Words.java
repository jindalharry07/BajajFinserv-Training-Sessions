package codeForces;
import java.io.*;
public class Way_Too_Long_Words {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		while(n-- > 0) {
			String str = br.readLine().trim();
			if(str.length() > 10) {
				System.out.println("" + str.charAt(0) + 
						(str.length()-2) + 
						str.charAt(str.length()-1));
			}			
			else {
				System.out.println(str);
			}
		}
	}
}
