package edu.lestharkin.app.linkedlist.singly;

import edu.lestharkin.app.linkedlist.node.singly.LinkedNode;

public class LinkedList<E> {

  private LinkedNode<E> head;
  private LinkedNode<E> tail;

  public LinkedList() {
    head = tail = null;
  }

  public LinkedList(E element) {
    this.head = new LinkedNode<>(element);
  }

  public boolean add(E element) {
    try {
      if (isEmpty()) {
        LinkedNode<E> node = new LinkedNode<>(element);
        this.head = this.tail = node;
        return true;
      } else {
        LinkedNode<E> node = new LinkedNode<>(element);
        this.tail.setNext(node);
        this.tail = node;
        return true;
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return false;
    }

  }

  public boolean isEmpty() {
    return this.head == null;
  }

  @Override
  public String toString() {
    return "LinkedList [head=" + head + "]";
  }

}
