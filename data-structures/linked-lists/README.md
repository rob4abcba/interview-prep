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

#### Exercises

### Data Manipulation

#### Exercises

### Problem Set