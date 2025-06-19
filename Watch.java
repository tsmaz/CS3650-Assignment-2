public class Watch
{
      private int rating;
      private Person person;
      private Movie movie;

      public Watch(int rating)
      {
	  this.rating = 0;
      }

      public Movie getMovie()
      {
	  return movie;
      }

      public Person getPerson()
      {
	  return person;
      }

      // Other accessors omitted
}
