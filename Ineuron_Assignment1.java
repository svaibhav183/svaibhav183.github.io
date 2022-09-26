package javaCourse;

import java.util.Scanner;

public class Ineuron_Assignment1 {

	public static void main(String[] args) {
		
		Scanner myobj = new Scanner(System.in);
		
		int n = myobj.nextInt();
		for(int i = 0;i<n;i++) {
			for(int j = 0; j<n;j++) {
				//i
				if (i == 0 || i == n-1 || j ==(n-1)/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//n
			for(int j = 0;j<n;j++) {
				if(j==0 || j == n-1 || i == j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//e
			for(int j = 0;j<n;j++) {
				if(j==0||i==0|| i == (n-1)/2 || i ==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//u
			for(int j = 0;j<n;j++) {
				if(j==0||j==n-1||i==n-1) {
					System.out.print("*");
				}
				else {
					
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//r
			for(int j = 0;j<n;j++) {
				if(j==0 || i == 0|| i == (n-1)/2 || j== n-1 && i <= (n-1)/2 || i-j == (n-1)/2) {
					System.out.print("*");
				}
				else {
					
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j = 0;j<n;j++) {
				if(j==0 || i == 0 || i == n-1 || j == n-1) {
					System.out.print("*");
				}
				else {
					
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//n
			for(int j = 0;j<n;j++) {
				if(j==0 || j == n-1 || i == j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		
		
		
		myobj.close();
	}

}
