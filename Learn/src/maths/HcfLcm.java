package maths;



import java.util.Scanner;

public class HcfLcm {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int m = scan.nextInt();
	int n = scan.nextInt();
	
	
	int hcf = printCommonFactors(n, m);
	int lcm = LCM(m,n,hcf);
    System.out.println(hcf);
    System.out.println(lcm);
}

static int printCommonFactors(int n,int m) {
	int hcf = 0;
	for(int i=n;i>=1;i--) {
		if(n%i==0 && m%i==0) {
		     hcf = i;
		 	 break;		
		}
	}
	return hcf;
}

static int LCM(int m,int n,int a) {
	
	int lcm = ((m*n)/a);
	return lcm;
}
}




