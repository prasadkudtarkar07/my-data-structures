package implementations;

import interfaces.MyList;

/**
 * @author Prasad
 * @since 16 Dec, 2017
 *
 */
public class MyArrayList implements MyList {
	
	private int size;						//size of MyArrayList
	private int capacity;					//capacity of MyArrayList
	private Object[] myArrayListOfObjects;	//array used to save elements in MyArrayList
	private String classType;				//type of elements in MyArrayList
	
	public MyArrayList(Object o) {
		
		int size = 0;
		int capacity = 10;
		this.classType = o.getClass().toString();
		Object[] myArrayListOfObjects = new Object[capacity];
		this.size = size;
		this.capacity = capacity;
		this.setMyArrayListOfObjects(myArrayListOfObjects);
		
	}

	/* (non-Javadoc)
	 * @see interfaces.MyList#add(java.lang.Object)
	 */
	@Override
	public boolean add(Object o) {
		
		if(this.capacity > this.size && o.getClass().toString().equals(this.classType)) {
			
			myArrayListOfObjects[this.size] = o;
			this.size++;
			return true;
			
		} else if(this.capacity == this.size && o.getClass().toString().equals(this.classType)) {
			
			this.capacity *= 2;
			copyToNewMyArrayListOfObjects(this.myArrayListOfObjects, this.capacity);
			add(o);
			
		}
		
		return false;
	
	}

	/**
	 * @author Prasad
	 * @since 17 Dec, 2017
	 * @param myArrayListOfObjectsTemp
	 * @param capacityTemp
	 * method to copy the array to new array of twice capacity
	 */
	private void copyToNewMyArrayListOfObjects(Object[] myArrayListOfObjectsTemp, int capacityTemp) {

		Object[] myArrayListOfObjectsNew = new Object[capacityTemp];
		for(int i=0; i<myArrayListOfObjectsTemp.length; i++) {
			
			myArrayListOfObjectsNew[i] = myArrayListOfObjectsTemp[i];
			
		}
		
		setMyArrayListOfObjects(myArrayListOfObjectsNew);
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Object[] getMyArrayListOfObjects() {
		return myArrayListOfObjects;
	}

	public void setMyArrayListOfObjects(Object[] myArrayListOfObjects) {
		this.myArrayListOfObjects = myArrayListOfObjects;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

}