public class Ticket implements SaleableItem
{
      public Ticket()
      {
	  // Does nothing currently
      }

      @Override
      public void sellCopy()
      {
	  System.out.println("Selling a ticket.");
      }
}
