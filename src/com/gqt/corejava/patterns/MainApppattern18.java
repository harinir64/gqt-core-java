package com.gqt.corejava.pattern;

import java.util.Scanner;

public class MainApppattern18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				if((i+j)%2==0)
					
			System.out.print(" 1");
				else
					System.out.print(" 0");	
}
			System.out.println();
		}
	}
}




