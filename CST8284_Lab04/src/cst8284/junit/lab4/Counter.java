package cst8284.junit.lab4;

public class Counter {

	/*
	 * A Counter object stores a count variable
	 * that is >= 0
	 * The counter  can be incremented or decremented
	 * But the stored value should never be negative
	 * It should wrap to zero when it reaches the value Integer.MAX_VALUE
	 */
	 /**
     * Counter value
     */
    private int count;

    /**
     *  Counter with count=0
     */
    public Counter() {
        count = 0;
    }

    /**
     * 
     *
     * @param c  Initial value of count
     */
    public Counter(int c) {
        count = c;
    }

    /**
     *  increments counter value
     *
     * @return new counter value
     */
    public int increment() {
    	return ++count;
   
    }

    /**
     *  decrements counter value
     *
     * @return new counter value
     */
    public int decrement() {
        return --count;
    }

    /**
     * 
     *
     * @return counter value
     */
    public int getCount() {
        return count;
    }

    /**
     * New counter with value equal to the sum of 
     * the 2 counters passed in the parameters
     *
     * @param c counter to add to the current counter
     * @return newly created counter
     */
    public Counter add(Counter c) {
        return new Counter(this.count + c.count);
    }

    /**
     * New counter with value equal to the subtraction of 
     * the 2 counters passed in the parameters
     *
     * @param c counter to subtract from the current counter
     * @return newly created counter
     */
    public Counter sub(Counter c) {
        return new Counter(this.count - c.count);

    }
    
   
  
    /**
     * Returns a string representation of this counter.
     *
     * @return a string representation of this counter
     */
    public String toString() {
        return "Count is " + count ;
    } 
  

}
