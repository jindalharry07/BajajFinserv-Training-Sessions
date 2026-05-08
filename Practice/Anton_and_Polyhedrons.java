package codeForces;
import java.io.*;
public class Anton_and_Polyhedrons {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int sum=0;
		for(int i=0;i<n;i++) {
			String val = br.readLine().trim();

            if(val.equals("Tetrahedron")) sum += 4;
            else if(val.equals("Cube")) sum += 6;
            else if(val.equals("Octahedron")) sum += 8;
            else if(val.equals("Dodecahedron")) sum += 12;
            else if(val.equals("Icosahedron")) sum += 20;
		}
		System.out.println(sum);
	}
}
