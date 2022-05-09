package com.example.eventlistener;

import com.example.eventlistener.event.RegisteredEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventService {

  final ApplicationEventPublisher publisher;

  public void hello(String name) {
    System.out.println("회원 추가 완료");
    publisher.publishEvent(new RegisteredEvent(name));
  }

}
