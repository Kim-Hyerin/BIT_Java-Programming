/*46p 타입변환 Up-Casting, Down-Casting 구별하기*/
public class Test {

	public static void main(String[] args) {
		int a = 10;
		double b;
		b = a;		System.out.println(b);
		//error발생 ! a = b;		System.out.println(a); 
		a = (int)b;		System.out.println(a);
		b = 10/3;		System.out.println(b);
		b = (double)10/3;		System.out.println(b);
		b = (int)10.2 + (int)3.3;	System.out.println(b);
		b = (int)10.2 + 3.3;		System.out.println(b);
	}
}
