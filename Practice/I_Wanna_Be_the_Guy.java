package codeForces;
import java.io.*;
import java.util.StringTokenizer;
public class I_Wanna_Be_the_Guy {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[] visited = new boolean[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int p = Integer.parseInt(st.nextToken());
		for(int i=0;i<p;i++) {
			visited[Integer.parseInt(st.nextToken())] = true;
		}
		
		st = new StringTokenizer(br.readLine());
		int q = Integer.parseInt(st.nextToken());
		for(int i=0;i<q;i++) {
			visited[Integer.parseInt(st.nextToken())] = true;
		}
		for(int i=1;i<=n;i++) {
			if(!visited[i]) {
				System.out.println("Oh, my keyboard!");
				return;
			}
		}
		System.out.println("I become the guy.");
	}
}
