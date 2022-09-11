package UdemyCourse;

public class Big_O {
    /*
    What is Big O?

    - Big O is the language and metric  we use to describe the efficiency of algorithms. Basically give you oe way of describing
    how the time that takes on your application grows as the size of input grows.

    - Delivery method changed based on the file size.

    - One of the based topic of the Big O is Time Complexity

    - Time Complexity : A way of showing how the runtime of a function increases as the size of input increase(It's a way showing how the runtime of function increases)

    Types of Runtimes :
    O(N) , O(N^2) , O(2^N)

    Big O Notations(Big O , Big Omega , Big Theta)

    - Algorithms can perform differently based on the condition that is given. We might have three scenarios in case of measuring performance
    of any given algorithm.

    - Best case
    - Average case
    - Worst case

    - Big O : It is a complexity that is going to be less or equal to the worst case.
    - Big - Omega : It is a complexity that is going to be at least more than the best case.
    - Big Theta : It is a complexity that within bounds of the worst and best cases.

    - Big O kısaca algoritmamızı nasıl daha kullanışlı olması için yapılmış bir sistem veya dil de diye biliriz. Big O da önemli olan girilen verinin boyutu ve ne kadar
    arta bileceği yani kullanıcının sürekli girdiği veri olsun ya da bize boyutu belli bir dizi olsun yapmak istediğimiz işlemi(action) nasıl en hızlı şekilde yapmamıza
    sağlayan diyemem yanlış olur hızlı bir şekilde yapmamıza iten çünkü bu sistem aslında bak diyo sana verileri vercem ve sen de bi verileri en az 10 saniyede diziceksin.
    Şimdi asıl olay burda başlıyor en iyi senaryo(Best case), idare eden senaryo(Average case) ve kötü senaryo(Worst case), En iyi senaryo da işlem 10 saniyenin altıda
    İdare eden senaryo da 10 saniye ve ya çok yakın 9.90 saniye gibi kötü senaryo da ise 10 saniye yi geçerse. Şimdi big 0 notasyonları şu an  3 tane gördüm belki daha vardır.
    Ve araştırdım evet 3 tane var şimdi Big O dediğimz basitçe istenilen zamana(İlla zaman olması gerekmiyor veri de olabilir ya da başka bişey de) eşit veya büyük olursa yani
    Average ve  Worst. Big Omega istenilen zamana yine eşit ya da küçük Best ve Average.Big Theta is tam isten,ilen zaman için kullanılıyor Average case. Şu an anladığım bunlar.

    Most Common Time Complexities
    - O(1) Constant time : Accessing a specific element in array it doesn't matter that array has 10 or more indices we are always looking for one value.

    - O(N) Linear time : Loop through array elements the time complexity will grow in direct proportion of size of the input data.

    - O(LogN) Logarithmic time : Find element in sorted array same as linear with little change that refers to the algorithm that runs in proportionally to the
    logarithmic of the input(Binary search).

    - O(N^2) Quadratic time : Looking every index in the array twice directly proportional to the square size of input dataset.

    - O(2^N) Exponential time : Double recursion in Fibonacci denotes an algorithm whose growth doubles within each addition  to the input size.


    Space Complexity

    Space Complexity is a measure of amount of working storage an algorithm needs. That means how much memory in the worst case is needed at any point in the algorithm.

    Drop Constants and Non Dominant Terms

    Drop Constants and Non Dominant Terms means that we can easily eliminate some values from asymptotic analysis
    - So this means that we drop constant:
    - We can write O(2N) --> O(N)
    - Drop Non dominant terms:
    - We can write O(N^2 + N) --> O(N^2)

    So why we removing this ?

    - It is very possible that O(N) code is faster than O(1) code for specific inputs.
    - Different computers with different architectures have different constant factors.
    - Different algorithms with the same basic idea and computational complexity might have slightly different constants.

    How to measure the code using Big O ?
    How to measure R    ecursive Algorithm ?
    How to measure Recursive Algorithm with multiple calls ?
    --NOTİON!
     */

    /*
     Time Complexity Questions :

    Question 1 - Time Complexity of Method that returns Sum and Product of Array(It's about the time complexity not the question)
    - Create a function which calculates the sum and product of elements of array
    - Find the time complexity for created method

     */
    //Now time complexity
    public void sumAndProductArr(int[] array){
        int sum = 0;// O(1)
        int product = 1;//O(1)
        for(int i  = 0; i<array.length; i++){//O(n)
            sum += array[i];//O(1)
        }
        for (int i = 0 ; i<array.length; i++){//O(n)
            product *= array[i];//O(1)
        }
        System.out.println(sum + " , " + product);//O(1)
    }
    //If we combine this according to our rule we can eliminate non - dominant terms . Non - deominant terms are O(1)s.
    //And if we sum this O(n) we will get two O(n)
    //So the time complexity is O(n)

    /*
    Question 2 - Time Complexity of Print Pairs Method
    - Create a function which prints to the console the pairs from given array.
    - Find the time complexity for created method.
    */
    public void printPairsArray(int[] array){

        for (int i = 0; i<array.length; i++ ){// O(n)
            for(int j = 0 ; j<array.length; j++){// O(n) so this two complexity's are multiple so Time Complexity is O(n^2)
                System.out.print(array[i] +" ," + array[j]);// O(1)
            }
            System.out.println();//O(1)
        }
    }
    //Time Complexity O(n^2)

    /*
    Question 3 - Time Complexity of Print Unordered Pairs Method
    - Find the time complexity of this method
     */
    public void printUnorderedPairs(int[] array){
        for(int i = 0; i<array.length;i++){
            for (int j =i+1; j<array.length; j++){
                System.out.println(array[i] + " ," + array[j]);
            }
        }// Like if array is {1,3,4,5} the output is 13,14,15 than 34,35 than 45 because of the j = i+1
    }
    //In this course we talked about how we understand the time complexity
    /*
    Question 4 - Find Time Complexity for given method
     */
    public void printUnorderedPairs(int[] arrayA , int[] arrayB){
        for(int i = 0 ; i<arrayA.length;i++){//Well first thought maybe is this code time complexity is O(N^2) but wrong cause that's two different arrays.
            for (int j = 0 ; j<arrayB.length;j++){//That's why time complexity completely different. So in this case for each element for A, we are looping through all elements of the BSo in this case the time complexity will be O(ab)
                if(arrayA[i] < arrayB[j]){//O(1)
                    System.out.println(arrayA[i] + " , "+arrayB[j]);//O(1)
                }
            }
        }
    }
    /*

    Question 5 - Find Time Complexity for given Method
     */
    public void printUnorderedParis2(int[] arrayA, int[] arrayB){
        for(int i = 0 ; i<arrayA.length;i++){
            for (int j = 0 ; j<arrayB.length;j++){//We know this part takes O(ab) time complexity
                for(int k = 0; k<100000;k++){//O(1) number is constant
                    System.out.println(arrayA[i] + " , "+arrayB[j]);//O(1)
                }
            }
        }
    }
    /*
    Question 6 - Time Complexity of Reverse Array Function
     */
    public void reverse(int[] array){
        for(int i = 0; i<array.length/2;i++){//for example when i = 0 and array length is 4. So time complexity is O(n/2)
            int other = array.length-i-1;//other = 3 time complexity is O(1)
            int temp = array[i];// = temp = 0; time complexity is O(1)
            array[i] = array[other];//[0] = [3] //values changed time complexity O(1)
            array[other] = temp;// [3] = [0] time complexity is O(1)
        }
    }
    /*
    Question 7 - Equivalent to O(N)
    - Which of the following are equivalent to O(N)?
    1) O(N+P), where P<N/2 - Because of the P is non-dominant we can delete and write this time complexity O(N)
    2) O(2N) - 2 is the constant (non-dominant) se we can delete it and the time complexity is O(N)
    3) O(N+logN) - logN we know is the constant also so time complexity is O(N)
    4) O(N+NlogN) - In this case O(N) the non-dominant so time complexity is O(NlogN)
    5) O(N+M) -
     */

    /*
    Question 8 - Time Complexity of Factorial
     */
    public static int factorial(int n){//O(n)
        if(n < 0){//O(n)
            return -1;
        } else if (n == 0) {
            return 1;
        }else {//O(n-1)
            return n*factorial(n-1);
        }
    }

}
