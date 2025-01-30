package week1.day2;

import java.util.Scanner;

public class DivisiblebyFiveorEleven {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num");
		int num = s.nextInt();
		
		if(num % 5 ==0 && num % 11 == 0)
		{
			System.out.println("Num is divisible by 5 & 11");
		}
		else
		{
			System.out.println("Numb is not divisible by both 5 & 11");
		}
	}

}
