//80p ��ø IF��(88���� ���Ͽ� b+,b-,b0��� ���)
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