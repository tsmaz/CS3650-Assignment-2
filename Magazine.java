public class Magazine implements SaleableItem
{
      public Magazine()
      {
	  // Does nothing currently
      }

      @Override
      public void sellCopy()
      {
	  System.out.println("Selling a magazine.");
      }
}
