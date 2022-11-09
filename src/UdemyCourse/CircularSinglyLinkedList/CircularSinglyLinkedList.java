package UdemyCourse.CircularSinglyLinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCircularSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
         return head;

    }

    public void insertionCircularSinglyLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createCircularSinglyLinkedList(nodeValue);
            return;
        }else if(location == 0){
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            node.next = tail;
            tail = node;
            tail.next = head;
        }else {
            Node tempNode = head;
            int index = 0;
            while (index < location -1 ){
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    public void traversalCircularSinglyLinkedList(){
        if (head != null){
            Node tempNode = head;
            for (int i = 0; i<size; i++){
                System.out.print(tempNode.value);
                if(i != size -1 ){
                    System.out.println(" -> ");
                }
                tempNode = tempNode.next;

            }
            System.out.println("\n");
        }else {
            System.out.println("Linked list does not exist ! ");
        }

    }

    public boolean searchCircularSinglyLinkedList(int nodeValeu){
        if (head != null){
            Node tempNode = head;
            for (int i = 0; i<size; i++){
                if(tempNode.value == nodeValeu){
                    System.out.println("Found at location " + i);
                    return true;
                }
            }
        }
        System.out.println("Wrong input !");
        return false;
    }

    public void deletionOfCircularSinglyLinkedList(int location){
        if(head == null){
            System.out.println("Linked list does not exist !");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if( size == 0){
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0 ; i<size-1; i++){
                tempNode = tempNode.next;
                if (tempNode == head){
                    head.next = null;
                    head = null;
                    tail = null;
                    size--;
                    return;
                }
            }
        }else {
            Node tempNode = head;
            for (int i = 0; i<location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteEntireLinkedList(){
        if (head == null){
            System.out.println("Linked list does not exist !");
        }else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("Linked list has been deleted !");
        }
    }
}
