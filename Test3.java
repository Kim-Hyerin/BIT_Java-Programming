/*54p 전위,후위연산*/
public class Test3 {

	public static void main(String[] args) {
		int x=2;	int y=2;	int value;
		value = ++x * 5;	System.out.println(value);
		value = y++ * 5;	System.out.println(value);
		value = ++y;	System.out.println(value);
		value = x++;	System.out.println(value);
		value = y--;	System.out.println(value);
		value = --x;	System.out.println(value);
	}
}