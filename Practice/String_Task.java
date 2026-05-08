package codeForces;
import java.io.*;
public class String_Task {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim().toLowerCase();
		StringBuilder sb = new StringBuilder();
		for(char c : str.toCharArray()) {
			if(c != 'a' && c!='o' && c!='y' && c!='e' && c!='u' && c!='i') {
				sb.append('.').append(c);
			}
		}
		System.out.println(sb.toString());
	}
}
