package learn;
import java.util.Scanner;
public class ProdOfSmallLarge {
	
	
		public static void main(String args[]) {
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int[]ar=new int[n];
			for(int i=0;i<ar.length;i++) {
				ar[i]=scan.nextInt();
			}
			int product=1;
			int firstlargest=Integer.MIN_VALUE;	
			int secondlargest=Integer.MIN_VALUE;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]>firstlargest) {
					secondlargest=firstlargest;
					firstlargest=ar[i];
				}
				else if(ar[i]>secondlargest && ar[i]!=firstlargest) {
					secondlargest=ar[i];
				}
			}
			
			product=firstlargest*secondlargest;
			System.out.println(product);
			
			
			int firstsmallest = Integer.MAX_VALUE;
			int secondsmallest=Integer.MAX_VALUE;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]<firstsmallest) {
					secondsmallest = firstsmallest;
					firstsmallest=ar[i];
				}
				else if(ar[i]<secondsmallest && ar[i]!=firstsmallest) {
					secondsmallest=ar[i];
				}
			}
			product=firstsmallest*secondsmallest;
			System.out.println(secondsmallest);
		}
	}

