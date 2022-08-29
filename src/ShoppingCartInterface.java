/**
 * An interface that assigns uniquely identifying information to Item objects
 * @author Adam Winders
 */
public interface ShoppingCartInterface <T> {
	/*
	 * Task: Gets the current number of entries in the shopping cart.
	 * @return the integer number of entries in the shopping cart.
	 */
	public int getCurrentSize();
	
	/*
	 * Task: Sees whether the shopping cart is empty.
	 * @return true if the bag is empty, or false if not.
	 */
	public boolean isEmpty();
	
	/*
	 * Task: Adds a new entry to the bag.
	 * @param anEntry the entry to be added
	 * @return true if the addition is successful, or false if not.
	 */
	public boolean add(T anEntry);
	
	/*
	 * Task: Removes one unspecified entry from the shopping cart.
	 * @return either the removed entry, if the removal was successful or null.
	 */
	public T remove();
	
	/*
	 * Task: Removes one occurrence of a particular entry from the bag, if possible.
	 * @param enEntry the entry to be removed
	 * @return true, if the removal was successful, or false if not.
	 */
	public boolean remove (T anEntry);
	
	/*
	 * Task: Removes all entries from the shopping cart.
	 */
	public void clear();
	
	/*
	 * Task: Counts number of times a given entry appears
	 * @param anEntry the entry to locate
	 * @return true if the shopping cart contains anEntry, or false if null.
	 */
	public boolean contains (T anEntry);
	
	/*
	 * Retrieves all entries that are in this shopping cart
	 * @return a newly allocated array of all the entries in the shopping cart.
	 * Note: if the bag is empty, the returned array is empty.
	 */
	public T[] toArray ();
	
}	// end interface
