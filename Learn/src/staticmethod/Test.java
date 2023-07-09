package staticmethod;

 class T {

     final int i;
	 final int j;
	 
	 T(int a,int b){
			i=a;
			j=b;
		}
	//Constructor can be used to initialize final variables also!!
	//Methods cannot initialize final variables!!
	
	class Test{
		static int m;
	public static void main(String[] args) {
		
	T w = new T(5,6);
	System.out.println(w.i);
		
	}

	}

}
