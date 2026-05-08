package codeForces;
import java.io.*;
import java.util.ArrayList;
public class Sum_of_Round_Numbers {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- >0) {
//			int n = Integer.parseInt(br.readLine());
//			int place=1;
//			ArrayList<Integer> ans = new ArrayList<>();
//			while(n>0) {
//				int rem = n%10;
//				if(rem!=0)ans.add(rem*place);
//				place*=10;
//				n=n/10;
//			}
//			System.out.println(ans.size());
//			for(int i=0;i<ans.size();i++) {
//				System.out.print(ans.get(i));
//				if(i!=ans.size()-1) System.out.print(" ");
//			}
//			System.out.println();
			
			String n = br.readLine();
			ArrayList<Integer> ans = new ArrayList<>();
			for(int i=0;i<n.length();i++) {
				if(n.charAt(n.length()-i-1)!='0') {
					int digit = n.charAt(n.length()-i-1)-'0';
					ans.add((int) (digit*Math.pow(10, i)));
				}
			}
			System.out.println(ans.size());
			for(int i=0;i<ans.size();i++) {
				System.out.print(ans.get(i));
				if(i!=ans.size()-1) System.out.print(" ");
			}
			System.out.println();
		}
	}
}
