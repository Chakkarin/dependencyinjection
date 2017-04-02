package nut.springframwork.services.Factory;

import nut.springframwork.services.HelloWorldService;
import nut.springframwork.services.Impl.HelloWorldServiceEnglishImpl;
import nut.springframwork.services.Impl.HelloWorldServieThaiImpl;

/**
 * Created by NUT_PC on 01/04/2560.
 */
public class HelloFactory {
    public HelloWorldService createHelloWorldService(String language){
        HelloWorldService service = null;

        switch (language){
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "th":
                service = new HelloWorldServieThaiImpl();
                break;
            default: new HelloWorldServiceEnglishImpl();
        }
        return service;

    }
}
