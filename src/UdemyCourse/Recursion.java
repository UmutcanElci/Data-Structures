package UdemyCourse;

public class Recursion {
    //What is Recursion?
    /*
    Recursion: A way of solving a problem by having a function calling itself.
    Recursion yenileme demek ve preblemimizi aynı fonksiyonu tekrar tekrar çağırarak küçük hale getirmek diyebiliriz. Aynı kodu çalıştırırız kontrol ederiz yoksa
    bir eksiltir tekrar çalıştırırız. Örnek Matruşka bebek oyuncağı olabilir:
     */

    public static void openRussianDoll(int dollNum){
        if(dollNum == 1){
            System.out.println("All dolls are opened");
        }
        else {
            openRussianDoll(dollNum-1);
        }
    }

    //Why/Where we need recursion ?
    /*
    1) Recursion thinking is really important in programming, and it helps you break down big problems into smaller ones and easier to use
    -When to choose recursion?
    *If you can divide the problem into similar sub problems
    *Design an algorithm to compute nth...
    *Write code to list the n...
    *Implement a method to compute all
    2)The prominent usage of recursion in data structures like tree and graphs
    3)It is used in many algorithms (Divide and conquer,greedy,dynamic)
     */

    //Example
    static void recursiveMethod(int n){
        if(n<1){
            System.out.println("n is less than 1");
        }else {
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }
    //Stack memory is used by the system for managing recursive calls,so every time recursive method calls itself the system stores in the static memory for coming back
    //This is done by storing methods in the stack which manages the value based on LIFO(Last in First out) method.
    //It's a good example to understand stack memory look Notion.

    //Recursive vs Iterative Solution(Notion)

    //When to use/avoid Recursion
    /*
    When to use it ?
    - When we can easily break down a problem into similar sub-problem.
    - When we are fine with extra overhead (both time and space) that comes with it.
    - When we need a quick working solution instead of efficient one.
    - When traverse a tree.(No need to mention now actually)
    - When we use memoization recursion.

    When avoid it ?
    - If time and space complexity matters for us.
    - Recursion uses more memory.
     - Recursion can be slow.

     Recursion bazı konularda çok gerekli olabiliyor iteration dediğimiz konu ise normal for ile yaptığımız döngü ama recursion deiğimizde ayne methodu bölerek(azaltarak)
     tekrar tekrar çağrıyoruz ve istediğimiz değeri bu şekilde tutuyoruz bu konuda stack memory den notion da bahsedeceğim araştırmamı yapınca.Recursive bazı matematiksel işlemlerde olsun
     tree ve graph olsun çok işe yarıyorumuş tabi daha o konuya var. Onun dışında recursion verinin fazlalığına göre performansı düşürebilir o konularda iteration ı kullanmak
     daha mantıklıymış çünkü recursion da her bir method stack de tutuluyor ve verimiz bulunduğunda stack den atılıyor(pop out demek istiyorum) o yüzden daha derinlemesine
     recursion ve iteration kullanımlarına bakıcam ve stack memory yi de araştıracağım hepsi Notion da olucak.

     */


    //Write Recursion in 3 Steps
    /*
    The problem is factorial:
    Step 1 : Recursive case - the flow
    First we need to understand the problem understand how factorial works(I already know, so I skip it )

    Step 2 : Base case - the stopping criterion
    So we know 0! = 1 and 1! = 1
    We need to add this criterion

    Step 3 : Unintentional vase - the constraint
    We know that it's calculated only for the positive number. But if someone runs this function for negative number.
    In this case we can never reach the base condition that we declared.
    So to prevent these cases we need to make sure that our N is always positive integer number.
     */

    public int factorial(int n){
        //Important to find if the code infinite if the code works fine it's not mean it is not infinite look for step 3
        if(n<1){
            return -1;
        }
        if(n == 0 || n == 1){
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }

    //Fibonacci Numbers using recursion
    /*
    Fibonacci sequence logic :
    0,1,1,2,3,5,8...
    each number is the sum of the two preceding ones start from 0 and 1

    Step 1 : Recursive case - the flow
    f(n) = f(n-1) + f(n-2)

    Step 2 : Base case - the stopping criterion
    - 0 and 1

    Step 3 : Unintentional case - the constraint
    -fibonacci(-1);
    -fibonacci(-1.4);
     */
    public int fibonacci(int n){
        if(n<0){
            return -1;
        }
        if(n == 0 || n ==1){
            return n;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
