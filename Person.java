import java.util.Set;
import java.util.HashSet;

public class Person
{
      private String name;
      private final Set<Watch> watches;

      public Person()
      {
	  this.name = null;
	  this.watches = new HashSet<Watch>();
      }

      public void addWatch(Watch watch)
      {
	  watches.add(watch);
      }

      public Movie[] getMovies()
      {
	  Set<Movie> movies = new HashSet<>();
	  for (Watch watch : watches)
	  {
	        movies.add(watch.getMovie());
	  }

	  return movies.toArray(new Movie[movies.size()]);
      }

      // Other accessors omitted
}
