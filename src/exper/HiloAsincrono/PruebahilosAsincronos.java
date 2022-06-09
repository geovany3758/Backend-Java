package exper.HiloAsincrono;

public class PruebahilosAsincronos extends Thread {

    private String nombretarea;

    PruebahilosAsincronos(String nombretarea){
        this.nombretarea=nombretarea;
    }

    @Override

    public void run(){

        try {
            System.out.println("Inici la tarea"+nombretarea);
            Thread.sleep(3000);
            System.out.println("fin de la ejecucion"+nombretarea);
            Thread.sleep(3000);

        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

    }
}
