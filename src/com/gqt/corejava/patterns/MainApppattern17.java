package com.gqt.corejava.pattern;

import java.util.Scanner;

public class MainApppattern17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int number =1;
		for(int i=0;i<=n;i++) {
		 
			for(int j=1;j<=i;j++) {
				
			System.out.print(number + " ");
	        number++;
	}
			System.out.println();
		}
	}
	

}
