package exper.HiloSincrono;

public class Pruebahilosincronos {                                              //ESTA ES SINCRONAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

    public static void tareass (String nombretarea)  {

        try {
            System.out.println("Inici la tarea"+nombretarea);
            Thread.sleep(3000);
            System.out.println("fin de la ejecucion"+nombretarea);
            Thread.sleep(3000);

        }catch (InterruptedException ie){
            ie.printStackTrace();
        }


    }


    public static void main(String[] args) {
       tareass("t1");
       tareass("t2");
       tareass("t3");



    }


}
