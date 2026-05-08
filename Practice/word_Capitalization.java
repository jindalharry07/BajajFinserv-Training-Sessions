package codeForces;
import java.io.*;
public class word_Capitalization {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
//		StringBuilder sb = new StringBuilder();
//		sb.append(Character.toUpperCase(str.charAt(0)));
//		for(int i=1;i<str.length();i++) {
//			sb.append(str.charAt(i));
//		}
//		System.out.println(sb.toString());
		
		System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));
	}
}
