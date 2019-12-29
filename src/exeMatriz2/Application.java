package exeMatriz2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int [][]mat=new int[m][n];
		
		for (int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		int src=sc.nextInt();
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]==src) {
					System.out.print("Position "+i+","+j+": \n");
					
					if (j-1>=0) {
						System.out.print("Left: "+mat[i][j-1]+"\n");
					}
					if (j+1<n) {
						System.out.print("Right: "+mat[i][j+1]+"\n");
					}
					
					if(i-1>=0) {
						System.out.print("Up: " +mat[i-1][j]+"\n");
						
					}
					if(i+1<m) {
						System.out.print("Down: " +mat[i+1][j]+"\n");
						
					}
					
					
				}
				
			}

		}
		sc.close();

	}

}
