package nut.springframwork.controllers;

import javafx.scene.paint.Stop;
import nut.springframwork.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by NUT_PC on 31/03/2560.
 */
@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello(){

        String greeting = helloWorldService.getGreeting();

        System.out.println(greeting);

        return greeting;
    }
}
