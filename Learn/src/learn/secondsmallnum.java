package learn;
import java.util.Scanner;
public class secondsmallnum {





    public static int findSecondSmallest(int[] ar) {
        
      int p = Integer.MAX_VALUE;
      int min = Integer.MAX_VALUE;

      for(int i=0;i<ar.length;i++)
      {
        if(ar[i]<p)
        {
            p = ar[i];

            if(p<min)
            {
             p = min;
             min = ar[i];
            }
        }
      }
      return p;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];

        for(int i=0;i<ar.length;i++)
        {
            ar[i]=scanner.nextInt();
        }

        System.out.print(findSecondSmallest(ar));
    }
}
