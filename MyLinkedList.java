public class MyLinkedList<T> {
    private Node<T> head = null, tail = null;
    private int size = 0;

    //Getter for header or start of linked list
    public Node<T> GetHead() {
        return head;
    }

    //Getter for tail of end of linked list
    public Node<T> GetTail() {
        return tail;
    }

    public void AddFront(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    /**
     * Adds a new node to the end of the LinkedList
     */
    public void Append(T data) {

        if (head == null) {
            // Node<T> newNode = new Node<T>(data); //this would be the logic since the arraylist is empty
            // size++;
            // head = newNode;
            AddFront(data); //however we can reuse this logic because it much cleaner and clearer
            return;
        }
        Node<T> currentNode = head;

        // while (currentNode.next != null) {
        //     currentNode = currentNode.next;
        // }

        // once we have our current last node
        Node<T> newNode = new Node<T>(data); // create the new node and ensure it's next is null
        tail.next = newNode; // set the next of the old last node equal to the new node
        tail = newNode;
        size++;
    }
    
    // go to the element prior to where we want to insert our element
    public void Insert(int index, T data) {

        //they are asking to add at the last element
        if (index == size) {
            Append(data);
        }

        if(index < 0 || index > size - 1)  {
            return;
        }

        Node<T> currentNode = head;

        for (int i = 0; i < index - 1; i++){
            currentNode = currentNode.next;
        }

        Node<T> newNode = new Node<T>(data, currentNode.next);
        currentNode.next = newNode;
    }

    @Override
    public String toString() {
        Node<T> currentNode = head;
        String returnString = "";

        while (currentNode != null) {
            returnString += " " + currentNode.data.toString();
            currentNode = currentNode.next;
        }

        return returnString;
    }


    public void DeleteFront() {
        if (head == tail) {
            tail = null;
        }
        head = head.next;
        size--;
    }

    public void DeleteBack() {
        Node<T> currentNode = head;
        while(currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        //currentNode = null;
        System.out.println(currentNode.data);
        currentNode.next = null;
        tail = currentNode;
        size--;
    }

    /**
     * This will find the first instance of matching data and delete it
     * @param data the data of type T whose node we want to delete
     */
    public void DeleteNodeBasedOnValue(T data) {

        if(head == null) {
            return;
        }
        Node<T> currentNode = head;
        
        if(currentNode.data == data) {
            DeleteFront();
            return;
        }

        if (currentNode.next == null) {
            return;
        }

        while (currentNode.next.data != data) {
            currentNode = currentNode.next;
            if(currentNode.next == null)
                return;
        }
        System.out.println(currentNode.data); //shows which pointer we are looking at
        currentNode.next = currentNode.next.next;
        if (currentNode.next == null) {
            tail = currentNode;
        }
        size--;

    }
    
    public int GetSize() {
        return size;
    }

    public boolean IsEmpty() {
        return head == null;
        }
    }

