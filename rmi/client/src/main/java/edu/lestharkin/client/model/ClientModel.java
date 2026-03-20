package edu.lestharkin.client.model;

import java.rmi.Naming;

import edu.lestharkin.server.model.ticket.Customer;
import edu.lestharkin.server.model.ticket.Ticket;
import edu.lestharkin.server.model.ticket.TicketInterface;

public class ClientModel {
  private String uri;
  private TicketInterface ticketService;

  public ClientModel(String ip, int port, String serviceName) {
    this.uri = "rmi://" + ip + ":" + port + "/" + serviceName;
    this.ticketService = null;
  }

  public boolean connect() {
    try {
      System.out.println("Connecting to server at: " + uri);
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

  public String register(String names) {
    try {
      Ticket ticket = new Ticket("", new Customer("1", names));
      Ticket ticketRegistered = this.getTicketService().register(ticket);
      // TODO: Notify to observers
      System.out.println("Registered with ticket: " + ticketRegistered.getId() + " for customer: "
          + ticketRegistered.getCustomerName());
      return "Registered with ticket: " + ticketRegistered.getId() + " for customer: "
          + ticketRegistered.getCustomerName();

    } catch (Exception e) {
      e.printStackTrace();
      // TODO: Notify to observers
      return "Registration failed: " + e.getMessage();
    }
  }
}
