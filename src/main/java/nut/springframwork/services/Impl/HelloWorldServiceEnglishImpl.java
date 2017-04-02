package nut.springframwork.services.Impl;

import nut.springframwork.services.HelloWorldService;


/**
 * Created by NUT_PC on 31/03/2560.
 */
//@Component
//@Profile({"english","default"})
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
