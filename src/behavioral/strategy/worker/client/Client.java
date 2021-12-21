package behavioral.strategy.worker.client;

import behavioral.strategy.worker.jobs.Developer;
import behavioral.strategy.worker.jobs.HipsterDeveloper;
import behavioral.strategy.worker.jobs.Pilot;

public class Client {
    public static void main(String[] args) {

        System.out.println(">>> Developer");
        Developer developer = new Developer();
        developer.work();
        developer.transport();
        developer.eat();

        System.out.println();

        System.out.println(">>> Hipster Developer");
        HipsterDeveloper hipsterDeveloper = new HipsterDeveloper();
        hipsterDeveloper.work();
        hipsterDeveloper.transport();
        hipsterDeveloper.eat();

        System.out.println();

        System.out.println(">>> Pilot");
        Pilot pilot = new Pilot();
        pilot.work();
        pilot.transport();
        pilot.eat();
    }
}
