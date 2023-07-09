package maths;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int a = 0;
		int b=1;
		int count = 0;
		
		while(count<n)
		{
			int temp = b;	
			System.out.print(a+" ");
			b = b + a;
			a = temp;
			count++;				
		}
//		System.out.print(a+" ");
		
	}

}
