package exper.HiloAsincrono;

public class hilosAsicronosmain {

    public static void main(String[] args) {

        PruebahilosAsincronos hil1obj=new PruebahilosAsincronos("Tarea del hilo 1");
        PruebahilosAsincronos hil2obj=new PruebahilosAsincronos("Tarea del hilo 2");
        PruebahilosAsincronos hil3obj=new PruebahilosAsincronos("tarea de hilo 3");


        hil1obj.start();
        hil2obj.start();
        hil3obj.start();





    }
}
