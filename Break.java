//96p break문
public class Break {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum>100)
				break;
			i++;
			sum +=i;
		}
		System.out.println("i = : "+i);
		System.out.println("sum = : "+sum);
	}
}
// break문이 수행되면 while문을 벗어난다.