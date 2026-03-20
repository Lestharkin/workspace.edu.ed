package edu.lestharkin.client.factory;

import edu.lestharkin.client.controller.ClientController;
import edu.lestharkin.client.model.ClientModel;
import edu.lestharkin.client.view.ClientView;
import edu.lestharkin.environment.Environment;

public class ClientFactory {

  private ClientFactory() {
  }

  public static ClientController creare() {

    Environment env = null;

    try {
      env = Environment.getInstance();
    } catch (Exception e) {
      System.err.println("Failed to initialize Environment: " + e.getMessage());
    }

    if (env == null) {
      throw new IllegalStateException("Environment is not initialized");
    }

    ClientModel model = new ClientModel(env.getIp(), env.getPort(), env.getServiceName());
    if (model == null) {
      throw new IllegalStateException("Failed to create ClientModel");
    }

    ClientView view = new ClientView();
    if (view == null) {
      throw new IllegalStateException("Failed to create ClientView");
    }

    ClientController controller = new ClientController(model, view);
    if (controller == null) {
      throw new IllegalStateException("Failed to create ClientController");
    }
    return controller;
  }
}
