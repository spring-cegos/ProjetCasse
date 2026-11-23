package fr.cegos.projetcasse;

import fr.cegos.projetcasse.service.impl.Service1Impl1;
import fr.eni.service3.Service3;
import fr.eni.service3.impl.Service3Impl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    /***
     * On ajoute bean avec une instance de Service3Impl dans le contexte Spring
     */
    @Bean
    public Service3 getService3() {
        return new Service3Impl();
    }
}