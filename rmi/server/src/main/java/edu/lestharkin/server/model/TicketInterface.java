package edu.lestharkin.server.model;

import java.rmi.RemoteException;

public interface TicketInterface {
  Ticket register(String id) throws RemoteException;
}
