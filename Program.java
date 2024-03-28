import java.util.Arrays;
import java.util.ArrayList;

/**
 * Program
 */

public class Program {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4};
        int[] arr1 = new int[3]; //can specify how large the array is by initializing it like this
        System.out.println(arr.toString()); //gives location in memory
        System.out.println(Arrays.toString(arr)); //arrays library from java.util.Arrays
        System.out.println(Arrays.toString(arr1)); //shows initialized array has values of 0
        
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

        MyArrayList myFirstList = new MyArrayList();
        myFirstList.AddEnd(3);
        myFirstList.AddEnd(7);
        myFirstList.AddEnd(1);
        myFirstList.Print();
        myFirstList.AddStart(5);
        myFirstList.Print();
        myFirstList.AddAtIndex(300, 2);
        myFirstList.Print();
        myFirstList.AddAtIndex(800, -1);
        myFirstList.Print();
        myFirstList.AddAtIndex(900, 50);
        myFirstList.Print();
        System.out.println(myFirstList.GetElementAtIndex(4));
        
    }

    
}