package edu.lestharkin.app.queue.list;

import java.util.function.Function;

import edu.lestharkin.app.linkedlist.singly.LinkedList;
import edu.lestharkin.model.collection.Collection;
import edu.lestharkin.model.iterator.Iterator;
import edu.lestharkin.model.queue.AbstractQueue;

public class Queue<E> extends AbstractQueue<E> {

  private LinkedList<E> list;

  public Queue() {
    this.list = new LinkedList<>();
  }

  public Queue(E element) {
    this.list = new LinkedList<>(element);
  }

  @Override
  public E peek() {
    return this.list.peek();
  }

  @Override
  public E extract() {
    return this.list.poll();
  }

  @Override
  public boolean insert(E element) {
    return this.list.add(element);
  }

  @Override
  public boolean clear() {
    return this.list.clear();
  }

  @Override
  public boolean contains(E element) {
    return this.list.contains(element);
  }

  @Override
  public boolean contains(E[] array) {
    return this.list.contains(array);
  }

  @Override
  public boolean contains(Collection<E> collection) {
    return this.list.contains(collection);
  }

  @Override
  public boolean isEmpty() {
    return this.list.isEmpty();
  }

  @Override
  public boolean reverse() {
    return this.list.reverse();
  }

  @Override
  public int size() {
    return this.list.size();
  }

  @Override
  public void forEach(Function<E, Void> action) {

  }

  @Override
  public Iterator<E> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }
}