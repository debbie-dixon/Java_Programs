 class Student {
	int studentID = 101;
	String name = "John";
	int age = 15;
	String gender = "Male";
	
	
	public void study (){
		System.out.printf("Student ID is: %d%n", studentID);
		System.out.printf("Student name is: %s%n", name);
		System.out.printf("Student age is: %d%n", age);
		System.out.printf("Student gender is: %s%n", gender);
		System.out.println("I am learning Java");
		
	}
}

	public class DemoStudent {
		public static void main (String args[]) {
			
			Student student = new Student(System.in);
			student.study();
		}
	}
