package edu.lestharkin;

import edu.lestharkin.app.linkedlist.singly.LinkedList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Lists");

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);

        System.out.println(list.toString());

        list.add(200);

        System.out.println(list.toString());

        list.add(3000);

        System.out.println(list.toString());

        list.add(50000);

        System.out.println(list.toString());

    }
}
