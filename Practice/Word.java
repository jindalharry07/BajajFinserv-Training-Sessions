package codeForces;
import java.io.*;
public class Word {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		
		int lower_cnt=0;
		int upper_cnt=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i) <= 'z') lower_cnt++;
			else upper_cnt++;
		}
		if(lower_cnt>upper_cnt) str = str.toLowerCase();
		else if(lower_cnt < upper_cnt) str = str.toUpperCase();
		else str = str.toLowerCase();
		
		System.out.println(str);
	}
}
