package week1.day2;

import java.util.Scanner;

public class MaximumofThree {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number a");
		int a = in.nextInt();
		System.out.println("Enter number b");
		int b = in.nextInt();
		System.out.println("Enter number c");
		int c = in.nextInt();
		
		if(a!=b && a!=c && b!=c)
		{
		if(a>b && a>c)
		{
			System.out.println("A is a greater number");
		}
		else if (b>c && b > a) {
			System.out.println("B is a greater number");
			
		}
		
		else {
			System.out.println("c is greater number");
		}
	}
		else {
			System.out.println("there is no specific greater number");
		}
	}

}
