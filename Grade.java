import java.util.Scanner;
//78p �������� IF��(A~F��� ��� ���α׷�)
public class Grade {

	public static void main(String[] args) {
		int grade;
		char s1, s2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ� : ");
		grade = input.nextInt();
		
		if(grade>=90)
			s1 = 'A'; // 90~ A���
		else if(grade>=80)
			s1 = 'B'; // 80~89 B���
		else if(grade>=70)
			s1 = 'C'; // 70~79 C���
		else if(grade>=60)
			s1 = 'D'; // 60~69 D���
		else
			s1 = 'F'; // ~ 60�̸� F���
		
		//A~D����� +,0 ���, F�� ����
		if(grade<60)
			s2 = ' ';
		else if(grade%10>=5 || grade/100==1)
			s2 = '+';
		else
			s2 = '0';
		
		System.out.println("���� : "+grade);
		System.out.println("��� : "+s1+s2);
		
		input.close();
	}	
}