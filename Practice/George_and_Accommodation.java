package codeForces;
import java.io.*;
import java.util.StringTokenizer;
public class George_and_Accommodation {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int cnt=0;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			
			if(q-p >= 2) cnt++;
		}
		System.out.println(cnt);
	}
}
