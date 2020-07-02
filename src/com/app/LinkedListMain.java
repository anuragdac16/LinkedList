/**
 * 
 */
package com.app;

/**
 * @author anuraggupta
 *
 */
public class LinkedListMain {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    LinkedList list = new LinkedList();
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.addAtPosition(12, 3);
  
    list.printList(list);
    
    list.reversePrintList(list);
    
    System.out.println(list.count);
  }

}
