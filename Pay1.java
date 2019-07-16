//80p 중첩 IF문(88점에 대하여 b+,b-,b0등급 출력)
public class Pay1 {

	public static void main(String[] args) {
		int score=88;
		if(score>80 && score<=90) {
			if(score>87)
				System.out.println("B+");
			else if(score<84)
				System.out.println("B-");
			else
				System.out.println("B0");
		}
	}
}