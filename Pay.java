import java.util.Scanner;
//74p IF ��_1(�ӱ� ��� ���α׷�)
public class Pay {

	public static void main(String[] args) {
		int pay;
		int hours;
		Scanner input=new Scanner(System.in);
		
		System.out.println("�ð��� �Է��ϼ��� : ");
		hours=input.nextInt();
			if(hours>0) {
				pay = hours * 8350;
				System.out.println("�ӱ��� "+pay+"�� �Դϴ�.");
			}
			else {
				System.out.println("�ð��� �߸� �ԷµǾ����ϴ�.");
			}
		input.close();
	}
}