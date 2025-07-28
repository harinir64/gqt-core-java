package com.gqt.corejava.pattern;

import java.util.Scanner;

public class MainApppattern13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int k;
		for(int i=1;i<=n;i++) {
			k=i;
			for(int j=1;j<=n;j++) {
			System.out.print(k+" ");
			k=k+n;
}
			System.out.println();
		}
	}
}


