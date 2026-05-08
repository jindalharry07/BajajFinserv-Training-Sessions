package codeForces;
import java.io.*;
public class In_Search_of_an_Easy_Problem {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		String[] values = br.readLine().split(" ");
		for(int i=0;i<n;i++) {
			if(Integer.parseInt(values[i]) == 1) {
				System.out.println("HARD");
				return;
			}
		}
		System.out.println("EASY");
	}
}
