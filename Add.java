import java.util.Scanner; // Scanner Ŭ���� ����
public class Add { //

	public static void main(String[] args) { // main �޼ҵ忡�� ���� ����
		Scanner input = new Scanner(System.in); // ����ڷκ��� �Է��� �ޱ� ���ؼ� Scanner��ü ����
		int x=5; // �������� (����:ù ��° ���ڸ� ����)
		int y=0; // �������� (����:�� ��° ���ڸ� ����)
		int sum; //�������� (����:���� ��Ÿ��)
		
		System.out.println("ù ��° ���ڸ� �Է��Ͻÿ� : "); // �Է� �ȳ� ���
		x = input.nextInt(); // ù ��° ���ڸ� ����
		
		System.out.println("�� ��° ���ڸ� �Է��Ͻÿ� : "); // �Է� �ȳ� ���
		y = input.nextInt(); // �� ��° ���ڸ� ����

		sum = x/y; // �������� ���
		System.out.println(sum);
		System.out.println("���� �� = " + (x/y));
		input.close(); // Scanner�� ����
	} // �޼ҵ��� ��
} // Ŭ������ ��
