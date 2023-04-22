
package com.mycompany.dllists_stacks_queues;

/**
 *
 * @author MoaathAlrajab
 */
public class DoublyLinkedListDemoApp {
   public static void main(String[] args) {
      DoublyLinkedList numList = new DoublyLinkedList();
      Node nodeA = new Node(14);
      Node nodeB = new Node(2);
      Node nodeC = new Node(20);
      Node nodeD = new Node(31);
      Node nodeE = new Node(16);
      Node nodeF = new Node(55);

      numList.append(nodeA);   // Add 14
      numList.append(nodeB);   // Add 2, make the tail
      numList.append(nodeC);   // Add 20, make the tail

      numList.prepend(nodeD);  // Add 31, make the head

      numList.insertAfter(nodeB, nodeE);  // Insert 16 after 2
      numList.insertAfter(nodeC, nodeF);  // Insert 55 after tail, 55 becomes new tail

      // Output list
      System.out.print("List after adding nodes: ");
      numList.printList();

      // Remove the tail node, then the head node
      numList.remove(nodeF);
      numList.remove(nodeD);

      // Output final list
      System.out.print("List after removing nodes: ");
      numList.printList();
       System.out.println();
       
       System.out.println("List in rev order");
       numList.printRevList();
       
       System.out.println("Size");
       numList.size();
       // hw
       //System.out.println("The min of the list is "+ numList.min());
             // System.out.println("The max of the list is "+ numList.maax());
             
              DoublyLinkedList list = new DoublyLinkedList();
   
   list.append(new Node(1));
   list.append(new Node(2));
   list.append(new Node(3));
   list.prepend(new Node(0));
   list.insertAfter(list.head.next, new Node(5));
   list.remove(list.head.next);
   
   list.printList(); // Output: 0 1 3
   
   int[] arr = list.toArray();
   System.out.println(Arrays.toString(arr)); // Output: [0, 1, 3]
   
   System.out.println(list.indexOf(3)); // Output: 2
   System.out.println(list.indexOf(5)); // Output: -1
   
   System.out.println(list.sumOfLastMElements(2)); // Output: 4

   }
}
