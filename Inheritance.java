//142,143p 상속 예제
class Inheritance {
	public static void main(String[] args) {
		InheritanceStudent student = new InheritanceStudent("문주영", 24);
		InheritanceProfessor professor = new InheritanceProfessor("최세지", 42);
		
		student.Behavior();
		professor.Behavior();
	}
}
