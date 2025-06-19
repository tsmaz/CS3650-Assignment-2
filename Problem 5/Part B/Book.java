public class Book
{
      private String name;
      private String author;
      private Course course;

      public Book()
      {
	  this.name = null;
	  this.author = null;
	  this.course = null;
      }

      public void setName(String name)
      {
	  this.name = name;
      }

      public void setAuthor(String authorName)
      {
	  this.author = authorName;
      }

      public String getName()
      {
	  return this.name;
      }

      public void setCourse(Course course)
      {
	  this.course = course;
      }

      // Other accessors omitted
}
