import java.util.Set;
import java.util.HashSet;

public class Movie
{
     private String name;
     private String genre;
     private final Set<Watch> watches;

     public Movie()
     {
	 this.name = null;
	 this.genre = null;
	 this.watches = new HashSet<Watch>();
     }

     public void addWatch(Watch watch)
     {
	 watches.add(watch);
     }

     public Person[] getPersons()
     {
	 Set<Person> persons = new HashSet<>();
	 for (Watch watch : watches)
	 {
	       persons.add(watch.getPerson());
	 }

	 return persons.toArray(new Person[persons.size()]);
     }

}
