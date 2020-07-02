/**
 * 
 */
package com.app;

/**
 * @author anuraggupta
 *
 */
public class LinkedList {

  Node head;
  Node tail;
  int count;

  public void add(int data) {
    if (this.head == null) 
      addFirst(data);
    else
      addLast(data);
  }

  private void addLast(int data) {
    Node l = this.tail;
    Node newNode = new Node(l,data);
    this.tail = newNode;
    l.next = newNode;
    if(head.next == null)
      head = l;
    count++;
  }

  private void addFirst(int data) {
    this.head = new Node(data);
    this.tail = new Node(data);
    count++;
  }

  
  public void addAtPosition(int data, int position) {
    Node currentNode = this.head;
    for(int i = 1; i < position; i++) {
      currentNode = currentNode.next;
    }
    Node newNode = new Node(currentNode,data);
    newNode.next = currentNode.next;
    currentNode.next.prev = newNode;
    currentNode.next = newNode;
    count++;
  }
  
  
  public int size() {
    if (this.head == null) {
      return 0;
    }
    int index = 1;
    Node currentNode = this.head;
    while (currentNode.next != null) {
      currentNode = currentNode.next;
      index++;
    }
    return index;
  }

  public void printList(LinkedList linkedList) {
    StringBuilder str = new StringBuilder("[ ");
    Node currentNode = linkedList.head;
    while (currentNode != null) {
      str.append(currentNode.data);
      currentNode = currentNode.next;
      str.append(" , ");
    }
    String result = str.substring(0, str.length() - 2) + "]";
    
    System.out.println(result);
  }

  
  public void reversePrintList(LinkedList linkedList) {
    StringBuilder str = new StringBuilder("[ ");
    Node currentNode = linkedList.tail;
    while (currentNode != null) {
      str.append(currentNode.data);
      currentNode = currentNode.prev;
      str.append(" , ");
    }
    String result = str.substring(0, str.length() - 2) + "]";
    
    System.out.println(result);
  }
  private static class Node {

    Node prev;
    int data;
    Node next;

    Node(Node prev, int data) {
      this.prev = prev;
      this.data = data;
      this.next = null;
    }
    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

}
