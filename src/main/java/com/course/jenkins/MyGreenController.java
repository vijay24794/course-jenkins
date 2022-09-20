package com.course.jenkins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyGreenController {
  @Autowired
  private MyGreenService service;

  @GetMapping("/division")
  public double division(
    @RequestParam(name = "a", required = true) double a,
    @RequestParam(name = "b", required = true) double b
  ) {
    double result = 0d;

    try {
      result = service.division(a, b);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return result;
  }

  @GetMapping("/random/animal")
  public String randomAnimal() {
    return service.randomAnimal();
  }

  @GetMapping("/random/greeting")
  public String randomGreeting(
    @RequestParam(name = "name", required = true) String name,
    @RequestParam(name = "age", required = false) int age
  ) {
    return service.randomGreeting(name, age);
  }

  @GetMapping("/random/int")
  public int randomInt(@RequestParam(name = "seed", required = false) int seed) {
    return service.randomInt(seed);
  }
}
