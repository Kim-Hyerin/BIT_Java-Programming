//59p �������� (return type�� Boolean���� ���ǽĸ� ���)
public class Test5 {

	public static void main(String[] args) {
		int x=2;
		int y=2;
		System.out.println(x==y); //true
		System.out.println(x<=y); //true
		System.out.println(x>y); //false
		System.out.println((x==2)&&(y==2)); //true, AND����
		System.out.println((x==2)&&(y!=2)); //false, AND����, NOT����
		System.out.println((x==2)||(y!=2)); //true, OR����, NOT����
		System.out.println((x==5)&&(y!=2)); //false, AND����, NOT����
	}
}