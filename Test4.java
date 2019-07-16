//57p 관계, 동등연산자
public class Test4 {

	public static void main(String[] args) {
		System.out.println(3<4); // true
		System.out.println(10>20.0); // false
		System.out.println(12.5f<=11); // false
		System.out.println(7>=7); // true
		int num1 = 5;
		int num2 = 2 + 3;
		if(num1 == num2)
			System.out.println("num1과 num2가 같으면 true, 다르면 false입니다.");
		if((num1!=num2)==false)
			System.out.println("num1과 num2가 다르면 true, 같으면 false입니다.");
	}
}