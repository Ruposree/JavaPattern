package org.patterns.practiceset1;

import java.util.Scanner;

public class StarPattern1 {
	static Scanner sc=new Scanner(System.in);
	void pattern1(int num) {
		
		
		int starCount=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=starCount;j++) {
				System.out.print("*"+" ");
			}
			
			starCount++;
			System.out.println(" ");
		}
		
	}

	public static void main(String[] args) {
		StarPattern1 sp=new StarPattern1();
		System.out.println("Enter the number");
		sp.pattern1(sc.nextInt());

	}

}
