package edu.lestharkin.server.controller;

import edu.lestharkin.server.model.ServerModel;
import edu.lestharkin.server.view.ServerView;

public class ServerController {

  ServerModel model;
  ServerView view;

  public ServerController(ServerModel model, ServerView view) {
    this.model = model;
    this.view = view;
  }

  public void init() {
    if (model.deploy()) {
      view.initComponents(event -> {
        view.startStatus("Server is already");
        return null;
      });
    } else {
      view.setMessage("Failed to deploy the server.");
    }
  }

}
