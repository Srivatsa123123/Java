package staticmethod;

import java.util.Scanner;

class Test12 {
	 public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        int t = scan.nextInt();
	        int new1 = t;
	        for(int i = 0;i<t;i++)
	        {
	        	int b = scan.nextInt();
	        	int d = scan.nextInt();
	        	new1 = new1 + b - d;
	        }
	       System.out.println(new1);
	    }
}
