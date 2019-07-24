class InheritanceProfessor extends InheritancePerson{ // 자식 클래스 -> class 클래스명 extends 부모 클래스명
	public InheritanceProfessor(String a, int b)
	{
		super(a,b);
		this.job = "교수";
	}
	public void Behavior() {
		System.out.println(name +" " + age + "세 "+job + " 행동: 과제내는중.. ");
	}
}