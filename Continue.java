//96p continue문
public class Continue {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
		{
			if(i%3==0)
				continue;
			System.out.println("i");
		}
	}
}
//조건식이 true가 되어 continue문이 수행되면 반복문의 끝으로 이동한다.