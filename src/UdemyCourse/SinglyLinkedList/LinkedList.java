package UdemyCourse.SinglyLinkedList;
/*
 Linked List is a form of a sequential collection and it does not have to be in order. Like a train we have a engine(head) and the cars(nodes) and there's links to hold the
 cars(Actually called links too) and the end of the cars is the we called tail inside of the cars are values(data)
 */

/*
Types Of Linked List
- Singly Linked List
- Circular Linked List
- Doubly Linked List
- Circular Doubly Linked List
 */

/*
Linked List in Memory
Linked lists is not like the arrays, arrays in memory hold like side by side but in linked list there's random node's and to find them we need to use links
and with links we store there addresses too.
 */
public class LinkedList {

    //Creation Of Singly Linked List
    /*
    First step is Create Head and Tail , initialize with null
    Second Create a blank Node and assign a value to it and reference to null
    Lastly Linked head and tail with these node
     */
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    /*
    ______________________
    |(int)Value| (Node)next| -->
    -----------------------
     */


    //Insert Method SinglyLinkedList

    /*
    Insertion to Linked list more different than the creation because we need to look few statements to insert
    First we need to look at the head if head is null then the linked list can't be created, if linked list already created we need to choose where to insert a value
    to linked list we consider 3 different location to insert first if we wanted to first location so we need to add a value at the beginning of the
    Linked list Second last location of the linked list so at the last location we know last value link is to null cause there's no value a head so when we add the value
    to the last we need to change consider the link to null and lastly if we choose the location whenever we want like second third but not last or head so we use loop to
    find the location and add the new node between them.
     */
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }
        else if(location == 0){
           node.next = head;
           head = node;
        }else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }
        else {
            Node tempNode = head;
            int index = 0;
            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    //Traversal of Singly Linked List
    public void traverseSinglyLinkedList(){
        if( head == null){
            System.out.printf("Linked List doesn't exist !");
        }else {
            Node tempNode = head;
            for(int i = 0; i<size; i++){
                System.out.printf(String.valueOf(tempNode.value));
                if(i != size -1){
                    System.out.printf(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
    }

    //Search for a node

    public boolean searchNode(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i = 0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Found the node at location " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found !");
        return false;
    }

    //Deletion of a Node from Singly Linked List
    /*
    - Deleting the first node
    - Deleting any given node
    - Deleting the last node
     */

    
}

