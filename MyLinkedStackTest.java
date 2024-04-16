import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyLinkedStackTest {
    @Test
    public void Push_AddMultipleNodes_ShouldSuccessfullyAdd() {
        //Arrange
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();
        //Act
        myLinkedStack.Push("Hello");
        myLinkedStack.Push("World");
        myLinkedStack.Push("of Warcraft");

        //Assert
        assertEquals("of Warcraft", myLinkedStack.Peek());
    }

    @Test
    public void Push_AddNodeWhenListIsEmpty_ShouldSuccessfullyAdd() {
        //Arrange
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();

        //Act
        myLinkedStack.Push("of Warcraft");

        //Assert
        assertEquals("of Warcraft", myLinkedStack.Peek());
    }

    @Test
    public void Pop_WhenListIsEmpty_ShouldReturnNull() {
        //Arrange
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();
        
        //Act
        

        //Assert
        assertEquals(null, myLinkedStack.Pop());
    }

    @Test
    public void Pop_WhenListHasValues_ShouldReturnElementThatIsRemoved() {
        //Arrange
        String expectedString = "Hello";
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();
        myLinkedStack.Push(expectedString);

        //Act
        String removedElement = myLinkedStack.Pop();

        //Assert
        assertEquals(expectedString, removedElement);
        assertEquals(myLinkedStack.Peek(), null);
    }

    @Test
    public void IsEmpty_WhenListIsEmpty_ShouldReturnTrue() {
        //Arrange
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();
        

        //Act
        boolean isEmpty = myLinkedStack.isEmpty();

        //Assert
        assertEquals(true, isEmpty);
        assertEquals(myLinkedStack.Peek(), null);
        assertTrue(isEmpty);
    }

    @Test
    public void IsEmpty_WhenListHasValues_ShouldReturnFalse() {
        //Arrange
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();
        myLinkedStack.Push("Hello");
        myLinkedStack.Push("World");

        //Act
        boolean isEmpty = myLinkedStack.isEmpty();

        //Assert
        assertEquals(myLinkedStack.Peek(), "World");
        assertFalse(isEmpty);
    }

    @Test
    public void Clear_WhenListHasValues_ShouldReturnEmptyList() {
        //Arrange
        
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();
        myLinkedStack.Push("Hello");
        myLinkedStack.Push("Hello1");
        myLinkedStack.Push("Hello2");
        myLinkedStack.Push("Hello3");

        //Act
        myLinkedStack.Clear();
        boolean isEmpty = myLinkedStack.isEmpty();

        //Assert
        assertEquals(myLinkedStack.Peek(), null);
        assertTrue(isEmpty);
    }
}
