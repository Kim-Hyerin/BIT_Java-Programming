/*42p ���(literal)*/
import java.util.Scanner;
public class FinalExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.14;
		double radius;
		System.out.println("radius �Է� : ");
		radius = input.nextDouble();
		// PI = 3.14159; -> Error �߻�, ����� ���� �Ұ�
		double area = PI * radius * radius;
		System.out.println("area = " + area);
		input.close();
	}
}
