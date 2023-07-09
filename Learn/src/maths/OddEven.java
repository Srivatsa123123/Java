package maths;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=3;i<2*n;i++)
	    {
	      if(i%3==0 || i%5==0 || i%7==0)
	      {
	        System.out.print(i+" ");
	      }
	}
	}
	}


