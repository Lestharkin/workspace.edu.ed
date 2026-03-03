package edu.lestharkin.server.model;

public class Server {

  private String ip;
  private int port;
  private String serviceName;
  private String uri;

  public Server(String ip, int port, String serviceName, String uri) {
    this.ip = ip;
    this.port = port;
    this.serviceName = serviceName;
    /*
     * "//localhost:1802/tickets"
     * "//10.153.60.48:1802/tickets"
     */
    this.uri = uri;
  }
}
