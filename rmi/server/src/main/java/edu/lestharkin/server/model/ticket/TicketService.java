package edu.lestharkin.server.model.ticket;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TicketService extends UnicastRemoteObject implements TicketInterface {
  private int index = 0;
  private Ticket[] tickets = new Ticket[100];

  public TicketService() throws RemoteException {
    super();
  }

  @Override
  public Ticket register(Ticket ticket) throws RemoteException {
    tickets[index] = ticket;
    index++;
    return ticket;
  }

}
