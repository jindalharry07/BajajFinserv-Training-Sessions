package codeForces;
import java.io.*;
public class FootBall {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		int cnt=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				cnt++;
				if(cnt>=7) {
					System.out.println("YES");
					return;
				}
			}
			else {
				cnt=0;
			}
		}
		System.out.println("NO");
	}
}
