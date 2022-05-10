package com.example.eventlistener.event;

public class RegisteredEvent {

  private String name;

  private RegisteredEvent(String name) {
    this.name = name;
  }

  public static RegisteredEvent from(String name) {
    return new RegisteredEvent(name);
  }

  public String getName() {
    return name;
  }
}
