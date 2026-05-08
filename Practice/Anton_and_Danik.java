package codeForces;
import java.io.*;
public class Anton_and_Danik {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int cnt=0;
		for(char c : str.toCharArray()) {
			if(c == 'A') cnt++;
			else cnt--;
		}
		if(cnt > 0) System.out.println("Anton");
		else if(cnt < 0) System.out.println("Danik");
		else if(cnt == 0) System.out.println("Friendship");
	}
}
