package fr.cegos.projetcasse.service.impl;


import fr.cegos.projetcasse.service.Service2;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class Service2Impl1 implements Service2 {

    @Override
    public String fonctionnalite1() {
        return "Fonctionnalite1 fonctionnelle !";
    }

    @Override
    public String fonctionnalite2() {
        return "Ca n'est pas cette fonctionnalité qu'il fallait appeler !!!!!!!";
    }
}
