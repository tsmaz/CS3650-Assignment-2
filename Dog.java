public class Dog
{
      private String breed;
      private String name;
      private Paw[] paws;

      public Dog()
      {
	  this.breed = null;
	  this.name = null;
	  this.paws = new Paw[4];

	  for (int i = 0; i < 4; i++)
	  {
	        paws[i] = new Paw(i + 1);
	  }
      }

      // Accessors omitted
}
