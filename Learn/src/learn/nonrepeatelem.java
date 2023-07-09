package learn;

//Another approach other than down 2 approaches is to merge the 2 arrays and count occurences...If occured 
//twice ,dont print...If occured once then print!!


//THIS WILL NOT GIVE OUTPUT IN SORTED FORM!!
//MY OWN METHOD!
//import java.util.*;
//public class nonrepeatelem {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//
//        int[] A = new int[N];
//
//        for(int i=0;i<A.length;i++)
//        {
//            A[i] = scanner.nextInt();
//        }
//
//        int M = scanner.nextInt();
//
//        int[] B = new int[M];
//
//        for(int i=0;i<B.length;i++)
//        {
//            B[i] = scanner.nextInt(); 
//        }
//
//           int flag = 0;
//        
//
//            for(int i=0;i<A.length-1;i++)
//            {
//                for(int j=0;j<B.length;j++)
//                {
//                    if(A[i] == B[j])
//                    {
//                        break;
//                    }
//
//                    else if(j==B.length-1)
//                    {
//                        flag = 1;
//
//                        if(A[i]!=A[i+1]){
//                        System.out.print(A[i]+" ");
//                        }
//                    }
//                }
//            }
//
//            for(int j=0;j<B.length;j++)
//            {
//                if(A[A.length-1]==B[j])
//                {
//                break;
//                }
//                else if(j==B.length-1)
//                {
//                 System.out.print(A[A.length-1]+" ");
//                }
//            }
//
//            for(int j=0;j<B.length-1;j++)
//            {
//                for(int i=0;i<A.length;i++)
//                {
//                    if(B[j] == A[i])
//                    {
//                        break;
//                    }
//
//                    else if(i==A.length-1)
//                    {
//                       flag = 1;
//                       if(B[j]!=B[j+1]){
//                        System.out.print(B[j]+" ");
//                    }
//                }
//            }
//            }
//
//            
//            for(int i=0;i<A.length;i++)
//            {
//                if(B[B.length-1]==A[i])
//                {
//                break;
//                }
//                else if(i==A.length-1)
//                {
//                 System.out.print(B[B.length-1]+" ");
//                }
//            }
//
//
//            if(flag==0)
//            {
//                System.out.print(0);
//            }
//    }
//}

//import java.util.Scanner;
//
//public class nonrepeatelem {
//




//THIS WILL GIVE OUTPUT IN SORTED FORM!!  HURRRAAYYYYY!!
//CHATGPT method!!
import java.util.Arrays;
import java.util.Scanner;

	public class nonrepeatelem {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();

	        int[] array1=new int[n];

	        for(int i=0;i<array1.length;i++)
	        {
	            array1[i] = scanner.nextInt();
	        }

	        int m = scanner.nextInt();

	        int[] array2=new int[m];

	        for(int i=0;i<array2.length;i++)
	        {
	            array2[i] = scanner.nextInt();
	        }
	        

	         int[] nonRepeatedElements = findNonRepeatedElements(array1, array2);

	       
	        for (int element : nonRepeatedElements) {
	            System.out.print(element+" ");
	        }
	    }

	    public static int[] findNonRepeatedElements(int[] array1, int[] array2) {
	        int[] mergedArray = new int[array1.length + array2.length];
	        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
	        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

	        int[] elementCounts = new int[mergedArray.length];

	        // Count occurrences of elements in the merged array
	        for (int i = 0; i < mergedArray.length; i++) {
	            for (int j = 0; j < mergedArray.length; j++) {
	                if (mergedArray[i] == mergedArray[j]) {
	                    elementCounts[i]++;
	                }
	            }
	        }

	        int nonRepeatedCount = 0;
	        for (int count : elementCounts) {
	            if (count == 1) {
	                nonRepeatedCount++;
	            }
	        }

	        int[] nonRepeatedElements = new int[nonRepeatedCount];
	        int index = 0;
	        for (int i = 0; i < mergedArray.length; i++) {
	            if (elementCounts[i] == 1) {
	                nonRepeatedElements[index] = mergedArray[i];
	                index++;
	            }
	        }
         
	        Arrays.sort(nonRepeatedElements);
	        return nonRepeatedElements;
	    }
	}
	        
	       
