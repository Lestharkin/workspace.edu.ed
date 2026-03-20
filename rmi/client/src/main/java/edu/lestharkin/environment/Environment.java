package edu.lestharkin.environment;

public class Environment {

  private String ip;
  private int port;
  private String serviceName;

  private static Environment instance;

  private Environment() {
    System.getProperty("config.file.path", System.getenv().getOrDefault("CONFIG_FILE_PATH", "config.properties"));

    this.ip = System.getProperty("server.ip", System.getenv().getOrDefault("SERVER_IP", "10.153.96.175"));

    this.port = Integer
        .parseInt(System.getProperty("server.port", System.getenv().getOrDefault("SERVER_PORT", "1808")));

    this.serviceName = System.getProperty("server.name", System.getenv().getOrDefault("SERVER_NAME", "tickets"));
  }

  public static Environment getInstance() {
    if (instance == null) {
      instance = new Environment();
    }
    return instance;
  }

  public String getIp() {
    return ip;
  }

  public int getPort() {
    return port;
  }

  public String getServiceName() {
    return serviceName;
  }

}
