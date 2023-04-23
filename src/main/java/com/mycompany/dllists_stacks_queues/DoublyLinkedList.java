
package com.mycompany.dllists_stacks_queues;

/**
 *
 * @author MoaathAlrajab
 */
class Node {
   public int data;
   public Node next;
   public Node previous;
 

   public Node(int initialData) {
      data = initialData;
      next = null;
      previous = null;
     
   }
}

public class DoublyLinkedList {
   Node head;
   private Node tail;
      int count;
   public DoublyLinkedList() {
      head = null;
      tail = null;
       count = 0;
   }
    
   public void append(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      count ++;
   }
   
   public void prepend(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         newNode.next = head;
         head.previous = newNode;
         head = newNode;
      }
      count++;
   }
   
   public void printList() {
      Node node = head;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
      }
      System.out.println();
   }
   
   public void insertAfter(Node currentNode, Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else if (currentNode == tail) {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      else {
         Node successor = currentNode.next;
         newNode.next = successor;
         newNode.previous = currentNode;
         currentNode.next = newNode;
         successor.previous = newNode;
      }
      count++;
   }
   
   public void remove(Node currentNode) {
      Node successor = currentNode.next;
      Node predecessor = currentNode.previous;
      
      if (successor != null)
         successor.previous = predecessor;
         
      if (predecessor != null)
         predecessor.next = successor;
         
      if (currentNode == head)
         head = successor;
         
      if (currentNode == tail)
         tail = predecessor;
      
      count--;
   }
   
   public int size(){
       
      return count;
   }
   public void printRevList(){
       Node node = tail;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.previous;
      }
      System.out.println();
       
   }
   public int[] toArray() {
   int[] arr = new int[count];
   Node node = head;
   int i = 0;
   while (node != null) {
      arr[i++] = node.data;
      node = node.next;
   }
   return arr;
}

   public int indexOf(int data) {
   Node node = head;
   int index = 0;
   while (node != null) {
      if (node.data == data) {
         return index;
      }
      node = node.next;
      index++;
   }
   return -1;
}

   public int sumOfLastMElements(int m) {
   if (count < m) {
      return 0;
   }
   int sum = 0;
   Node node = tail;
   for (int i = 0; i < m; i++) {
      sum += node.data;
      node = node.previous;
   }
   return sum;
}

   
   
}
