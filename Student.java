// Student class by Tony Mazich, CS3560.E01-OU1, Summer 2025
// Assignment 2

public class Student
{
      private String name;
      private String major;
      private double gpa;

      public Student()
      {
	  this.name = "None";
	  this.major = "None";
	  this.gpa = 0.0f;
      }

      public Student(String name, String major)
      {
	  this.name = name;
	  this.major = major;
	  this.gpa = 0.0f;
      }

      public Student(String name, String major, double gpa)
      {
	  this.name = name;
	  this.major = major;
	  this.gpa = gpa;
      }

      public String getName()
      {
	  return name;
      }

      public void setName(String name)
      {
	  this.name = name;
      }

      public String getMajor()
      {
	  return major;
      }

      public void setMajor(String major)
      {
	  this.major = major;
      }

      public double getGpa()
      {
	  return gpa;
      }

      public void setGpa(double gpa)
      {
	  this.gpa = gpa;
      }

      @Override
      public String toString()
      {
	  return "Name: " + name + "\nMajor: " + major + "\nGPA: " + gpa;
      }

      @Override
      public boolean equals(Object obj)
      {
	  // If the object we're comparing to is not a Student, we immediately return false
	  if (!(obj instanceof Student))
	  {
	        return false;
	  }

	  Student otherStudent = (Student)obj;

	  return this.name.equals(otherStudent.name) && this.major.equals(otherStudent.major);
      }
}
