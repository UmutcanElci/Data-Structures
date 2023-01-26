package Exercises;

import java.util.Scanner;

public class WhileLoops {
    public static Scanner in = new Scanner(System.in);
   public void printNumber(){
    int n= 0;
    while(n<10){
        System.out.println(n);
        n++;
    }
   } 
   public void findFactorial(){
    System.out.println("Number : ");
    int n = in.nextInt();
    int fac = 1;
    int i = 1;
    while(i<=n){
       fac *= i;
       i++; 
    }
    System.out.println("Factorial of number : " + fac); 
   }

   public void reverseNumber(){
    System.out.println("Number : ");
    int n = in.nextInt();
    int reverse = 0;
    int remainder = 0;
    while(n>0){// n = 1234
        remainder = n % 10; // remainder is 4 
        reverse = reverse * 10 + remainder; //reverse is  0 in first loop so nothing happends but when we sum with remanider it's 4
        n = n / 10;//now the number is 123    
    }
    System.out.println(reverse);
   }
   public void evenOddSum(){
    int evenSum = 0;
    int oddSum = 0;
    int number;
    int choice;
    do{
        System.out.println("Number : ");
        number = in.nextInt();
        if(number % 2 == 0){
            evenSum += number;
        }else{
            oddSum += number;
        }
        System.out.println("if you don't wnat to add more number press 0");
        choice = in.nextInt();
    }while(choice != 0);
       System.out.println("Even number sum : "+ evenSum);
       System.out.println("Odd number sum : "+oddSum);
   }


}
