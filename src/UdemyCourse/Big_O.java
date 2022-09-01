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
}
