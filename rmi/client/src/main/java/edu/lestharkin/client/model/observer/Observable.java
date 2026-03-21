package edu.lestharkin.client.model.observer;

public interface Observable {

  public void attach(Observer observer);

  public void detach(Observer observer);

  public void notifyObservers();

}
