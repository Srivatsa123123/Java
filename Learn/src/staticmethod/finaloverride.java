package staticmethod;

public class finaloverride {
	public static void main(String[] args) {
		
    learn a = new learn();
    learn1 learn11  = new learn1();
 
}
}
	
 class learn{
	  learn() {
			System.out.println("Original");
		}
	}
	
class learn1 extends  learn {
	void learn(){
		System.out.println("Overriden");
	}
	}

