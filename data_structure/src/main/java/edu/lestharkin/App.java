package edu.lestharkin;

import edu.lestharkin.app.hash.HashTable;

/**
 * Hello world!
 *
 */
public class App {
    public static void main() {
        System.out.println("Hash Table");

        int size = 10000;

        HashTable ht = new HashTable(size);

        for (int i = 0; i < size; i++) {
            ht.insert(i);
        }

    }
}
