/*46p Ÿ�Ժ�ȯ Up-Casting, Down-Casting �����ϱ�*/
public class Test {

	public static void main(String[] args) {
		int a = 10;
		double b;
		b = a;		System.out.println(b);
		//error�߻� ! a = b;		System.out.println(a); 
		a = (int)b;		System.out.println(a);
		b = 10/3;		System.out.println(b);
		b = (double)10/3;		System.out.println(b);
		b = (int)10.2 + (int)3.3;	System.out.println(b);
		b = (int)10.2 + 3.3;		System.out.println(b);
	}
}
