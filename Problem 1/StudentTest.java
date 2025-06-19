// StudentTest class by Tony Mazich, CS3560.E01-OU1, Summer 2025
// Assignment 2

public class StudentTest
{
      public static void main(String[] args)
      {
	  // Student 1 will have its fields instantiated by the parameterized constructor
	  Student student_1 = new Student("John", "CS", 3.5);

	  // Student 2 will have its fields instantiated by the no-arg constructor, and then its values properly set by setters
	  Student student_2 = new Student();
	  student_2.setName("Mary Ann");
	  student_2.setMajor("CE");
	  student_2.setGpa(3.3);

	  System.out.println("Student 1 ------\n" + student_1.toString());
	  System.out.println("Student 2 ------\n" + student_2.toString());
      }
}
