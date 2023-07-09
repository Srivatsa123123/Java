package staticmethod;

 class parentreference {

	 void getData() {
		 System.out.println("A");
	 }

	 void getValue() {
 		
	}
}

 class two extends parentreference{
	 
	  	 void getData() {
		 System.out.println("B");
	 }
	 
	  void getValue() {
		 System.out.println("C");
	 }
	 public static void main(String[] args) {
		parentreference p = new two();
		p.getValue();
		p.getData();
	}
 }