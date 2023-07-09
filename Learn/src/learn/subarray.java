package learn;
import java.util.Scanner;
public class subarray {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();
	        int[] ar = new int[n];
	 
	        for(int i=0;i<ar.length;i++)
	        {
	            ar[i] = scanner.nextInt();
	        }

	        for(int i=0;i<ar.length;i++)
	        {
	            for(int j=i;j<ar.length;j++)
	            {
	                for(int k=i;k<=j;k++)
	                {
	       				System.out.print(ar[k]+" ");
	                }
	                System.out.println();
	            }
	        }
	    }
	}

