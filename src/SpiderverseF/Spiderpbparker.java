package SpiderverseF;

import imonsh.Screen;

import java.awt.*;

public class Spiderpbparker  extends Spider_man implements Spiderpbparkerpoder{


    Spiderpbparker(int tierra, String nombre, String traje, String genero) {
        super(tierra, nombre, traje, genero);
    }

    @Override
    public void sentidoaracnido(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",20, Color.cyan);
        s.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\peterbparkeraragnid.jpg");
        s.setBounds(200,100,900,900);

    }

    @Override
    public void factordecuracion(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",20, Color.cyan);
        s.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\peterbcuracion.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void superfuerza(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",20, Color.cyan);
        s.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\peterbpelear.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void supervelocidad(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",20, Color.cyan);
        s.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\peterbvel.jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void telarañaorganiva(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",20, Color.cyan);
        s.showImage("C:\\Users\\jgeovany\\Desktop\\Backend Java\\peterbtelaraña.png");
        s.setBounds(200,100,1100,900);

    }
}

