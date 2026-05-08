package codeForces;
import java.io.*;

public class Nearly_Lucky_Number {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '4' || str.charAt(i) == '7') cnt++;
		}
		
		if(cnt == 0) {
			System.out.println("NO");
			return;
		}
		
		while(cnt>0) {
			int rem = cnt%10;
			if(rem != 4 && rem != 7) {
				System.out.println("NO");
				return;
			}
			cnt /= 10;
		}
		System.out.println("YES");
	}
}
