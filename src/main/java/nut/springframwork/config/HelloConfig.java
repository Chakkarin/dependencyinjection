package nut.springframwork.config;

import nut.springframwork.services.Factory.HelloFactory;
import nut.springframwork.services.HelloWorldService;
import nut.springframwork.services.Impl.HelloWorldServiceEnglishImpl;
import nut.springframwork.services.Impl.HelloWorldServieThaiImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by NUT_PC on 01/04/2560.
 */
@Configuration
public class HelloConfig {

    @Bean
    public HelloFactory helloFactory(){
        return new HelloFactory();
    }

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(HelloFactory factory){
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("thai")
    public HelloWorldService helloWorldServieThai(HelloFactory factory){
        return factory.createHelloWorldService("th");
    }
}
