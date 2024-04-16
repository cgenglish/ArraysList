public class MyLinkedStack<T> {
    private Node<T> head = null;


    /**
     * Will create a new Node and add it to the top of the stack
     * @param data the data which should be populated into the Node
     */

    public void Push(T data) {
        Node<T> newNode = new Node<T>(data, head);
        head = newNode;

    }

    /**
     * Allows for retrieving the top item on the stack
     * @return the top item's dat (or head)
     */
    public T Peek() {
        if(head == null) {
            return null;
        }
        return head.data;
    }

    /**
     * Will remove the top item from the list and return it's data
     * @return the data from the element that was removed, will return null if list is empty
     */
    public T Pop() {
        if(head == null) {
            return null;
        }

        T topElementData = head.data;
        head = head.next;
        return topElementData;
    }

    /**
     * Checks if the stack is empty
     * @return returns true if empty, false otherwise
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Clears the entire list at one time
     */
    public void Clear() {
        head = null;
    }
}
