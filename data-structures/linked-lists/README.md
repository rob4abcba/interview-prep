# Topic - Linked Lists
## Table of Contents
[TOC]

## Description
Linked lists are a common data structure that follows a different model of access compared to arrays.  In an array all elements are contiguous within a block of memory, linked lists on the other hand do not require this.  Elements that exist within a linked list can occur at vastly different locations within memory while still representing a linear data structure.  This is accomplished by using references or points within a data structure for the node of the list that references the next and or previous node(s).

In a classic model of a linked list there are two variations singly and doubly linked lists.  As the names imply, a singly linked list only maintains a single reference, typically to the next node within the list while a doubly linked list node contains two references to a node, the next and the previous.

### Singely Linked List
As stated above a singly linked list will have a single reference/pointer to another node within the linked list.  The node that the current node points to is typically refered to as the next node within the linked list.

The start of the list is typically refered to as the head of the list while the last element within the linked list is refered to as the tail.  These can be references that are maintained outside of the linked list node data structure itself, typically within the owning linked list class.

```
    |----------|        |----------|                      |----------|
    |  Node 1  | ---->  |  Node 2  |  ----> .....  ---->  |  Node N  |  -----> NULL
    |----------|        |----------|                      |----------|
```

A typical data structure to represent a linked list could look something like the following:

```java
public class LinkedList {

    private class LinkedListNode {
        private int data;
        private LinkedListNode next = null;

        public LinkedListNode(int value) {
            this.data = value;
        }
    }

    private LinkedListNode mHead = null, mTail = null;
    private int mSize = 0;

    public void add(int value) {

    }

    public int remove() {

    }

    public int size() {

    }
}
```

From the above snippet, the linked list starting out is going to be empty with both the head and tail being set to `null`.  As elements are added to the list, the head and tail will be updated to reflect the new head and tail elements.

### Doubly Linked List
Very similar to that of a singly linked list but has another reference/pointer to another linked list node within the linked list.  In the typical case, the second reference will point to the previous node, but there is no requirement that this must always be true.

```
    |----------| ---->  |----------|  ---->       ----> |----------|
    |  Node 1  |        |  Node 2  |        .....       |  Node N  |  -----> NULL
    |----------| <----  |----------|  <----       <---- |----------|
```

A typical data structure to represent a linked list could look something like the following:

```java
public class DoublyLinkedList {

    private class LinkedListNode {
        private int data;
        private LinkedListNode next = null, prev = null;

        public LinkedListNode(int value) {
            this.data = value;
        }
    }

    private LinkedListNode mHead = null, mTail = null;
    private int mSize = 0;

    public void add(int value) {

    }

    public int remove() {

    }

    public int size() {

    }
}
```

### Iteration & Traversal
Traversal & iteration of a linked list is quite common in Linked List coding questions.  Being able to quickly implement both a serial and recursive method is beneifical.

The typical iteration and traversal of a linked list involves starting at one node, commonly at the head, and then managing the reference to the next node via the reference from within the current node.  It is quite common to see something along the lines of `nextNode = nextNode.next;` to keep iterating within a while loop construct.

The benefit of using linked lists in problems for traversal is that you can not perform arbitrary index movements within the linked list data structure dur to the only thing you know is where you are and where you can go next based on the references that you currently have access to.  This is vastely different from `arrays/matrix` data structure in which you can make arbitrary movements due to the guarantee of layout within the confines of memory.  use this to your advantage in breaking the problem down that involve linked lists.

Many problems play off of iteration by requiring keeping track of multiple pointers.  This is commonly refered to as the `two-pointer` strategy but again there can more than two pointer references being maintained during iteration depending on the problem at hand.

#### Exercises

1. Iterate through a linked list serially.
1. Iterate through a linked list using recursion.
1. Iterate through a linked list using two pointers, a fast (moves two at a time), and a slow (moves one at a time).

### Data Manipulation
Like with most other data structures you can add, remove, modify the data structure itself and many problems revolve around this as well.

Addition and removal of nodes within a linked list typically involve the head and tail to provide constant access time in the worse case w.r.t the array list itself.  This is due to the common nature of maintaining the head and tail references of the linked list that allows for inserting in the front or the back of the linked list data structure fairly straight forward.

When performing an addition of a new element within the linked list, creation of the new linked list with the data must occur.  Then update of the linked list head/tail occurs to point to the new linked list node.  The opposite is true during a removal.

```
Empty List       ---->       Add One Element       ---->        Add Another Element
Head = NULL                  Head == Tail                       Head                 Tail
Tail = NULL                        |                              |                   |
                                   V                              V                   V
                             |----------|  next              |----------|  next   |----------|  next
                             |  Node 1  |  ----> NULL        |  Node 1  |  ---->  |  Node 2  |  ----> NULL
                             |----------|                    |----------|         |----------|
```

#### Exercises

1. Implement the linked list method responsible for adding new elements to the linked list.
1. Implement the linked list method responsible for removing elements from the head of the linked list.
1. Implement the linked list method responsible for removing elements from the tail of the linked list.
1. Implement the method to swap the contents of every even / odd pair of linked list nodes.

### Problem Set