import java.util.Arrays;

public class MyArrayList {
    private int[] elements;
    private int size;
    private final int CAPACITY = 10;
    
    public MyArrayList() {
        //create an array with an initial size of 10
        elements = new int[CAPACITY]; //initial capacity
        size = 0; // keeps track of the number of elements that actually exist in our array
        // System.out.println(elements.length); 
        // System.out.println(Arrays.toString(elements)); used to demonstrate size
    }

    public void AddStart(int elementToAdd) {
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
    public void AddEnd(int elementToAdd) {
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
            int[] newElements = new int[elements.length + CAPACITY];
            // int[] newElements = new int[elements.length * 2]; could also do this to make it more efficient

            //coping each element from previous array to new array with for loop
            for(int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            //replacing the new array with the previous assignment name
            elements = newElements;
        }
    }

    public void AddAtIndex(int elementToAdd, int indexToAddAt) {
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
     * Returns element at input index of given ArrayList. If index is outside bounds, returns 
     * last element of ArrayList
     * @param index
     * @return
     */
    public int GetElementAtIndex(int index) {
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
}
