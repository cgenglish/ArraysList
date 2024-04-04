public class MyLinkedList<T> {
    private Node<T> head = null;
    private int size = 0;

    public void AddFront(T data) {
        Node<T> newNode = new Node<T>(data);
        if(head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * Adds a new node to the end of the LinkedList
     */
    public void Append(T data){
        Node<T> currentNode = head;
        
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        //once we have our current last node
        Node<T> newNode = new Node<T>(data); //create the new node and ensure it's next is null
        currentNode.next = newNode; // set the next of the old last node equal to the new node
    }

        @Override
        public String toString() {
            Node<T> currentNode = head;
            String returnString = "";
            
            while(currentNode != null){
                returnString += currentNode.data.toString();
                currentNode = currentNode.next;
            }
            return returnString;
        }

        public int GetSize() {
            return size;
        }

        public void Insert(int index) {
            Node<T> currentNode = head;
            int currentIndex = 0;
            for (int i = 0; i < index; i++) {
                
            }
        }
    
    }

