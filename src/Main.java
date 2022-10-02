
import UdemyCourse.Big_O;
import UdemyCourse.Recursion;
import Questions.ArrayQuestions;
public class Main {
    public static void main(String[] args) {
        //This project is learn to Data Structures
        //https://www.cs.usfca.edu/~galles/visualization/Algorithms.html
        ArrayQuestions  test = new ArrayQuestions();
        int intArray[] = {10,20,30,50,40};
        int intArray2[] = {20,10,30,50,40};
        //String pairs = test.maxProduct(intArray);
        //System.out.println(pairs);
        //boolean equal = test.isUnique(intArray);
        //System.out.println(equal);

        boolean ts = test.permutation(intArray,intArray2);
        System.out.println(ts);
    }
}
