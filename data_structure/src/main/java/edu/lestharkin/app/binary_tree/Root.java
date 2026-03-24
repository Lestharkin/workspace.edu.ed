package edu.lestharkin.app.binary_tree;

import edu.lestharkin.model.node.AbstractNode;

public class Root<E> extends AbstractNode<E> {

  Root<E> left;
  Root<E> right;

  public Root() {
    super();
    this.left = null;
    this.right = null;
  }

  public Root(E element) {
    super(element);
    this.left = null;
    this.right = null;
  }

  public Root<E> getLeft() {
    return left;
  }

  public void setLeft(Root<E> left) {
    this.left = left;
  }

  public Root<E> getRight() {
    return right;
  }

  public void setRight(Root<E> right) {
    this.right = right;
  }

  public String toString() {
    return "Root{" +
        "element=" + element +
        ", left=" + left +
        ", right=" + right +
        '}';
  }

}
