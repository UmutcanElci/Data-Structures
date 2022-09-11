package UdemyCourse;

public class Arrays {
    public int[] arr = null;
    public int[][] arr2 = null;
    /*
    Arrays are very powerful data structures that stores list of elements.
    - The size of array cannot be changed
    - Array can store data of specified type
    - Elements of an array are located in a contiguous
    - The size of an array is predefined and cannot be modified
    - Each element of an array has unique index

    Why do we need an Array ?
    In software programs the array is used almost everywhere in the computer to store and data.
    So if we want to work with 3 int it is not a problem to create 3 different variable and do the work but what if we have 500 int we can't create 500 variables,
    so we need to use array.

    Types of Arrays
    - There's two type of arrays
    1) One Dimensional
    - Linear
    2) Multi Dimensional
    - Two Dimensional
    - Three Dimensional
    - Four Dimensional
    - N Dimensional

    Creating an Array
    When we create an array :
    - Declare - creates a reference to array
    - Instantiation of an array - creates an array
    - Initialization - assigns values to cells in array
    We talk about what happened in the memory (Notion)
     */
    public void arrayCreate() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
    }
    /*
    Insertion in Array
    So we know we define the array values with indexes like if we have a string array capacity of 6
    ["a"],["b"],["c"],[],[],[]
    And if we add a value to index 3
    array[3] = "d"
    And our array look like
    ["a"],["b"],["c"],["d"],[],[]
    IMPORTANT TO LOOK  MEMORY NOTİON SEARCH AND FOUND İT!!(Kendime mesaj)
    Also I want to write an array function to find index number add or delete element.(To understand better)
     */

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }
    /*
       Array Traversal

       So traversing means visiting all cells of the array. The purpose over here is like It can be printing all elements of the array, or
       we want to update all elements of the array(There is more)
        */
    public void  traverseArray(){
        try {
            for (int i = 0; i<arr.length;i++){
                System.out.println(arr[i]+ " ");
            }
        }catch (Exception e){
            System.out.println("Array no longer exists");
        }
    }

    /*
    Search array element
     */
    public void searchInArray(int valueToSearch){

            for(int i = 0; i<arr.length;i++){
                if (arr[i] == valueToSearch){
                    System.out.println("Found it!");
                }else{
                    System.out.println("Can't found it");
                }
            }
    }
    /*
    Delete Array Element
     */
    public void deleteValue(int valueToDeleteIndex){
        try {
            //arr[valueToDeleteIndex] == Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        }catch (ArrayIndexOutOfBoundsException e){

        }
    }


    /*
    Create Two Dimensional Array(I visualize at Notion)

    An array with a bunch of values having been declared with double index.
    a[i][j] = i and j between 0 and n(thing like int array)

    What is happening to memory then, all at Notion again.
    Steps to create array:
    Step 1 - Declare
    int[][] int2DArray;
    Step 2 - Instantiate
    int2DArray = new int[2][2]
    Step 3 - Initialize
    int2DArray[0][0] = 1;

    To print we use Arrays.deepToString method(Or you for loop like I always do)


    Insertion - Two Dimensional Array

    Same as the one dimensional array

     */
    public void insertValueInThe2DArray(int row, int col,int value){
        try {
            if(arr2[row][col] == Integer.MIN_VALUE){
                arr2[row][col] = value;
                System.out.println("The value is successfully inserted");
            }else {
                System.out.println("This cell is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

    /*
    Accessing Two Dimensional Array
     */

    public void accessCell(int row,int col){
        System.out.println("\n Accessing Row" + row + "Col  number "+ col);
        try {
            System.out.println("Cell value is " + arr2[row][col]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

    /*
    When to use/avoid Arrays

    When to use
    - To store multiple variables of same data type
    - Random access

   When to avoid
   - Same data type elements
   - Reserve memory(Whenever you create an array with the size of default size you cannot exceed)
     */
}




