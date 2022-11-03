package Questions;

import java.util.Scanner;

public class ArrayQuestions {
    /*
    Find Number of Days Above Average Temperature

    - How many day's temperature?
    - Day 1's high temp: 1
    - Day 2's high temp: 2
    - Output Average = 1.5 - 1 Day(s) above average
     */

    public void averageTemperatureArray(){
        int row,temp,sum = 0;
        double avr;
        Scanner input = new Scanner(System.in);
        System.out.println("How many day's : ");
        row = input.nextInt();
        int arr[] = new int[row];
        for (int i = 0; i<row;i++){
            System.out.print("Day "+ (i+1) +"'s high temperature : ");
            temp = input.nextInt();
            arr[i] = temp;
            sum += temp;
        }
        avr = (double) sum/row;
        System.out.println("Output Average = "+ avr);
        for(int i = 0; i<row; i++){
            if(arr[i]> avr){//Fix it 
                System.out.println((i+1)+" Day(s) above average");
            }
        }
    }

    /*
    Find the missing number in an integer array of 1 to 10.

    Example for 10 elements

    int intArray[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
    missingNumber(intArray); // 7

    the solution logic is like if there is 10 elements
    1,2,3,4,5,6,7,8,9,10
    their sum is 55
    if one number is missing like 7 their new sum is 48
    So when we subtract the two sum we cna find the missing number
    And to find the sum we use n(n+1)/2 equation
     */
    public void missingNumber(int[] intArray) {
        // TODO
        int sumLenght = 0;
        int sumArray = 0;
        for(int i : intArray){
            sumArray+=i;
        }
        sumLenght = 10*(10+1)/2;
        int diff = sumLenght-sumArray;
        System.out.println("Missing Number is " + diff);
    }

    /*
    Write a program to find all pairs of integers whose sum is equal to a given number.

    Examples

     Input: nums = [2,7,11,15], target = 9
     Output: [0,1]
     Output: Because nums[0] + nums[1] == 9, we return [0, 1]

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
     */

    public int[] twoSum(int[] nums, int target) {
        //TODO
        for(int i = 0; i<nums.length;i++){
            for (int j = i+1; j< nums.length;j++){
                if(nums[i] + nums[j] == target){
                    System.out.println("["+i+", "+j+"]");
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }

    /*
    Write a program to check if an array contains a number in Java.

    int[] intArray = {1,2,3,4,5,6};
    searchInArray(intArray, 6); // 5
     */

    public boolean searchInArray(int[] intArray, int valueToSearch) {
        // TODO
        for(int i = 0; i<intArray.length;i++){
            if(intArray[i] == valueToSearch){
               System.out.println("Value is found at hte index of "+i);
            }
        }
        return false;
    }

    /*
    How to find maximum product of two integers in the array where all elements are positive.

    int[] intArray = {10,20,30,40,50};
    maxProduct(intArray) // (40,50)
     */

    public String maxProduct(int[] intArray) {
        // TODO
        int first,second;
        first = 0;
        second = 0;
        for (int i = 0; i< intArray.length;i++){
            if(intArray[i]>first){
                first = intArray[i];
            }
        }
        for (int j = 0; j<intArray.length;j++){
            if(intArray[j] != first && intArray[j]>second){//Explain it! Notion I mean
                second = intArray[j];
            }
        }
        String pairs = Integer.toString(first) + "," + Integer.toString(second);
        return pairs;
    }

    /*
    Write a program to check if an array is unique or not.(Any repeated values!)

    int[] intArray = {1,2,3,4,5,6};
    isUnique(intArray) // true
     */

    public boolean isUnique(int[] intArray) {
        // TODO
        for (int i = 0; i< intArray.length;i++){
            for (int j = i+1 ; j< intArray.length;j++){
                if(intArray[i] == intArray[j]){
                    return false;
                }
            }
        }
        return true;
    }

    /*
    Your are given two integer arrays. Write a program to check if they are permutation of each other.(Check two array values are the same or not)

    int[] array1 = {1,2,3,4,5};
    int[] array2 = {5,1,2,3,4};
    permutation(array1, array2)
     */

    public boolean permutation(int[] array1, int[] array2){
        // TODO
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i<array2.length; i++){
            sum += array2[i];
        }
        for (int j = 0; j<array1.length;j++){
            sum2 += array1[j];
        }
        if(sum != sum2){
            return false;
        }
        return true;
    }

    /*
    Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.
     */

    public boolean rotateMatrix(int[][] matrix) {
        // TODO
        //The logic to solve we ue loop and 5 variables:
        /*
         for = 0 to n 
         temp = top[i]
         top[i] = left[i]
         left[i] = bottom[i]
         bottom[i] = right[i]
         right[i] = temp
         Ofcourse there is different solution to this problem but that is the most usefull one 
         I will add more detailed to Notion!
         */
        if(matrix.length ==0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for(int layer = 0; layer< n/2; layer++){
            int first = layer;
            int last = n - 1 -layer;
            for(int i = first; i<last; i++){
                int offset = i -first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
        //(Well I don't understand that all is so complicated like it's easy to understand the logic you know temp top bottom thing) SOLVED WİTH TEARS AND ....
        //To understand that I will try to sketch casue I have a lot of questions here and look for more solutions
        /*
        Now lets look one by one: Our problem is we have a 2D array that the array values given by us but we can't think like that right now
        So we want to rotate this 2D array by 90 degrees let's visualize it:
        1 2 3           7 4 1
        4 5 6    ---->  8 5 2  so this is a classic problem that's mean there's a fix solution that everbody use and it's like most practical solution
        7 8 9           9 6 3  

        Alrgiht we need to reach our values as we know becasue of we dealing with 2D array we first reach out the first value [0][0] and thats one
        When I look the solutions of this problem this is the most logical for me casue I can see what's really happening but ofcourse for understanding we need to look one by one
        We separate like top left right and bottom let's visulize now:
        top = 1 left = 7 right = 3 bottom = 9 and ofcourse we have temp to hold the one value becasue when we change rotate one will be the same as the other
        so first we give temp = top , top = left , left = bottom , bottom = right, right = temp

        so we understand how we rotate but how we give the correct index value every time ?
        I mean the array size can be change every time when we input 
        Well I still learning you know this solution is greate but to understand we need to write again

        int n = matrix.length;
        for(int layer = 0; layer< n/2; layer++){
            int first = layer;
            int last = n - 1 -layer;

            So let's analyze here we have int n variable that hold the matrix length so if we have [3][3] array lenght is 3 [7][7] lenght 7 easy
            Soooo n = 3 , good we have a loop there starts at 0 to n/2 thats mean 3/2 but because of the integer 3/2 equal to = 1
            Thats the break point well if we have the [3][3] array so our indexes are start at 0 and end to 2, well I firstly don't understand that 
            but we need to keep going.
            when our layer = 0 , int first  = 0 , int last = 3 - 1 - layer = 2 
            first = 0 , layer = 2 so that's our first loop 

            Our second loop is 
            for(int i = first; i<last; i++)
            start with first to the last (int i = 0; i<2; i++) don't forget when this loop ends first value changed to 1 

            Ok almost the last part we now start to rotate
              int offset = i -first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;

            let's look one by one (don't forget the values loop start with first = 0 , last = 2)
            offset = 0 - 0 (Because i = 0 and first = 0 start of the loop  offset = 0)
            top = arr[0][0] ([first][i])
            arr[0][0] = arr[2][0] ([first][i]  =  [last - offset][first]) top = left
            arr[2][0] = arr[2][2] ([last - offset][first] = matrix[last][last-offset]) left = bottom
            arr[2][2] = arr[0][2] ([last][last-offset] = matrix[i][last]) bottom = right 
            arr[0][2] = top (top = arr[0][0]) right = temp(top or lets say our value holder)

            When loop increases by 1 
            top = arr[1][1]
            arr[1][1] = arr[0][1]
            arr[0][1] = arr[1][0]
            arr[1][0] = arr[1][1]
            arr[1][1] = top 

        
         */ 
    }


    /*
     * Write a function called middle that takes a list and returns a new list that contains all but the first and last elements.

      myArray = [1, 2, 3, 4]
      middle(myArray)  # [2,3]

     */

    /*
     public class MiddleValue {
    static int[] middle(int[] arr) {
        // TODO
        return MiddleValue[];
        
    }

     */



}
