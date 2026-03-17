package edu.lestharkin;

import edu.lestharkin.server.controller.ServerController;
import edu.lestharkin.server.factory.ServerFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main() {
        try {
            ServerController server = ServerFactory.create();
            server.init();
        } catch (Exception e) {
            System.err.println("Failed to start the server application: " + e.getMessage());
        }
    }
}
