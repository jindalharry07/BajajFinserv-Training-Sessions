package codeForces;
import java.io.*;
import java.util.HashMap;
public class Two_Gram {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		String str = br.readLine().trim();
		HashMap<String, Integer> mp = new HashMap<>();
		String ans = "";
		int maxi=0;
		for(int i=0;i<n-1;i++) {
			String gram = str.substring(i,i+2);
			mp.put(gram, mp.getOrDefault(gram,0)+1);
			if(mp.get(gram) > maxi) {
				maxi = mp.get(gram);
				ans = gram;
			}
		}
		System.out.println(ans);
	}
}
