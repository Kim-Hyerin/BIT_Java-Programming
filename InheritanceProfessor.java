class InheritanceProfessor extends InheritancePerson{ // �ڽ� Ŭ���� -> class Ŭ������ extends �θ� Ŭ������
	public InheritanceProfessor(String a, int b)
	{
		super(a,b);
		this.job = "����";
	}
	public void Behavior() {
		System.out.println(name +" " + age + "�� "+job + " �ൿ: ����������.. ");
	}
}