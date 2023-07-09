package learn;
import java.util.Scanner;

public class firstelenotsort {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();

	        int[] ar = new int[n];

	        for(int i=0;i<ar.length;i++)
	        {
	            ar[i] = scanner.nextInt();
	        }
	        int flag=0;

	        for (int i = 0; i < ar.length - 1; i++) 
	        {
	            if (ar[i] > ar[i+1]) {
	                flag = 1;
	               System.out.print(ar[i+1]);
	               break;
	            }
	        }

	        if(flag==0)
	        {
	            System.out.print(-1);
	        }
	    }

	}

