package taskFunction;

public class UseStudent {
	public static void main(String[] args) {
		Student stud=new Student();
		System.out.println(stud.total(98, 78, 100, 99,56));
		System.out.println(stud.average(100, 90, 87, 67, 89));
		stud.display(100, 78, 89);
	}

}