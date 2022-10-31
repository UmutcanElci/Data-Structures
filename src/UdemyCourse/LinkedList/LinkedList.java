package UdemyCourse.LinkedList;
public class LinkedList{
    
    public static void main(String[] args) {
        /*Linked List is a form of a sequential collection. A Linked list is made up of independent nodes
        that may contain any type of data and each node has reference to thenext node in the link

        In Java, LinkedList can be represented as a class and a Node as a separate class. 
        The LinkedList class contains a reference of Node class type. 
        Each node contains a value and a pointer to the next node in the chain.
        The head pointer points to the first node, and the last element of the list points to null. 
        When the list is empty, the head pointer points to null.

        Node head; // head of list
 
     Linked list Node
    class Node {
        int data;
        Node next;
 
        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) { data = d; }
    }

        Real life example : Train
        Notion!

        Linked List vs Array
        - Elements of Linked list are independent objects
        - Variable size - the size of a linked list is not predefined
        - Random access - accessing an lement is very efficient in arrays
        */
    

    /*
    Types of Linked List
    - Singly Linked List
    - Circular Singly Linked List
    - Doubly Linked List
    - Circular Doubly Linked List 

    Singly Linked List
    - Each node in the list stores a value and reference to the next node 
    - Only stores the phsical reference of the next node 

    Circular Singly Linked List
    - THe last node in case of circular singly linked list reference to hte first node 

    Doubly Linked List
    -THe difference is that we ahve refereces from each node to the prevşous node and to the next node.


    Linked List in Memory
    - We know that arrays are stored in memory contiguously
    - In linked list not stored contiguously but when we created linked list the values created randomly and linked to avaible nodes
    - Each node needs extra memory space for a pointer required to link the modules.
     */

     /*
       Creation of a Singly Linked List

      - Create Head and Tail , Initialize with null
      - Create a blank Node and assing a value to it and reference to null
      - Link Head and Tail with these Node
      */
      SinglyLinkedList lss = new SinglyLinkedList();
      lss.createSinglyLinkedList(5);

      /*
       Insertion to Linked List 
       - At the beginning fo the linked list
       - After a node in the middle of linked list
       - At the end of the linked list
       */
    }

}