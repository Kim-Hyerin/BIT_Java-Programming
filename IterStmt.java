//94p �ݺ���
public class IterStmt {
	
	public static void main(String[] args) {
	int n = 10, sum = 0;
	//for�� (�ʱ��,���ǽ�,������)
	for(int i=1; i<=n; i++) {
		sum += i;
	}
	//while�� (true�� ��� �����ϴ� ���� ������ ����)
	int i;
	i = 1;
	while(i <=n)
	{
		sum +=i;
		i++;
	}
	//do-while�� (false�� �� ������ �����ϴ� Ż�� ������ ����)
	i=1;
	do
	{
		sum +=i;
		i++;
	}
	while (i<=n);
}
}
