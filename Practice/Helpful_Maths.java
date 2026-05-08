package codeForces;
import java.io.*;
//import java.util.Arrays;
public class Helpful_Maths {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().trim();
		
//		String[] str = s.split("\\+");
//		Arrays.sort(str);
//		StringBuilder sb = new StringBuilder();
//		for(int i=0;i<str.length;i++) {
//			sb.append(str[i]);
//			if(i!=str.length-1) sb.append("+");
//		}
		
		int cnt_1=0, cnt_2=0, cnt_3=0;
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()){
		      if(c == '1') cnt_1++;
		      else if(c == '2') cnt_2++;
		      else if(c == '3') cnt_3++;
		}
		
		while(cnt_1>0){
		      sb.append("1").append("+");
		      cnt_1--;
		}
		while(cnt_2>0){
		      sb.append("2").append("+");
		      cnt_2--;
		}
		while(cnt_3>0){
		      sb.append("3").append("+");
		      cnt_3--;
		}
		if(sb.length() > 0){
		    sb.setLength(sb.length() - 1);
		}
		
		System.out.println(sb.toString());
	}
}
