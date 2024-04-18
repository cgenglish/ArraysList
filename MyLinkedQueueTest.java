import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyLinkedQueueTest {
    @Test
    public void Enqueue_EmptyQueue_ShouldAdd() {
        //Arrange
        MyLinkedQueue<String> myLinkedQueue = new MyLinkedQueue<String>();
        
        //Act
        myLinkedQueue.Enqueue("Hello");

        //Assert
        assertEquals(myLinkedQueue.GetHead().data, "Hello");
        assertEquals(myLinkedQueue.GetTail().data, "Hello");

    }

    @Test
    public void Enqueue_QueueMultipleTimes_ShouldUpdateHeadTail() {
        String expectedHead = "Hello";
        String expectedTail = "of Warcraft";

          //Arrange
          MyLinkedQueue<String> myLinkedQueue = new MyLinkedQueue<String>();
        
          //Act
          myLinkedQueue.Enqueue("Hello");
          myLinkedQueue.Enqueue("World");
          myLinkedQueue.Enqueue("of Warcraft");
  
          //Assert
          assertEquals(myLinkedQueue.GetHead().data, expectedHead);
          assertEquals(myLinkedQueue.GetTail().data, expectedTail);
    
    }

    @Test
    public void Dequeue_QueueMultipleTimes_ShouldRemoveFrontItem() {
        String expectedHead = "World";
        String expectedTail = "of Warcraft";

          //Arrange
          MyLinkedQueue<String> myLinkedQueue = new MyLinkedQueue<String>();
          myLinkedQueue.Enqueue("Hello");
          myLinkedQueue.Enqueue("World");
          myLinkedQueue.Enqueue("of Warcraft");
        
          //Act
          myLinkedQueue.Dequeue();
  
          //Assert
          assertEquals(myLinkedQueue.GetHead().data, expectedHead);
          assertEquals(myLinkedQueue.GetTail().data, expectedTail);
    
    }

    @Test
    public void Dequeue_QueueHasNoItems_ShouldLeaveHeadAsNull() {
          //Arrange
          MyLinkedQueue<String> myLinkedQueue = new MyLinkedQueue<String>();
        
          //Act
          myLinkedQueue.Dequeue();
  
          //Assert
          assertEquals(myLinkedQueue.GetHead(), null);
          assertEquals(myLinkedQueue.GetTail(), null);
    
    }

    @Test
    public void Dequeue_QueueHasOneItem_ShouldSetHeadAndTailAsNull() {
          //Arrange
          MyLinkedQueue<String> myLinkedQueue = new MyLinkedQueue<String>();
          myLinkedQueue.Enqueue("Hello");
        
          //Act
          myLinkedQueue.Dequeue();
  
          //Assert
          assertEquals(myLinkedQueue.GetHead(), null);
          assertEquals(myLinkedQueue.GetTail(), null);
    
    }

}


