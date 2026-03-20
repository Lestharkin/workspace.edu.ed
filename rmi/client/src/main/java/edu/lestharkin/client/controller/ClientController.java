package edu.lestharkin.client.controller;

import edu.lestharkin.client.model.ClientModel;
import edu.lestharkin.client.view.ClientView;

public class ClientController {
  private ClientModel model;
  private ClientView view;

  public ClientController(ClientModel model, ClientView view) {
    this.model = model;
    this.view = view;
  }

  public void init() {
    view.initComponents(text -> {
      model.register(text);
      return null;
    });
    view.setVisible(true);
    if (model.connect()) {
      view.setMessage("Connected to server.");
    } else {
      view.setMessage("Failed to connect to server.");
    }
  }

}
