package codeForces;
import java.io.*;
public class Beautiful_Matrix {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Here no need to put in the array but we can do it
        
        int ans=0;
        for(int i=0;i<5;i++){
              String[] row = br.readLine().split(" ");
              for(int j=0;j<5;j++){
                    if (Integer.parseInt(row[j]) == 1) {
                          ans = Math.abs(i+1-3) + Math.abs(j+1-3);
                    }
              }
        }
        
        
        System.out.println(ans);
	}
}
