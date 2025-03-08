package es.uah.matcomp.mp.e1.PolimorfAbstrInterf.d.e6_6;

public class AnimalTest {
    public static void main(String[] args) {
        Cat c1 = new Cat("Paquito");
        c1.greets();

        Dog d1 = new Dog("Patrick");
        Dog d2 = new Dog("Thor");
        d1.greets();
        d1.greets(d2);

        BigDog bd1 = new BigDog("Frank");
        BigDog bd2 = new BigDog("Jack");
        bd1.greets();
        bd1.greets(d1);
        bd1.greets(bd2);
    }
}
