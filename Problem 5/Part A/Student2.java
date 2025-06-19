public class Student2
{
      private String name;
      // Making this a final enforces the limitation that a transcript can only be associated with one (and only one) student
      private final Transcript transcript;

      public Student2(String name, String course, double grade)
      {
	  this.name = name;
	  this.transcript = new Transcript(course, grade);
      }

      public Transcript getTranscript()
      {
	  return transcript;
      }

      // Getter and setter for name omitted
}
