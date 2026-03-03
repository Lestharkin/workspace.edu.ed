package edu.lestharkin.server.model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TicketService extends UnicastRemoteObject implements TicketInterface {
  private int index = 0;
  private Ticket[] tickets = new Ticket[100];

  public TicketService() throws RemoteException {
    super();
  }

  @Override
  public Ticket register(String id) throws RemoteException {
    Ticket ticket = new Ticket(id, "Ticket " + id);
    tickets[index] = ticket;
    index++;
    return ticket;
  }

}
