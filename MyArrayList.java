import java.util.Arrays;

public class MyArrayList<T> { //T is the standard to use for generalized typing of a program 
    //before we had it used just for ints but can now be used what Object type we want
    private Object[] elements;
    private int size;
    private final int CAPACITY = 10;
    
    public MyArrayList() {
        //create an array with an initial size of 10
        elements = new Object[CAPACITY]; //initial capacity
        size = 0; // keeps track of the number of elements that actually exist in our array
        // System.out.println(elements.length); 
        // System.out.println(Arrays.toString(elements)); used to demonstrate size
    }

    public void AddStart(T elementToAdd) {
        EnsureCapacity();
        for(int i = size; i >= 0; i--) {
            elements[i + 1] = elements[i];
        }
        //need to move the existing elements
        elements[0] = elementToAdd;
        size++;
    }
/**
 * Want to add element to end, first need to check capacity
 * then can add elementToAdd at the index of element[size]; then increment size
 * @param elementToAdd
 */
    public void AddEnd(T elementToAdd) {
        //check the capacity
        EnsureCapacity();
        //want to add element at end so can add what is size of the array
        elements[size] = elementToAdd; //could also write: elements[size++] = elementToAdd
        size++;
    }

    /**
     * Checks the capacity of our elements array 
     * and increases its capacity if there isn't enough space 
     */
    private void EnsureCapacity() {
        if(size == elements.length) {
            //increase capacity/size of the array
            Object[] newElements = new Object[elements.length + CAPACITY];
            // int[] newElements = new int[elements.length * 2]; could also do this to make it more efficient

            //coping each element from previous array to new array with for loop
            for(int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            //replacing the new array with the previous assignment name
            elements = newElements;
        }
    }

    public void AddAtIndex(T elementToAdd, int indexToAddAt) {
        //ensures that indexToAddAt is within bounds 
        if(indexToAddAt > size || indexToAddAt < 0) {
            //add to the end if the index the user wants to add at is invalid 
                AddEnd(elementToAdd);
            //if within bounds ensure capacity and work back to desired index, then insert elementToAdd
        } else {
            EnsureCapacity();
            for(int i = size; i >= indexToAddAt; i--) {
                elements[i + 1] = elements[i];
            }
            elements[indexToAddAt] = elementToAdd;
            size++;
        }
        
    }

    /**
     * Deletes an element from the array at index input as parameter
     * @param indexOfValueToDelete
     */
    public void DeleteAtIndex(int indexOfValueToDelete) {
        if(indexOfValueToDelete < 0 || indexOfValueToDelete >= size) {
            throw new IndexOutOfBoundsException("Index " + indexOfValueToDelete + " is invalid for ArrayList of size " + size);
        }
        //moving all elements right of the selected index, and shifting each of them left one index
        for(int i = indexOfValueToDelete; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        //decrement size because we deleted an item and want size to be 1 less
        size--;
    }

    //reusing DeleteAtIndex to be resourceful and just remove at index 0
    public void DeleteAtStart(){
        DeleteAtIndex(0);
    }

    //reusing DeleteAtIndex to be resourceful and just remove at index size-1
    public void DeleteAtEnd(){
        DeleteAtIndex(size - 1);
    }

    public void ClearAll(){
        for(int i = 0; i < size; i++ ) {
            elements[i] = null;
        }
        size = 0;
    }

    /**
     * Returns element at input index of given ArrayList. If index is outside bounds, returns 
     * last element of ArrayList
     * @param index
     * @return
     */
    public Object GetElementAtIndex(int index) {
        if(index >= size || index < 0) {
            return elements[size - 1];
        }
        return elements[index];
    }
/**
 * Loops through each element of the array and prints with a space between element
 */
    public void Print() {
        for(int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public boolean IsEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int Size() {
        return size;
    }

}
