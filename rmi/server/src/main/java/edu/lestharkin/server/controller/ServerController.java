package edu.lestharkin.server.controller;

import edu.lestharkin.server.model.Server;
import edu.lestharkin.server.view.ServerView;

public class ServerController {

  Server model;
  ServerView view;

  public ServerController(Server model, ServerView view) {
    this.model = model;
    this.view = view;
  }

  public void init() {
    if (model.deploy()) {
      view.initComponents(event -> {
        view.startStatus("Server is already");
        return null;
      });
      System.out.println("Server deployed successfully.");
    } else {
      System.out.println("Failed to deploy the server.");
    }
  }

}
