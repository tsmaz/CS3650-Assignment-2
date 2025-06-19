import java.util.Set;
import java.util.HashSet;

public class Course
{
      private int code;
      private Set<Book> bookList;

      public Course(int code)
      {
            this.code = code;
            this.bookList = new HashSet<Book>();
      }

      // Accessors omitted
}
