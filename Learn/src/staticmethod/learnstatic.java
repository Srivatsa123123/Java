package staticmethod;

class learnstatic {
	int num1 = 3;
	static int num2 = 5;
	public learnstatic(int num1, int num2) {
		
		if(num2<30) {
			this.num2 = num2;
    		this.num1 = num1;
		}
//		num1 = num1;
		
	}
 public static void main(String[] args) {
	learnstatic s1 = new learnstatic(9,10);
	learnstatic s2 = new learnstatic(12, 22);
	System.out.println(s1.num1+" "+s1.num2+" "+s2.num1+" "+s2.num2);
}

}
