class InheritanceStudent extends InheritancePerson{ // �ڽ� Ŭ���� -> class Ŭ������ extends �θ� Ŭ������
	public InheritanceStudent(String a, int b)
	{
		super(a,b);
		this.job = "�л�";
}

	public void Behavior() {
		System.out.println(name + " "+age+"�� " + job+ " �ൿ: ������..");
	}
	}