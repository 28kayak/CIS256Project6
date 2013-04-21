class Heap <E>
{
	
	private E[] elements;//Array that holds heap elements 
	private int lastIndex;//index of last element in heap
	private int maxIndex;//index of last position in array 

	/**
	 * [Heap Constructor]
	 * @param  maxSize [Size of Array]
	 * @return         [description]
	 */
	public Heap(int maxSize)
	{
		elements = (E()) new Object[maxSize];
		lastIndex = -1;
		maxIndex = maxSize -1;

	}
	/**
	 * [inEmpty determin whether this heap is empty]
	 * @return [if lastIndex remains -1, return true, that is, empty]
	 */
	public boolean inEmpty()
	{
		return (lastIndex == -1);
	}
	/**
	 * [isFull Determine whether this heap is full]
	 * @return [if lastIndex recheas to maxIndex, return true, that means full]
	 */
	public boolean isFull()
	{
		return (lastIndex == maxIndex);
	}
	/**
	 * [add Adds item to this heap 
	 * 	throw  PriQOverflowException if the heap is already full]
	 * @param item [added element ]
	 */
	public void add(E item)
	{
		int where = 0;
		if(isFull())
		{//heap is full
			throw new PriQOverflowException("---This Heap is already FULL---");
		}
		else
		{
			for(int i = 0; i <= lastIndex; i++)
			{
				if(elements[i] < items)
				{ 
					where = i;
					while(i <= lastIndex)
					{
						elements[i + 1] = elements[i];
						i++;
					}
					elements[i] = item;
				}
				else 
				{
					
				}
			}
		}
	}
	/**
	 * [remove Removes the root element from the heap]
	 * @return [description]
	 * @throws PriQUnderflowException [if heap is empty]
	 */
	public E remove() throws PriQUnderflowException
	{
		//complete this method 
		return null;
	}
	/**
	 * [toString returns a string of all the heap element]
	 * @return [string of heap]
	 */
	public String toString()
	{
		String theHeap = new String ("the heap is \n");
		for(int index = 0; index <= lastIndex; index++)
		{
			theHeap = theHeap + index + ". " + elements[index] + "\n";
		}
		return theHeap;

	}
}