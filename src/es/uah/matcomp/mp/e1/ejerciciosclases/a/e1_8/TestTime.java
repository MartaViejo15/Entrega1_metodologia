package es.uah.matcomp.mp.e1.ejerciciosclases.a.e1_8;

class TestTime {
    public static void main(String[] args) {
        // Test constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1); // toString()
        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1); // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());
        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1); // toString()
        // Test nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());
        // Test previousSecond()
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());

        t1.setTime(22, 59, 59);
        System.out.println(t1.nextSecond());  // 23:00:00 for only changing the hour

        // Test previousSecond()
        System.out.println(t1.previousSecond());  // 22:59:59
        t1.setTime(0, 0, 0);
        System.out.println(t1.previousSecond());  // 23:59:59 changing the day backwards
        // for minute != 60 and hour != 24
        t1.setTime(10, 30, 59);
        System.out.println(t1.nextSecond());  // 10:31:00
        // for minute != 0 and hour != 0
        t1.setTime(5, 20, 0);
        System.out.println(t1.previousSecond());  // 5:19:59
    }
}
