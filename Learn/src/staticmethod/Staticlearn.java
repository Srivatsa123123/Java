package staticmethod;

class Staticlearn {
	static int x;
	void increment()
	{
		x++;
	}
}

class static_use{
	public static void main(String[] args) {
		Staticlearn obj1 = new Staticlearn();
		Staticlearn obj2 = new Staticlearn();
		Staticlearn obj3 = new Staticlearn();
        obj1.x=0;
        obj1.increment();
        obj2.increment();
        obj2.increment();
        System.out.println(obj1.x+" "+obj2.x);
        System.out.println(obj3.x);
	}	
	
}