package es.uah.matcomp.mp.e1.ejerciciosclases.a.e1_8;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time nextSecond() {
        second += 1;
        if (second == 60) {  // Si los segundos llegan a 60 reseteamos y sumamos minuto
            second = 0;
            minute += 1;
            if (minute == 60) {   // Si los minutos llegan a 60 reseteamos y sumamos hora
                minute = 0;
                hour += 1;
                if (hour == 24) {   // Si las horas llegan a 24 reseteamos y ponemos 0, día nuevo
                    hour = 0;
                }
            }
        }
        return this; // Retorna la misma instancia
    }
    public Time previousSecond() {
        second -= 1;
        if (second < 0) {   // Si los segundos llegan a -1 restamos minuto
            second = 59;
            minute -= 1;
            if (minute < 0) {   // Si los minutos llegan a -1 sumamos hora
                minute = 59;
                hour -= 1;
                if (hour < 0) {   // Si las horas llegan a -1 reiniciamos a 23, día anterior
                    hour = 23;
                }
            }
        }
        return this; // Retorna la misma instancia
    }
}
