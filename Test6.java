//62p ��Ʈ, ���ǿ�����(2���� ǥ��)
public class Test6 {

	public static void main(String[] args) {
		int x=4;
		int y=8;
		System.out.println(x&y); //AND����, ���� ��� 1�̸� 1, �� �� 0
		System.out.println(x|y); //OR����, ������ 1�̸� 1, �� �� 0
		System.out.println(x^y); //XOR����, ���� ���� �ٸ��� 1, ������ 0
		System.out.println(~x); //NOT����, 0->1, 1->0���� �������� ����
		System.out.println(x<<5); //���� �̵�, x�� �������� 5�� �̵�
		System.out.println(y>>2); //������ �̵�, y�� ���������� 2�� �̵�
		int bignum = (x>y) ? x:y; //���ǿ�����(���׿���), Condition(���ǽ�) ? Expression1 : Expression2
		System.out.println(bignum); //condition�� true�ϰ�� Expression1 ����, false�ϰ�� Expression2 ����
	}
}