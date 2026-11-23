package fr.cegos.projetcasse.service.impl;


import fr.cegos.projetcasse.service.Service1;
import fr.cegos.projetcasse.service.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service1Impl1 implements Service1 {
    @Autowired
    private Service2 service2;

    @Override
    public String fonctionnalite1() {
        return "Fonctionnalite1 du service 1 fonctionnelle !";
    }

    @Override
    public String fonctionnalite2() {
        return "Appel depuis le Service 1 au service 2 : " + service2.fonctionnalite2();
    }
}
