//62p 비트, 조건연산자(2진수 표현)
public class Test6 {

	public static void main(String[] args) {
		int x=4;
		int y=8;
		System.out.println(x&y); //AND연산, 양쪽 모두 1이면 1, 그 외 0
		System.out.println(x|y); //OR연산, 한쪽이 1이면 1, 그 외 0
		System.out.println(x^y); //XOR연산, 값이 서로 다를때 1, 같을때 0
		System.out.println(~x); //NOT연산, 0->1, 1->0으로 부정연산 수행
		System.out.println(x<<5); //왼쪽 이동, x를 왼쪽으로 5번 이동
		System.out.println(y>>2); //오른쪽 이동, y를 오른쪽으로 2번 이동
		int bignum = (x>y) ? x:y; //조건연산자(삼항연산), Condition(조건식) ? Expression1 : Expression2
		System.out.println(bignum); //condition이 true일경우 Expression1 리턴, false일경우 Expression2 리턴
	}
}