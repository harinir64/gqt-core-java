package com.gqt.corejava.pattern;

import java.util.Scanner;

public class MainApppattern16 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size:");
	int n=sc.nextInt();
	int k;
	for(int i=0;i<=n;i++) {
	 k=i+1;
		for(int j=1;j<=i+1;j++) {
			
		System.out.print(j+ " ");
		k++;
}
		System.out.println();
	}
}
}

