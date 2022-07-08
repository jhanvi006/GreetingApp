package com.example.greetingapp.service;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.model.User;

import java.util.List;

public interface GreetingServiceInterface {
    Greeting saveGreeting(Greeting greeting);
    Greeting getGreetingById(Integer id);
    List<Greeting> getGreetings();
    Greeting editGreeting(Greeting greeting, Integer id);
    void deleteGreeting(Integer id);
}
