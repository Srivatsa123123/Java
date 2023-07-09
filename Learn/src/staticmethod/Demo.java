package staticmethod;

class classTest {
public int y=0;

}
class Demo
{
	private static int x =100;
    public static void main(String[] args) {
    	
	Demo s1 = new Demo();
	s1.x++;
	
	Demo s2 = new Demo();
	s2.x++;
	
	
	s1 = new Demo();
	s1.x++;
	
	Demo.x++;
	System.out.println(x);
	
	classTest t1 = new classTest();
	t1.y++;
	classTest t2 = new classTest();
	t2.y++;
	
//    t1 = new classTest();
	System.out.println("t1y is"+t1.y);
	System.out.println("t2y is "+t2.y);
	/*
	 * System.out.println("classTest.y is"+classTest.y);
	 * System.out.println(t1.y+t2.y);
	 */
}
}
