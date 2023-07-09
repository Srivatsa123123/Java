package learn;
//Check once!!
import java.util.Scanner;
public class posfirstneglast {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();
	        int[] ar = new int[n];

	        for(int i=0;i<ar.length;i++)
	        {
	            ar[i] = scanner.nextInt();  
	        }
	        
	        int nz=0,z=0;

	        while(nz<ar.length)
	        {
	            if(ar[nz]>=0)
	            {
	                int temp = ar[nz];
	                ar[nz] = ar[z];
	                ar[z] = temp;
	                nz++;
	                z++;
	            }

	            else
	            {
	                nz++;
	            }
	        }

	        for(int i=0;i<ar.length;i++)
	        {
	            System.out.print(ar[i]+" ");
	        }
	 
	    }
	}










//
//or 
//
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        int[] ar = new int[n];
//
//        for(int i=0;i<ar.length;i++)
//        {
//            ar[i]=scanner.nextInt();
//        }
//
//        int negativeindex=ar.length-1,positiveindex=0;
//
//
//        while(positiveindex<negativeindex)
//        {
//
//          while(positiveindex<ar.length && ar[positiveindex]>=0)
//          {
//            positiveindex++;
//          }
//
//          while(negativeindex>=0 && ar[negativeindex]<0)
//          {
//            negativeindex--;
//          }
//
//
//          if(positiveindex<negativeindex)
//          {
//          
//          int temp = ar[positiveindex];
//          ar[positiveindex] = ar[negativeindex];
//          ar[negativeindex] = temp;
//          }
//
//        }
//
//
//        for(int i=0;i<ar.length;i++)
//        {
//            System.out.print(ar[i]+" ");
//        }
//    }
//}
//
