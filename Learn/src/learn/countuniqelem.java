package learn;
import java.util.Scanner;
public class countuniqelem {
	

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        int[] ar = new int[N];
	        int count = 1;

	        for(int i=0;i<ar.length;i++)
	        {
	            ar[i] = scanner.nextInt();
	        }
	        

	        for(int i = 1;i<ar.length;i++)
	        {
	          if(ar[i-1]!=ar[i])
	          {
	            count++;
	          }
	        }
	        
	        System.out.print(count);

	    }
	}

