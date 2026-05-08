package codeForces;
import java.io.*;
public class Team {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int cnt=0;
		for(int i=0;i<n;i++) {
			String[] values = br.readLine().split(" ");
			int cnt_1=0;
			for(int j=0;j<3;j++) {
				if(Integer.parseInt(values[j]) == 1) {
					cnt_1++;
				}
			}
			if(cnt_1>=2) cnt++;
		}
		System.out.println(cnt);
	}
}
