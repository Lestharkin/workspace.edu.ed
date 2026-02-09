package edu.lestharkin.app.linkedlist.singly;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LinkedListTest {

  LinkedList<Object> linkedList;

  @BeforeEach
  void setUp() {
    linkedList = new LinkedList<>();
  }

  @Test
  void testAdd() {
    linkedList.add(1);
    assertEquals(1, linkedList.peek());
  }

  @Test
  void testAddFirst() {
    linkedList.add(1);
    linkedList.addFirst(2);
    assertEquals(2, linkedList.peek());
  }

  @Test
  @DisplayName("Test isEmpty() method of LinkedList class")
  void testIsEmpty() {
    assertTrue(linkedList.isEmpty());
  }

  @Test
  @DisplayName("Peek method of LinkedList class")
  void testPeek() {
    linkedList.add(1);
    assertEquals(1, linkedList.peek());
  }

  @Test
  @DisplayName("Peek method of LinkedList class")
  void testPeekLast() {
    linkedList.add(1);
    linkedList.add(2);
    assertEquals(2, linkedList.peekLast());
  }

  @Test
  @DisplayName("remove method of LinkedList class")
  void testRemove() {
    linkedList.add(1);
    linkedList.remove(1);
    System.out.println("TEST");
  }

}