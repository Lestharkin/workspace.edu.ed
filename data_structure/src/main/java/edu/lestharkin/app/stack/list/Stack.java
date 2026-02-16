package edu.lestharkin.app.stack.list;

import java.util.function.Function;

import edu.lestharkin.app.linkedlist.singly.LinkedList;
import edu.lestharkin.model.collection.Collection;
import edu.lestharkin.model.iterator.Iterator;
import edu.lestharkin.model.stack.AbstractStack;

public class Stack<E> extends AbstractStack<E> {

  private LinkedList<E> list;

  public Stack() {
    this.list = new LinkedList<>();
  }

  public Stack(E element) {
    this.list = new LinkedList<>(element);
  }

  @Override
  public E peek() {
    return list.peekLast();
  }

  @Override
  public E pop() {
    return list.pollLast();
  }

  @Override
  public boolean push(E element) {
    return list.add(element);
  }

  @Override
  public boolean clear() {
    return list.clear();
  }

  @Override
  public boolean contains(E element) {
    return list.contains(element);
  }

  @Override
  public boolean contains(E[] array) {
    return list.contains(array);
  }

  @Override
  public boolean contains(Collection<E> collection) {
    return list.contains(collection);
  }

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public boolean reverse() {
    return list.reverse();
  }

  @Override
  public int size() {
    return list.size();
  }

  @Override
  public void forEach(Function<E, Void> action) {
    list.forEach(action);
  }

  @Override
  public Iterator<E> iterator() {
    return list.iterator();
  }

}
