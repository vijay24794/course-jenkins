package com.course.jenkins;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

@Service
public class MyGreenService {
  public static final List<String> ANIMALS = List.of(
    "Dog",
    "Cat",
    "Mouse",
    "Chicken",
    "Crocodile",
    "Bear",
    "Worm",
    "Panda",
    "Cow",
    "Shark",
    "Octopus",
    "Giraffe",
    "Horse",
    "Tiger",
    "Lion",
    "Snake",
    "Rabbit",
    "Sheep",
    "Elephant"
  );

  public double division(double a, double b) {
    return a / b;
  }

  public String randomAnimal() {
    var random = ThreadLocalRandom.current().nextInt(20);

    if (random == 0) {
      return ANIMALS.get(0);
    } else if (random == 1) {
      return ANIMALS.get(1);
    } else if (random == 2) {
      return ANIMALS.get(2);
    } else if (random == 3) {
      return ANIMALS.get(3);
    } else if (random == 4) {
      return ANIMALS.get(4);
    } else if (random == 5) {
      return ANIMALS.get(5);
    } else if (random == 6) {
      return ANIMALS.get(6);
    } else if (random == 7) {
      return ANIMALS.get(7);
    } else if (random == 8) {
      return ANIMALS.get(8);
    } else if (random == 9) {
      return ANIMALS.get(9);
    } else if (random == 10) {
      return ANIMALS.get(10);
    } else if (random == 11) {
      return ANIMALS.get(11);
    } else if (random == 12) {
      return ANIMALS.get(12);
    } else if (random == 13) {
      return ANIMALS.get(13);
    } else if (random == 14) {
      return ANIMALS.get(14);
    } else if (random == 15) {
      return ANIMALS.get(15);
    } else if (random == 16) {
      return ANIMALS.get(16);
    } else if (random == 17) {
      return ANIMALS.get(17);
    } else if (random == 18) {
      return ANIMALS.get(18);
    } else {
      return ANIMALS.get(19);
    }
  }

  public String randomGreeting(String name, int age) {
    var nowHour = LocalDateTime.now().getHour();

    if (nowHour < 10) {
      return "Good morning " + name + ", nice to meet you";
    }

    if (nowHour < 16) {
      return "Good afternoon " + name + ", nice to meet you";
    }

    if (nowHour < 19) {
      return "Good evening " + name + ", nice to meet you";
    }

    return "Good night " + name + ", nice to meet you";
  }

  public int randomInt(int seed) {
    if (seed < 0) {
      return ThreadLocalRandom.current().nextInt();
    } else if (seed < 5) {
      return ThreadLocalRandom.current().nextInt();
    } else {
      return ThreadLocalRandom.current().nextInt();
    }
  }
}
