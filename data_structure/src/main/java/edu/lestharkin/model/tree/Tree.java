package edu.lestharkin.model.tree;

import edu.lestharkin.model.list.List;
import edu.lestharkin.model.node.AbstractNode;

public interface Tree<E> {

  List<E> preOrder();

  List<E> inOrder();

  List<E> postOrder();

  boolean insert(E element);

  boolean remove(E element);

  boolean search(E element);

  int getGrade();

  int getHeight();

  int size();

  double getLCI();

  double getLCIM();

  boolean isEmpty();

  boolean isFull();

  boolean isComplete();

  Tree<E> getSubtree(AbstractNode<E> root);

  Tree<E> getLeftSubtree(AbstractNode<E> root);

  Tree<E> getRightSubtree(AbstractNode<E> root);

}
