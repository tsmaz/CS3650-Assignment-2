public class Professor extends Employee
{
      private String field;

      public Professor(String name, String field, int hours)
      {
	  super(name, hours);
	  this.field = field;
      }

      @Override
      public double calculateSalary()
      {
	  return getHours() * 30;
      }
}
