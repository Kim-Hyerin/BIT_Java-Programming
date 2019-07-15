/*42p 상수(literal)*/
import java.util.Scanner;
public class FinalExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.14;
		double radius;
		System.out.println("radius 입력 : ");
		radius = input.nextDouble();
		// PI = 3.14159; -> Error 발생, 상수값 변경 불가
		double area = PI * radius * radius;
		System.out.println("area = " + area);
		input.close();
	}
}
