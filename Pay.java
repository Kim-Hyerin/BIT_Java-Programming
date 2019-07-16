import java.util.Scanner;
//74p IF 문_1(임금 계산 프로그램)
public class Pay {

	public static void main(String[] args) {
		int pay;
		int hours;
		Scanner input=new Scanner(System.in);
		
		System.out.println("시간을 입력하세요 : ");
		hours=input.nextInt();
			if(hours>0) {
				pay = hours * 8350;
				System.out.println("임금은 "+pay+"원 입니다.");
			}
			else {
				System.out.println("시간이 잘못 입력되었습니다.");
			}
		input.close();
	}
}