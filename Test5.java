//59p 논리연산자 (return type이 Boolean형인 조건식만 허용)
public class Test5 {

	public static void main(String[] args) {
		int x=2;
		int y=2;
		System.out.println(x==y); //true
		System.out.println(x<=y); //true
		System.out.println(x>y); //false
		System.out.println((x==2)&&(y==2)); //true, AND연산
		System.out.println((x==2)&&(y!=2)); //false, AND연산, NOT연산
		System.out.println((x==2)||(y!=2)); //true, OR연산, NOT연산
		System.out.println((x==5)&&(y!=2)); //false, AND연산, NOT연산
	}
}