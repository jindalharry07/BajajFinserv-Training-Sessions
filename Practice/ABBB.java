package codeForces;
import java.io.*;
public class ABBB {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		// count number of A's and B's and then sub
		while(n-- > 0) {
			String str = br.readLine().trim();
			int a=0, b=0;
			for(char c : str.toCharArray()) {
				if(c == 'A') a++;
				else {
					if(a>0) a--;
					else b++;
				}
			}
			b=b%2;
			sb.append((a+b)).append("\n");
		}
		System.out.println(sb.toString());
	}
}
