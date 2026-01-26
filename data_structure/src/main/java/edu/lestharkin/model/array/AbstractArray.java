package edu.lestharkin.model.array;

import com.lestharkin.model.collection.AbstractCollection;
import com.lestharkin.model.iterator.Iterator;

/**
 * The Abstract Array represents a collection that supports
 * array-like operations. It implements the CollectionInterface and provides
 * additional methods for inserting, accessing, and manipulating elements at
 * specific positions in the collection.
 *
 * @param <E> the type of elements in the collection.
 * 
 * @author Lenin Javier Serrano Gil
 * @version 1.0.20240219
 */
public abstract class AbstractArray<E> extends AbstractCollection<E> implements Array<E>, BufferArray {

  @Override
  public boolean contains(E element) {
    for (Iterator<E> iterator = iterator(); iterator.hasNext();) {
      if (iterator.next().equals(element)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean contains(E[] array) {
    for (E element : array) {
      if (!contains(element)) {
        return false;
      }
    }
    return true;
  }

}
