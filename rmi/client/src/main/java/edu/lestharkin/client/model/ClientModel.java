package edu.lestharkin.client.model;

import java.rmi.Naming;

import edu.lestharkin.server.model.ticket.TicketInterface;

public class ClientModel {
  private String uri;
  private TicketInterface ticketService;

  public ClientModel(String ip, int port, String serviceName) {
    this.uri = "rmi//" + ip + ":" + port + "/" + serviceName;
    this.ticketService = null;
  }

  public boolean connect() {
    try {
      this.ticketService = (TicketInterface) Naming.lookup(uri);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public TicketInterface getTicketService() {
    return ticketService;
  }
}
