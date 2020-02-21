package ch.hesge.cours634.counter;
import exception.CounterException;

public class Main {

    public static void main(String[] args) throws CounterException {
        System.out.println("Hello World!");

        /*
        Test du counter sans contrainte
         */
        System.out.println("test counter normal");
        Counter c = new Counter();

        System.out.println("etat du counter : " + c.getValue());
        // Test de l'incrémentation
        c.inc();
        System.out.println("test inc : " + c.getValue());

        // Test de step -5 et +10
        c.add(-5);
        System.out.println("test add(-5) : " + c.getValue());
        c.add(10);
        System.out.println("test add(+10) : " + c.getValue());



        /*
        Test du counter positif avec une val maximume et minimum
         */
        System.out.println();
        System.out.println("test counter avec limit");

        UpperLimitedPositiveCounter c2 = new UpperLimitedPositiveCounter(0, 5);

        System.out.println("etat du counter : " + c2.getValue());
        c2.inc();
        System.out.println("test inc : " + c2.getValue());

        System.out.println("test add(-5) : " + c2.getValue());
        try {
            c2.add(-5);

        } catch (CounterException e) {
            e.printStackTrace();
        }

        System.out.println("test add(10) : ");
        try {
            c2.add(10);

        } catch (CounterException e) {
            e.printStackTrace();
        }



        System.out.print("test add(+2) : ");
        c2.add(2);
        System.out.println(c2.getValue());


        try {
            System.out.println("test avec une valeur initial inférieur à 0..");
            UpperLimitedPositiveCounter c3 = new UpperLimitedPositiveCounter(-1, 10);
            System.out.println(c3.getValue());
        } catch (CounterException e) {
            e.printStackTrace();
        }


        System.out.println("fin du test");
    }
}
