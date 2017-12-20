package implementations;

import interfaces.MyMap;

public class MyHashMap implements MyMap {

	/* (non-Javadoc)
	 * @see interfaces.MyMap#getMyHashCode(java.lang.Object)
	 */
	@Override
	public int getMyHashCode(Object o) {
		
		return o.hashCode();

	}

}
