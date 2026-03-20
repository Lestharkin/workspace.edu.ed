package edu.lestharkin;

import edu.lestharkin.client.controller.ClientController;
import edu.lestharkin.client.factory.ClientFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main() {
        try {
            ClientController client = ClientFactory.creare();
            client.init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
