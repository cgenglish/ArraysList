import java.util.ArrayList;
import java.util.Arrays;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.AddFront("World!");
        // Add a new Node here
        myLinkedList.AddFront("Hello");
        myLinkedList.AddFront("This is me");
        myLinkedList.AddFront("Hi");
        myLinkedList.Append("Dog");
        System.out.println(myLinkedList.GetSize());
        System.out.println(myLinkedList);
    }
    
}