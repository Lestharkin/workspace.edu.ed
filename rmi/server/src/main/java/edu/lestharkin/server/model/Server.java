package edu.lestharkin.server.model;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import edu.lestharkin.server.model.ticket.TicketInterface;
import edu.lestharkin.server.model.ticket.TicketService;

public class Server {

  private String ip;
  private int port;
  private String serviceName;
  private String uri;

  public Server(String ip, int port, String serviceName) {
    this.ip = ip;
    this.port = port;
    this.serviceName = serviceName;
    /*
     * "//localhost:1802/tickets"
     * "//10.153.60.48:1802/tickets"
     */
    this.uri = "//" + ip + ":" + port + "/" + this.serviceName;
  }

  public boolean deploy() {
    try {
      System.setProperty("java.rmi.server.hostname", ip);
      TicketInterface service = new TicketService();
      LocateRegistry.createRegistry(port);
      Naming.rebind(uri, service);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

}
