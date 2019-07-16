import java.util.Scanner;
//78p 연속적인 IF문(A~F등급 출력 프로그램)
public class Grade {

	public static void main(String[] args) {
		int grade;
		char s1, s2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하시오 : ");
		grade = input.nextInt();
		
		if(grade>=90)
			s1 = 'A'; // 90~ A등급
		else if(grade>=80)
			s1 = 'B'; // 80~89 B등급
		else if(grade>=70)
			s1 = 'C'; // 70~79 C등급
		else if(grade>=60)
			s1 = 'D'; // 60~69 D등급
		else
			s1 = 'F'; // ~ 60미만 F등급
		
		//A~D등급의 +,0 출력, F는 제외
		if(grade<60)
			s2 = ' ';
		else if(grade%10>=5 || grade/100==1)
			s2 = '+';
		else
			s2 = '0';
		
		System.out.println("점수 : "+grade);
		System.out.println("등급 : "+s1+s2);
		
		input.close();
	}	
}