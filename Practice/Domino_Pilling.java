package codeForces;
import java.io.*;
public class Domino_Pilling {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int m = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);
		
		// Two Ways:
		// 1
		System.out.println((m*n)/2);
	
		// 2
//		boolean[][] visited = new boolean[m][n];
//		int cnt=0;
//		for(int i=0;i<m;i++) {
//			for(int j=0;j<n;j++) {
//				if(!visited[i][j]) {
//					if(j+1<n && !visited[i][j+1]) {
//						visited[i][j] = true;
//						visited[i][j+1] = true;
//						cnt++;
//					}
//					else if(i+1<m && !visited[i+1][j]) {
//						visited[i][j] = true;
//						visited[i+1][j] = true;
//						cnt++;
//					}
//				}
//			}
//		}
//		System.out.println(cnt);
	}
}
