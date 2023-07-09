package learn;
import java.util.Scanner;
public class printrepeatelem {
	
        public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();

	        int[] ar = new int[N];
	        int flag = 0;
	        int check = 0;
	        int somenum = 0;
	        for(int i=0;i<ar.length;i++)
	        {
	            ar[i] = scanner.nextInt();
	        }

	        for(int i=0;i<ar.length-1;i++)
	        {
	            for(int j=i+1;j<ar.length;j++)
	            {
	               
	                if(ar[i]==ar[j])
	                {
	                    flag = 1;
	                }
	            }
	            
	            if(check!=ar[i])
	            {
	            if(flag==1)
	            {
	              somenum = 1;
	              System.out.print(ar[i]+" ");
	            }
	            
	            }
	             check = ar[i];

	        }

	        if(somenum==0)
	        {
	            System.out.print(-1);
	        }

	    }
	}



//OR
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//
//        int[] ar = new int[N];
//        int count = 1;
//        int flag = 0;
//        for(int i=0;i<ar.length;i++)
//        {
//            ar[i] = scanner.nextInt();
//        }
//
//        for(int i=0;i<ar.length-1;i++)
//        {
//            if(ar[i]==ar[i+1])
//            {
//                 flag = 1;
//                count++;
//            }
//
//            else
//            {
//             if (count>1)
//            {
//               
//                System.out.print(ar[i]+" ");
//            }
//            count = 1;
//            }
//        }
//
//        if(count>1)
//        {
//            System.out.print(ar[ar.length-1]);
//        }
//
//
//        if(flag==0)
//        {
//            System.out.print(-1);
//        }
//    }
//}