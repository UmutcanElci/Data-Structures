
import UdemyCourse.Big_O;
import UdemyCourse.Recursion;
import Questions.ArrayQuestions;
import UdemyCourse.SinglyLinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        //This project is learn to Data Structures
        //https://www.cs.usfca.edu/~galles/visualization/Algorithms.html
        //ArrayQuestions  test = new ArrayQuestions();
        //int intArray[] = {10,20,30,50,40};
        //int intArray2[] = {20,10,30,50,40};
        //String pairs = test.maxProduct(intArray);
        //System.out.println(pairs);
        //boolean equal = test.isUnique(intArray);
        //System.out.println(equal);
        int doubleArray[][] ={{1,2,3},{4,5,6},{7,8,9}};
        //boolean ts = test.permutation(intArray,intArray2);
        //System.out.println(ts);

        //LinkedList
        LinkedList sLL =new LinkedList();
        sLL.createSinglyLinkedList(7);
        sLL.insertInLinkedList(4,1);
        sLL.insertInLinkedList(5,2);
        sLL.insertInLinkedList(6,3);
        sLL.insertInLinkedList(12,2);
        sLL.searchNode(12);

    }
}
