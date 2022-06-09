package SpiderverseF;


import imonsh.Screen;

import java.awt.*;

public class Spidermilesmorales extends Spider_man implements Spimilespoderes {

    Spidermilesmorales(int tierra, String nombre, String traje, String genero) {
        super(tierra, nombre, traje, genero);
    }

    @Override
    public void supervelocidad(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",20, Color.cyan);
        s.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\velocidadmorales.gif");
        s.setBounds(200,100,1100,900);


    }

    @Override
    public void superfuerza(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",20, Color.cyan);
        s.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\milessuperfuerza.jpg");
        s.setBounds(200,100,1100,900);





    }

    @Override
    public void factordecuracion(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",20, Color.cyan);
        s.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\curacionmoraless.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void sentidoaracnido(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",20, Color.cyan);
        s.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\moralessentidoaragnido.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void invisibilidad(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",20, Color.BLUE);
        s.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\moralesinvisible.jpg");
        s.setBounds(200,100,1100,900);

    }


}
