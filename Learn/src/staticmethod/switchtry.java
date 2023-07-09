package staticmethod;

import java.util.Scanner;

public class switchtry {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        
//        switch(s) {
//        case "Mango"->
//        	System.out.println("My favourite Mango");
//        	
//        case "Apple"->
//        	System.out.println("My favourite Apple");
//        	
//        case "Grapes" -> System.out.println("King of fruits");
//        default->System.out.println("Please enter valid fruit");
        
        switch(s) {
        case "Mango":
        	System.out.println("My favourite Mango");
        	break;
        	
        case "Apple":
        	System.out.println("My favourite Apple");
        	break;
        	
        case "Grapes" :
        System.out.println("King of fruits");
        break;
        
        default:
        	System.out.println("Please enter valid fruit");
        
        		
        }
	}

}
