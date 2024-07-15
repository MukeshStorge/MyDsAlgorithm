# My Data Structures and Algorithm


BigO
* Space Time Complexity
* Rules

Common Problem Solving Patterns 
* Frequency Conter
  * Anagram
* Multiple pointers 
  * Sliding Window
    * Constant window
    * Longest subarray/subsring with where condition
    * Number of subarray with where condition
    * Shortest/Minimum window size
  * Divide and conquer
    * Binary search
    * Fininding max and min
    * [Merge sort]
    * [Quick sort]
    * Strassen Maxrix multiplications 
  * Recursion - recursive/trace tree
* Searching Algorithms
  * Linear Search
  * Naive O(m*n)
  * Pattern/String matching Algorithm
    * [KMP] O(m+n) - Eliminate repeated patterns by using the PI table on pattern (index on repeated charecters)
      * Create PI Table (LPS - Longest Prefix Suffix) - Avoids back tracking
      * Compare and skip repeated charecters
    * [Rabin-Karp] O(n-m+1) Compare the hash value for the correponding pattern hash value(eg. abc). (Spurious Hits - Order of pattern mismatch issue-collision O(mn)) -> Avoid this by multipling a*26^2 b*26^1 c*26^0
      * Rolling hash function
      * Hash collision
        * Separate chaining ( e.g. using nested arrays of key values implemented in following hash tables )
        * linear probing ( if index filled place {key, value} in next position )
        
* Sorting Algorithms
  * Comparison-based Sorting Algorithms:
      * BUB - Bubble Sort,
      * SEL - Selection Sort,
      * INS - Insertion Sort,
      * MER - Merge Sort (recursive implementation),
      * QUI - Quick Sort (recursive implementation),
      * R-Q - Random Quick Sort (recursive implementation).
  * Not Comparison-based Sorting Algorithms:
      * COU - Counting Sort,
      * RAD - Radix Sort.
        
* Useful Links
  * [Study Plan]
  * [Cheat Plan]
  * [Blind75]
  * [Grind75] [leet]


  * ![image](https://github.com/MukeshStorge/algorithms/assets/65528044/9e89358f-8851-472b-a514-397a276e6129)

[Merge sort]: https://www.youtube.com/watch?v=mB5HXBb_HY8&list=PLDN4rrl48XKpZkf03iYFl-O29szjTrs_O&index=34
[Quick sort]: https://www.youtube.com/watch?v=7h1s2SojIRw&list=PLDN4rrl48XKpZkf03iYFl-O29szjTrs_O&index=36     
[KMP]: https://www.youtube.com/watch?v=V5-7GzOfADQ
[Rabin-Karp]: https://www.youtube.com/watch?v=qQ8vS2btsxI
[Blind75]: https://leetcode.com/discuss/general-discussion/460599/blind-75-leetcode-questions
[Study Plan]: https://www.techinterviewhandbook.org/coding-interview-study-plan/
[Grind75]: https://www.techinterviewhandbook.org/grind75?weeks=2&hours=16
[leet]: https://leetcode.com/problem-list/ong932e1/
[Cheat Plan]: https://www.techinterviewhandbook.org/algorithms/study-cheatsheet/
