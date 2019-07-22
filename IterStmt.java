//94p 반복문
public class IterStmt {
	
	public static void main(String[] args) {
	int n = 10, sum = 0;
	//for문 (초기식,조건식,증감식)
	for(int i=1; i<=n; i++) {
		sum += i;
	}
	//while문 (true일 경우 실행하는 진입 조건형 루프)
	int i;
	i = 1;
	while(i <=n)
	{
		sum +=i;
		i++;
	}
	//do-while문 (false가 될 때까지 실행하는 탈출 조건형 루프)
	i=1;
	do
	{
		sum +=i;
		i++;
	}
	while (i<=n);
}
}
