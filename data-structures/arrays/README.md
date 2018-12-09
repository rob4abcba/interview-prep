# Topic - Arrays/Matrix
## Table of Contents
[TOC]

## Description

Arrays are a common data structure programming that takes advantage being able to address individual elements.  Within the system itself this means that the data is contiguous, or simply put each element within the array exists next to another in the order in which they occur within the array.  This is commonly known as the memory model of programming and is quite powerful.

So for those who want extra links and videos please refer to [Coding Interview University](https://github.com/jwasham/coding-interview-university#arrays) for this topic.  I will not be going over each topic within the reference provided but do not let that limit your learning on the material, the topic of arrays that I am presenting is for you to recognize some of the basic constructs of this data structure without over-complicating the problem and begin to build patterns.

### Iteration & Traversal

- Traversal is achieved in many language using array subscripts with a number between the opening and closing representing the Nth - 1 element in the array (most languages are zero based indexing).
- Arrays can have multiple dimensions.  Typical examples are given in a matrix form such that the matrix is accessed by a row and a column of the matrix where the row is Nth - 1 in size and the column can be the Mth column - 1, where M is the total number of columns and N is the total number of rows.  It is important to realize that the data in most languages in multi-dimensional arrays is still laid out in serial order.
- Arrays typically hold the same type of data 
- Create functions for some common iteration techniques involved in arrays.

#### Exercises
1. Find the maximum, minimum, and sum of all integers in an array.
1. Given an array of integers print each element within the array.
1. Given an array of integers print each even index.
1. Given an array of integer print each odd index.
1. Given a matrix find the maximum, minimum, and sum of all integers in an array.
1. Given a matrix of integers, compute the sum of the corners of the matrix.
1. Given a square matrix flip each row and column element.  
1. GIven any shape matrix flip each row and column element.
1. Given a row, column and matrix, return the element at the given row/column.

### Array Data Manipulation

- When given problems involving arrays, a question may ask you to modify some data within them.
- Break this into two approaches.
- How would you do this if you allocate new memory to hold the desired changes.
- How would you do this if you need to do this in-place.
- Not all problems can be both and others may become quite difficult if you force yourself on the in-place solution.

#### Exercises
1. Given an array of integers flip the order in which elements in the array occur.
1. Given an array of integers sort the elements in ascending order (do not use your language’s sort method implement your own).
1. Given a matrix of integers, add a constant offset to each number.

### Static / Dynamic Arrays

- Knowing the difference or how your language manages static and dynamic arrays is quite important. 
- However in most cases you can always implement your own scheme for dynamic since it does build off of static arrays.
- A static array is one that does not change during the run-time of the program / process such that you can only assign a fixed number of elements to the array.  Think of this as a baking tin.  If your baking tin is an array of cup cake, in which you can only cook 6 cup cake at once, you can fill upto six prior to having to clean or in programming allocate more memory for another tin.  In this case you can not modify the tin.  You can find tins with more cup cake allotments but you can not change the metal.  Also if you don’t fill all the slots for the cup cake during cooking, the empty spaces are still there just like memory in a static array structure (although in some cases it might not be always accessible).
- A dynamic array is one that does change during the run-time of the program / process such that you can keep adding or removing the total number of elements the array is going to hold.  You can think of dynamic array is like the security lines at the airport for checking baggage through the x-ray machines.  Let us say that you have 10 items that need to be in separate bins and the belt is the array.  You can place all 10 bins on the belt and fill them with items.  If you forget that you need one more, you can just place another bin on the belt and fill it with your items, at the end in this case.  The people behind you in line can have different desired sizes that could differ from yours.
- So how does dynamic work versus static in actual code?  Well in the simple case is that dynamic uses static, and will perform copies of the data when a resize occurs.  An example of this is, assume that an array can hold 10 elements in memory and you want to add one more.  Well you can not add the new element to the existing array because there is not enough addressable memory in this case.  So instead you create a new array with 11 elements and then copy the previous 10 over to the new array and place the 11th element into the 10th index.  The previous 10 element size array can now be removed from memory since is no longer needed.
- In addition to increasing in size an array can also decrease.  
- So since increasing and decreasing can occur the next question is by how much?  Well I will leave this up to you to determine and justify for your implementation in the exercises.

#### Exercises
1. Implement a dynamic array that allows for the increasing of elements within an array.
1. Implement a dynamic array that allows for the removal of an element from the end of the array.
1. Implement a dynamic array that allows for the removal of an element from a user specified index within the array.
1. Implement a method that provides the total number of elements within the array.

#### Helpful Hints
- You will likely need to keep track of the total number of elements that exists within the array and the total capacity.
- Think of what happens if you removal a full array to an array with no elements.
- For the time being only consider an array of integers, it is possible to perform the same thing for other data structures as well but let us keep it simple.

### Problem Set
1. Given a matrix of integers, write a function that rotates the matrix by 90 degrees.    
    ```
    Input:

    1 2 3            
    4 5 6              
    7 8 9            
    ```
    ```
    Output:

    7 4 1
    8 5 2
    9 6 3
    ``` 

1. Given a matrix of integers, write a function that flips the contents of the matrix over the symmetric horizontal center.
    ```
    Input:
    1 2 3                  
    4 5 6              
    7 8 9                  
    ```
    ```
    Output:
    7 8 9
    4 5 6
    1 2 3
    ```
1. Given a matrix of integers, write a function that flips the contents of the matrix over the symmetric vertical center.
    ```
    Input:
    1 2 3 
    4 5 6      
    7 8 9
    ```
    ```
    Output:
    3 2 1
    6 5 4
    9 8 7
    ```
1. Given a matrix of 0 and 1 where 1 represent land and 0 represents water.  Count the total number of distinct islands (a 1 that is up, down, left, right to another counts as being a single island).
    ```
    Input:
    1 0 0 1 1
    1 0 1 0 0
    0 1 0 0 1 
    1 1 1 0 1
    0 0 0 0 0
    ```
    ```
    Output:
    5
    ```