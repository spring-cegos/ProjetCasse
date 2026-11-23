package fr.cegos.projetcasse;


import fr.cegos.projetcasse.service.Service1;
import fr.cegos.projetcasse.service.Service2;
import fr.eni.service3.Service3;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DisplayComponent {
    private Service1 service1;
    private Service2 service2;
    private Service3 service3;

    /**
     * Constructeur qui va faire l'injection de dépendances
     * @param service1
     * @param service2
     */
    public DisplayComponent(Service1 service1, Service2 service2, Service3 service3) {
        this.service1 = service1;
        this.service2 = service2;
        this.service3 = service3;
    }

    @PostConstruct
    public void init() {


        System.out.println("****************************************");
        System.out.println("APPEL DE LA FONCTIONNALITE 1 DU SERVICE 1");
        System.out.println(service1.fonctionnalite1());
        System.out.println("APPEL DE LA FONCTIONNALITE 2 DU SERVICE 1");
        System.out.println(service1.fonctionnalite2());
        System.out.println("APPEL DE LA FONCTIONNALITE 1 DU SERVICE 2");
        System.out.println(service2.fonctionnalite1());
        System.out.println("APPEL DE LA FONCTIONNALITE 2 DU SERVICE 2");
        System.out.println(service2.fonctionnalite2());
        System.out.println("APPEL DE LA FONCTIONNALITE 2 DU SERVICE 3");
        System.out.println(service3.fonctionnalite3());
        System.out.println("****************************************");
    }
}
