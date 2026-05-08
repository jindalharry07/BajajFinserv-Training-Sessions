package codeForces;
import java.io.*;
import java.util.HashSet;
public class Boy_or_Girl {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		HashSet<Character> st = new HashSet<>();
		for(char c : str.toCharArray()) {
			st.add(c);
		}
		if(st.size()%2 != 0) System.out.println("IGNORE HIM!");
		else System.out.println("CHAT WITH HER!" );
	}
}
