package learn;
import java.util.Scanner;

public class NegFirstPosLast {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int n = scanner.nextInt();

	        int[] ar = new int[n];

	        for(int i=0;i<ar.length;i++)
	        {
	            ar[i] = scanner.nextInt();
	        }
	        
	       
	        int size = ar.length;
	        int[] rearrangedArr = new int[size];
	        int negativeIndex = 0;
	        int positiveIndex = size - 1;
	        
	        for (int i = 0; i < size; i++) 
	        {
	            if (ar[i] < 0) {
	                rearrangedArr[negativeIndex] = ar[i];
	                negativeIndex++;
	            } else {
	                rearrangedArr[positiveIndex] = ar[i];
	                positiveIndex--;
	            }
	        }


	        for(int i=0;i<ar.length;i++)
	        {
	            System.out.print(rearrangedArr[i]+" ");
	        }
	        
	     
	    }
	    }



