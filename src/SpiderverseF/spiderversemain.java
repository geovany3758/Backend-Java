package SpiderverseF;

import imonsh.Dialog;
import imonsh.Screen;

public class spiderversemain {

    public static void main(String[] args) {

        spiderverse();









    }









    public static void  spiderverse() {

        Screen screen = new Screen();
        Spidergwen spidergwen = new Spidergwen(65, "gwen", "blanco", "mujer");
        Spidermilesmorales spidermilesmorales = new Spidermilesmorales(1610, "morales", "negro", "hombre");
        Spiderpbparker spiderpbparker=new Spiderpbparker(616,"b parker","clasico","hombre");

        Runnable spwen=new Runnable() {
            @Override
            public void run() {
                try {
                    spidergwen.superfuerza(screen);
                    screen.out("\n super fuerza  spiderman");
                    Thread.sleep(5000);

                    spidergwen.sentidoaracnido(screen);
                    screen.out("\n sentido aragnido");
                    Thread.sleep(5000);

                    spidergwen.supervelocidad(screen);
                    screen.out("\n velocidad");
                    Thread.sleep(5000);

                    spidergwen.factordecuracion(screen);
                    screen.out("\n curacion acelerada");
                    Thread.sleep(5000);



                    screen.out(" \n Sigiente Spiderman");
                    Thread.sleep(5000);




                    spidermilesmorales.factordecuracion(screen);
                    screen.out("\n super fuerza  spiderman");
                    Thread.sleep(5000);

                    spidermilesmorales.sentidoaracnido(screen);
                    screen.out("\n super fuerza  spiderman");
                    Thread.sleep(5000);

                    spidermilesmorales.invisibilidad(screen);
                    screen.out("\n super fuerza  spiderman");
                    Thread.sleep(5000);

                    spidermilesmorales.supervelocidad(screen);
                    screen.out("\n super fuerza  spiderman");
                    Thread.sleep(5000);

                    spidermilesmorales.superfuerza(screen);
                    screen.out("\n super fuerza  spiderman");
                    Thread.sleep(5000);


                    spiderpbparker.factordecuracion(screen);
                    screen.out("\n super fuerza  spiderman");
                    Thread.sleep(5000);
                    spiderpbparker.sentidoaracnido(screen);
                    screen.out("\n super fuerza  spiderman");
                    Thread.sleep(5000);
                    spiderpbparker.superfuerza(screen);
                    screen.out("\n super fuerza  spiderman");
                    Thread.sleep(5000);
                    spiderpbparker.supervelocidad(screen);
                    screen.out("\n super fuerza  spiderman");
                    Thread.sleep(5000);
                    spiderpbparker.telarañaorganiva(screen);
                    screen.out("\n super fuerza  spiderman");
                    Thread.sleep(5000);




                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread powers=new Thread(spwen);
        powers.start();


    }










}
