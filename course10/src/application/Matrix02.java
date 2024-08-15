package application;

import java.util.Locale;
import java.util.Scanner;

public class Matrix02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		int column = sc.nextInt();
		int search = 0;
		
		
		int[][] mat = new int[line][column];
		for(int i=0; i<mat.length; i++) {
			for(int x=0; x<mat[i].length; x++) {
				mat[i][x] = sc.nextInt();
			}
		}
		search = sc.nextInt();
		for(int i=0; i<mat.length; i++) {
			for(int x=0; x<mat[i].length; x++) {
				if(mat[i][x] == search) {
					System.out.println("Position " + i + "," + x + ":");
					if((x - 1) >= 0) {
						System.out.println("Left: " + mat[i][x-1]);
					}
					if((x + 1) < mat[i].length) {
						System.out.println("Right: " + mat[i][x+1]);
					}
					if((i - 1) >= 0) {
						System.out.println("Up: " + mat[i-1][x]);
					}
					if((i + 1) < mat.length) {
						System.out.println("Down: " + mat[i+1][x]);
					}
				}
			}
		}
		
		
		sc.close();
	}
}
