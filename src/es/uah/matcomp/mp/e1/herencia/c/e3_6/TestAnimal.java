package es.uah.matcomp.mp.e1.herencia.c.e3_6;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal("Curry");
        System.out.println(a1);
        Mammal m1 = new Mammal("Coco");
        System.out.println(m1);
        Cat c1 = new Cat("Whiskers");
        System.out.println(c1);
        c1.greets();
        Dog d1 = new Dog("Moon");
        System.out.println(d1);
        d1.greets();
        d1.greets(new Dog("Star"));

        /* ¿Puedo hacer una llamada a greets() de un animal? ¿Por qué?
        Puedo llamar a greets de un animal siempre y cuando lo haga desde
        un animal ya declarado como gato o perro, porque la clase contiene
        ese metodo. Si lo hago desde la clase Animal o Mammal, no se podría
        hacer porque no tienen el metodo greets().
         */

    }
}
