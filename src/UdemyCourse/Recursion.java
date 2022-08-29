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
    
}
