package SpiderverseF;

import imonsh.*;

import java.awt.*;


public class Spidergwen extends Spider_man  implements Spidergwenpoderes  {


    Spidergwen(int tierra, String nombre, String traje, String genero) {
        super(tierra, nombre, traje, genero);
    }






    @Override
    public void superfuerza(Screen screenFu) {

        screenFu.setVisible(true);
        screenFu.out(showMessage(),"Helvetica",20, Color.cyan);
        screenFu.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\fuerzawen.jpg");
        screenFu.setBounds(200,100,1100,900);

    }




    @Override
    public void supervelocidad(Screen screenobjf) {
        screenobjf.cls();
        screenobjf.repaint();
        screenobjf.setVisible(true);
        screenobjf.out(showMessage(),"Helvetica",20, Color.BLUE);
        screenobjf.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\velocidadwen.jpg");
        screenobjf.setBounds(200,100,1100,900);




    }

    @Override
    public void factordecuracion(Screen screenF) {
        screenF.cls();
        screenF.repaint();
        screenF.setVisible(true);
        screenF.out(showMessage(),"Helvetica",20, Color.cyan);
        screenF.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\wencuracion.jpg");
        screenF.setBounds(200,100,1100,900);




    }

    @Override
    public void sentidoaracnido(Screen screenA) {
        screenA.cls();
        screenA.repaint();

        screenA.setVisible(true);
        screenA.out(showMessage(),"Helvetica",20, Color.cyan);
        screenA.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\wensentido.jpg");
        screenA.setBounds(200,100,1100,900);

    }



}
