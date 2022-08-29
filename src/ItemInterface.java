/**
 * An interface that assigns uniquely identifying information to Item objects
 * @author Adam Winders
 */
public interface ItemInterface  {
	
	/*
	 * Task: Sees if there are enough items in inventory to add to cart
	 * @return true if there are greater than, or equal, to 1 in inventory, false if not.
	 */
	public boolean isAvailable();
	
}	// end Iteminterface
