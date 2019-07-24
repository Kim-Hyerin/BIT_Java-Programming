class InheritanceStudent extends InheritancePerson{ // 자식 클래스 -> class 클래스명 extends 부모 클래스명
	public InheritanceStudent(String a, int b)
	{
		super(a,b);
		this.job = "학생";
}

	public void Behavior() {
		System.out.println(name + " "+age+"세 " + job+ " 행동: 과제중..");
	}
	}