package com.example.eventlistener;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventController {

  private final EventService eventService;

  @PostMapping("/register/{name}")
  public void register(@PathVariable String name) {
    eventService.hello(name);
    System.out.println("회원가입을 완료했어요");
  }
}
