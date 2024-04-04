import java.util.Arrays;
import java.util.ArrayList;

/**
 * Program
 */

public class Program {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4};
        int[] arr1 = new int[3]; //can specify how large the array is by initializing it like this
        //System.out.println(arr.toString()); //gives location in memory
        System.out.println(Arrays.toString(arr)); //arrays library from java.util.Arrays
        //System.out.println(Arrays.toString(arr1)); //shows initialized array has values of 0
        
        //Create an ArrayList object, HAVE to use wrapper class since int is a primitive data type. 
        //Wrapper class makes a custom data type like 'String' (collection of chars as an object) so its now an object 
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(1);
        arrList.add(3);
        arrList.add(4);

        ArrayList<Integer> arrList1 = new ArrayList<Integer>(arrList);// Line 27 note here
        arrList1.add(5);
        arrList1.add(10);
        // arrList.addAll(arrList); or we can pass the arrList in as an argument to arrList1 see above
        System.out.println(arrList1.toString());

        MyArrayList<Integer> myFirstList = new MyArrayList<Integer>();
        myFirstList.AddEnd(3);
        myFirstList.AddEnd(7);
        myFirstList.AddEnd(1);
       //myFirstList.Print();
        myFirstList.AddStart(5);
       //myFirstList.Print();
        myFirstList.AddAtIndex(300, 2);
        //myFirstList.Print();
        myFirstList.AddAtIndex(800, -1);
        //myFirstList.Print();
        myFirstList.AddAtIndex(900, 50);
        myFirstList.Print();
        System.out.println("Is array empty: " + myFirstList.IsEmpty()); //check if empty with elements in it
        System.out.println("Size: " + myFirstList.Size()); //check size with elements in it
        //System.out.println(myFirstList.GetElementAtIndex(4));
        
        //try catch practice to see error handling out of bounds with the array
        try {
        myFirstList.DeleteAtIndex(3); //try -1 to see error handling
        myFirstList.Print();
        myFirstList.DeleteAtStart();
        myFirstList.Print();
        myFirstList.DeleteAtEnd();
        myFirstList.Print();
    } catch(IndexOutOfBoundsException indexOutOfBoundsException) {
        System.out.println(indexOutOfBoundsException);
    }

        myFirstList.ClearAll();
        System.out.println("Is array empty: " + myFirstList.IsEmpty()); //check if it is empty after clearing elements
        System.out.println("Size: " + myFirstList.Size()); //check size after removal

        //Implementing the previous written code to use the generic code now 
        //to make an array with Strings instead of just ints. Pretty nifty!!
        MyArrayList<String> myFirstStringList = new MyArrayList<String>();
        myFirstStringList.AddStart("Hello");
        myFirstStringList.AddAtIndex("Beautiful", 1);
        myFirstStringList.AddEnd("World!");
        myFirstStringList.Print();


        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.AddFront("World!");
        myLinkedList.AddFront("Hello");
        myLinkedList.Append("Dog");
        System.out.println(myLinkedList.GetSize());
        System.out.println(myLinkedList);

}
  
}