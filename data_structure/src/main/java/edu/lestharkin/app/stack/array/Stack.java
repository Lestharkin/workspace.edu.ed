package edu.lestharkin.app.stack.array;

import java.util.function.Function;

import edu.lestharkin.model.collection.Collection;
import edu.lestharkin.model.iterator.Iterator;
import edu.lestharkin.model.stack.AbstractStack;

public class Stack<E> extends AbstractStack<E> {

  private Object[] array;
  private int top;

  public Stack() {
    this.array = new Object[1000];
    this.top = -1;
  }

  public Stack(E element) {
    this.array = new Object[1000];
    this.array[0] = element;
    this.top = 0;
  }

  public Stack(int length) {
    this.array = new Object[length];
    this.top = -1;
  }

  public Stack(int length, E element) {
    this.array = new Object[length];
    this.array[0] = element;
    this.top = 0;
  }

  @Override
  @SuppressWarnings("unchecked")
  public E peek() {
    return (E) array[top];
  }

  @Override
  public E pop() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pop'");
  }

  @Override
  public boolean push(E element) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'push'");
  }

  @Override
  public boolean clear() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'clear'");
  }

  @Override
  public boolean contains(E element) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public boolean contains(E[] array) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public boolean contains(Collection<E> collection) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
  }

  @Override
  public boolean reverse() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'reverse'");
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }

  @Override
  public void forEach(Function<E, Void> action) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'forEach'");
  }

  @Override
  public Iterator<E> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }

}
