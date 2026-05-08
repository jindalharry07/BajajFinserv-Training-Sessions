package codeForces;
import java.io.*;
import java.util.StringTokenizer;
public class Kill_the_monster {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			StringTokenizer st;
			
			st = new StringTokenizer(br.readLine());
			long hc = Long.parseLong(st.nextToken());
			long dc = Long.parseLong(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			long hm = Long.parseLong(st.nextToken());
			long dm = Long.parseLong(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			long k = Long.parseLong(st.nextToken());
			long w = Long.parseLong(st.nextToken());
			long a = Long.parseLong(st.nextToken());
			
			boolean canWin = false;	
			
			for(long i=0;i<=k;i++) {
				long newAttack = dc + i*w;
				long newHealth = hc + (k-i)*a;
				
				long turn_c = (hm%newAttack == 0) ? hm/newAttack : (hm/newAttack)+1;
				long turn_m = (newHealth%dm == 0) ? newHealth/dm : (newHealth/dm)+1;
				
				if(turn_c <= turn_m) {
					canWin = true;
					break;
				}
			}
			sb.append(canWin ? "YES\n" : "NO\n");
		}
		System.out.println(sb.toString());
	}
}
