public class MyLinkedQueue<T> {
    private Node<T> head, tail;
    private int size = 0;

    public MyLinkedQueue() {
        head = null;
        tail = null;
        
    }

     //Getter for header or start of linked queue
     public Node<T> GetHead() {
        return head;
    }

    //Getter for tail of end of linked queue
    public Node<T> GetTail() {
        return tail;
    }
    
    //pass in our data we want to set the node equal to
    public void Enqueue(T data) {
        //instantiate the node
        Node<T> newNode = new Node<T>(data);
        //check if tail is null and head is null, then list is empty
        if (tail == null && head == null) {
            head = tail = newNode;
            return; //bail out do not pass go 
        }
        //update our tail.next
        tail.next = newNode;
        //set the tail equal to the new node
        tail = newNode;
        size++;
    }

    public void Dequeue() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

      head = head.next;
      size--;
    }

    public T Peek() {
        if (head == null) 
            return null;
        return head.data;
    }

    public T GetBack() {
        if (tail == null) 
            return null;
        return tail.data;
    }

    public int Length() {
        return size;
    }
}
