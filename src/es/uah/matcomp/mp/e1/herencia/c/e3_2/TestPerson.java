package es.uah.matcomp.mp.e1.herencia.c.e3_2;

public class TestPerson {
    public static void main(String[] args) {
        Student s1 = new Student("Paco", "Calle Constitución, 31", "Medicina", 2, 1500);
        System.out.println(s1);
        s1.setProgram("Enfermería");
        System.out.println("New program is: " + s1.getProgram());
        s1.setYear(1);
        System.out.println("New year is: " + s1.getYear());
        s1.setFee(1600);
        System.out.println("New fee is: " + s1.getFee());
        System.out.println("New degree info[Person[name=" + s1.getName() + ", address=" + s1.getAddress() + "], program=" + s1.getProgram() +  ", year=" + s1.getYear() + ", fee=" + s1.getFee() + "]");

        Staff s2 = new Staff("Juani", "Calle Clara Campoamor, 3", "Alvar Fáñez de Minaya", 2500);
        System.out.println(s2);
        s2.setSchool("Brianda de Mendoza");
        System.out.println("New school is: " + s2.getSchool());
        s2.setPay(3000);
        System.out.println("New pay is: " + s2.getPay());
        s2.setAddress("Julián Besteiro");
        System.out.println("New address is: " + s2.getAddress());
    }
}
