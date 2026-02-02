package edu.lestharkin;

import edu.lestharkin.app.linkedlist.node.singly.LinkedNode;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Lists");

        LinkedNode<Integer> node1 = new LinkedNode<>(2);

        LinkedNode<Integer> node2 = new LinkedNode<>(1000);

        node1.setNext(node2);

        LinkedNode<Person> node3 = new LinkedNode<>();

        node3.set(new Person("Lenin", 25));

        System.out.println(node1.toString());
        System.out.println(node2.toString());
        System.out.println(node3.toString());

    }
}
