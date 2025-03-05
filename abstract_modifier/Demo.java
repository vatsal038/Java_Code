package abstract_modifier;

class Student {
	private int id;
	private String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class Demo{
	public static void main(String[] args) {
		Student s = new Student(1,"rahul");
		s.display();
	}
}

